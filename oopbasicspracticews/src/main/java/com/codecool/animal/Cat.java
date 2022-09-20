package com.codecool.animal;

public class Cat extends Animal{
    public Cat(String name, int foodLevel) {
        super(name, foodLevel);
    }

    @Override
    public void makeSound() {
        System.out.println(this.generateIntroduction() + " miau miau");
    }
}
