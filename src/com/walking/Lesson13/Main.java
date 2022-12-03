package com.walking.Lesson13;

//Test for Git
//Test v2

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[3];

        animals[0] = new Cat("white");
        animals[1] = new Dog("gray");
        animals[2] = new Cow("yellow");

        for (Animal animal : animals) {
            animal.sound();
        }
    }
}
