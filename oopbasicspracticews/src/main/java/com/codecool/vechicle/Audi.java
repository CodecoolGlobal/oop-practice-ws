package com.codecool.vechicle;

public class Audi extends ElectricCar{
    private static final int audiMaxRange = 450;
    private static final int audiChargeAmount = 15;

    public Audi(String numberPlate) {
        super(audiMaxRange, audiMaxRange, audiChargeAmount, numberPlate);
    }
}
