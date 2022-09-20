package com.codecool.animal;

import com.codecool.FlyAble;

public class Bird extends Animal implements FlyAble {
    public Bird(String name, int foodLevel) {
        super(name, foodLevel);
    }

    @Override
    public void makeSound() {
        System.out.println("csip csip");
    }

    @Override
    public void fly() {
        System.out.println("I fly near ground");
    }
}
