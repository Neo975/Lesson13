package com.walking.Lesson13;

public class Cow extends Animal {
    private Cow() {
        System.out.println("I'm a cow");
    }

    public Cow(String color) {
        this();
        System.out.println("I'm a " + color + " cow");
    }

    @Override
    protected void sound() {
        moo();
    }

    private void moo() {
        System.out.println("Moo");
    }
}
