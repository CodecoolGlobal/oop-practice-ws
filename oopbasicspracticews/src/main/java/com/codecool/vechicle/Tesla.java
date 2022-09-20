package com.codecool.vechicle;

public class Tesla extends ElectricCar{
    private static final int teslaMaxRange = 300;
    private static final int teslaChargeAmount = 10;

    public Tesla(String numberPlate) {
        super(teslaMaxRange, teslaMaxRange, teslaChargeAmount, numberPlate);
    }
}
