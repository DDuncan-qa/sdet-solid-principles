package com.qa.dip;

public class Email implements Notifier {

    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equals("sunny")) {
            System.out.println("It is " + weatherConditions);
        }

    }

}