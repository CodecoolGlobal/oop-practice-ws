package com.codecool.animal;

public abstract class Animal {
    private String name;
    public int foodLevel;
    public static int count = 0;

    public Animal(String name, int foodLevel) {
        this.name = name;
        this.foodLevel = foodLevel;
        count++;
    }

    public int getFoodLevel() {
        return foodLevel;
    }

    public void eat(int foodQuantity){
        foodLevel += foodQuantity;
    }

    protected String generateIntroduction() { //interface-el ellentétben lehet nem public metodusunk is itt.
        return "Hello my name is " + name;
    }

    public abstract void makeSound();

}
