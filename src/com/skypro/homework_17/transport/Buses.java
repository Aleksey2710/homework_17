package com.skypro.homework_17.transport;

import com.skypro.homework_17.drivers.DriverCategoryD;

public class Buses extends Transport<DriverCategoryD>{

    public Buses(String brand, String model, double engineVolume, DriverCategoryD driverCategoryD) {
        super(brand, model, engineVolume, driverCategoryD);
    }

    @Override
    public void startMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. начал движение!");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. закончил движение!");
    }
}
