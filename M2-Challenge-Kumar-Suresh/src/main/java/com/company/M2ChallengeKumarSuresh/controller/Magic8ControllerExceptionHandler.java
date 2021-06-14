package com.company.M2ChallengeKumarSuresh.controller;

import com.company.M2ChallengeKumarSuresh.models.Magic8BallErrorResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class Magic8ControllerExceptionHandler {

    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    @ResponseStatus(HttpStatus.UNPROCESSABLE_ENTITY)
    public ResponseEntity<List<Magic8BallErrorResponse>> newResponseErrors(MethodArgumentNotValidException ex) {

        //BindingResult holds the validation errors
        BindingResult result = ex.getBindingResult();

        //validation errors are stored in FieldError objects
        List<FieldError> fieldErrors = result.getFieldErrors();

        //Translate the FieldErrors to MagicBallErrorResponse
        List<Magic8BallErrorResponse> errorResponseList = new ArrayList<>();

        for (FieldError fieldError : fieldErrors) {
            Magic8BallErrorResponse errResponse = new Magic8BallErrorResponse(HttpStatus.UNPROCESSABLE_ENTITY.toString(),
                    fieldError.getDefaultMessage());
            errResponse.setTimestamp(LocalDateTime.now());
            errResponse.setStatus(HttpStatus.UNPROCESSABLE_ENTITY.value());
            errorResponseList.add(errResponse);
        }

        // Create and return the ResponseEntity
        ResponseEntity<List<Magic8BallErrorResponse>> respEntity = new ResponseEntity<>(errorResponseList,
                HttpStatus.UNPROCESSABLE_ENTITY);
        return respEntity;
    }


}
