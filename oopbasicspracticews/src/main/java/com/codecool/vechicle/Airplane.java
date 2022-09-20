package com.codecool.vechicle;

import com.codecool.FlyAble;
import com.codecool.LandAble;

public class Airplane implements FlyAble, LandAble {
    @Override
    public void fly() {
        System.out.println("I fly very high");
    }
    @Override
    public void land() {
        System.out.println("I'm on the runway");
    }
    public void callTower() {
        System.out.println("Hello tower");
    }

}
