package com.skypro.homework_17.transport;

import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryC;

public class Trucks extends Transport<DriverCategoryC> {

    public Trucks(String brand, String model, double engineVolume, DriverCategoryC driverCategoryC) {
        super(brand, model, engineVolume, driverCategoryC);
    }

    @Override
    public void startMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. начал движение!");
    }

    @Override
    public void finishMoving() {
        System.out.println("Грузовик " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. закончил движение!");
    }
}
