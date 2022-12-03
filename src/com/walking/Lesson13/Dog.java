package com.walking.Lesson13;

public class Dog extends Animal {
    private Dog() {
        System.out.println("I'm an dog");
    }

    public Dog(String color) {
        this();
        System.out.println("I'm a " + color + " dog");
    }

    @Override
    protected void sound() {
        woof();
    }

    private void woof() {
        System.out.println("Woof");
    }

}
