package com.qa.lsp;

public class Animal {

    public void learnToFly(FlyingBird flyingBird) {
        flyingBird.fly();
    }

    public void learnToHangglide(FlightlessBird flightlessBird) {
        flightlessBird.hangGlide();
    }

    public void keepOnFlapping(FlightlessBird flightlessBird) {
        flightlessBird.flap();
    }

}