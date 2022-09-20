package com.codecool.vechicle;

public abstract class ElectricCar {
    private final String numberPlate;
    private final int maximumRange;
    private final int chargeAmount;
    private int availableRange;

    public ElectricCar(int maximumRange, int availableRange, int chargeAmount,  String numberPlate) {
        this.maximumRange = maximumRange;
        this.chargeAmount = chargeAmount;
        this.availableRange = availableRange;
        this.numberPlate = numberPlate;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public int getAvailableRange() {
        return availableRange;
    }

    public void charge(){
        availableRange+=chargeAmount;
        if(availableRange > maximumRange) availableRange = maximumRange;
    }

    public void disCharge(int distance){
        availableRange-=distance;
        if(availableRange < 0) availableRange = 0;
    }
}
