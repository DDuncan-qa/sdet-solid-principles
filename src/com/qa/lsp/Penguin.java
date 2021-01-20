package com.qa.lsp;

public class Penguin extends FlightlessBird {

    @Override
    public void flap() {
        System.out.println("I'm not flying, I'm just shaking my wings");
    }

    @Override
    public void hangGlide() {
        System.out.println("Put on your helmet, it's gonna be awesome!");

    }
}