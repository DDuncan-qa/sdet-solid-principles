package com.qa.dip;

public class WeatherTracker {

    private String weatherConditions;

    public void setConditions(String weather) {
        this.weatherConditions = weather;
    }

    public String getConditions() {
        return weatherConditions;
    }

    public void notify(Notifier notifier) {
        notifier.alertWeatherConditions(weatherConditions);
    }
}