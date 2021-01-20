package com.qa.dip;

public class Smartwatch implements Notifier {

    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equals("snowy")) {
            System.out.println("It is " + weatherConditions);
        }

    }

}
