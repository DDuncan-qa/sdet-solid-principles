package com.qa.lsp;

public class Owl extends FlyingBird {

    @Override
    public void fly() {
        System.out.println("I'm flying woo!");
        setAltitude(getAltitude() + 1000);
    }

}
