package com.qa.dip;

public class Phone implements Notifier {

    @Override
    public void alertWeatherConditions(String weatherConditions) {
        if (weatherConditions.equals("rainy")) {
            System.out.println("It is " + weatherConditions);
        }

    }

}