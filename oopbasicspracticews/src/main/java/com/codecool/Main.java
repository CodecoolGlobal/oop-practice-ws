package com.codecool;

import com.codecool.animal.Animal;
import com.codecool.animal.Cat;
import com.codecool.animal.Dog;
import com.codecool.vechicle.Airplane;
import com.codecool.vechicle.Audi;
import com.codecool.vechicle.ElectricCar;
import com.codecool.vechicle.Tesla;

public class Main {
    public static void main(String[] args) {
        //Animal animal = new Animal();
        Animal bobby = new Dog("Bobby", 10);
        Animal garfield = new Cat("Garfield",15);
        bobby.eat(30);
        garfield.eat(40);
        System.out.println(bobby.getFoodLevel());
        System.out.println(garfield.getFoodLevel());
        bobby.makeSound();
        garfield.makeSound();
        Dog otherDog = new Dog("fetth4tg", 1000);
        otherDog.play();
        Dog dog = (Dog) bobby;
        dog.play();
        //dog = (Dog) garfield;
        int a = bobby.foodLevel;
        System.out.println(Animal.count);
        FlyAble flyAble = new Airplane();
        flyAble.fly();
        Airplane airplane = new Airplane();
        airplane.callTower();
        System.out.println("---------------------------------");
        ElectricCar audi = new Audi("ABC-123");
        ElectricCar tesla = new Tesla("ABE-234");

        System.out.println(audi.getAvailableRange());
        System.out.println(tesla.getAvailableRange());
        tesla.disCharge(300);
        System.out.println(tesla.getAvailableRange());
        tesla.charge();
        System.out.println(tesla.getAvailableRange());
    }
}
//Legyen egy electric car osztály amit közvetlenül sosem példányosítunk.
//ElectricCar lehet Audi és Tesla.
//audi maximum range: 450 tesla maximum range 300
//minden electric car rendelkezik rendszámmal ami konstruktorban beállítható, getterel elkérhető.
//van minden autonak egy charge metodusa ami az autó availableRange field értékét növeli ha az még nem érte el a maximum range-et
//tesla esetében a charge metodus 10-el, audi esetén 15-el növeli availableRange field értékét a charge metodus.
//van egy ChargingStation osztály ami az ott parkoló autók listáját számon tartja. parkCar(ElectricCar newCar) metodus segítségével leparkolhat egy új autó a töltöállomásra.
//van egy charge(int index) metodusa ami az adott indexen lévő autót tölti.
