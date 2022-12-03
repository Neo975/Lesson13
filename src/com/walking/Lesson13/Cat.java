package com.walking.Lesson13;

public class Cat extends Animal {
    private Cat() {
        System.out.println("I'm an cat");
    }

    public Cat(String color) {
        this();
        System.out.println("I'm a " + color + " cat");
    }

    @Override
    protected void sound() {
        meow();
    }

    private void meow() {
        System.out.println("Meow");
    }

}
