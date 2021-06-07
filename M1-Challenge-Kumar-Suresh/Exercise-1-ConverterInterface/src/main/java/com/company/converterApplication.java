package com.company;

public class converterApplication {
    public static void main(String[] args) {
        ConverterSwitch converterSwitch = new ConverterSwitch();
        ConverterIf converterIf = new ConverterIf();

        for (int i = -1; i <= 14; i++) {
            System.out.println(converterIf.toString() + converterIf.convertMonth(i));
            System.out.println(converterSwitch.toString() + converterSwitch.convertMonth(i));
        }
        for (int i = -1; i <= 9; i++) {
            System.out.println(converterIf.toString() + converterIf.convertDay(i));
            System.out.println(converterSwitch.toString() + converterSwitch.convertDay(i));
        }
    }
}
