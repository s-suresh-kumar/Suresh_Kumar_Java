package com.company.M2ChallengeKumarSuresh.models;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.time.LocalDateTime;
/* This class is patterned after class activity RecordsStoreController's Exception Handling Class
    CustomErrorResponse
 */
public class Magic8BallErrorResponse {
    String errMsg;
    int status;
    String errCode;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    LocalDateTime timestamp;

    public Magic8BallErrorResponse(String errMsg, String errCode) {
        this.errMsg = errMsg;
        this.errCode = errCode;
    }

    public Magic8BallErrorResponse() {
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }
}
