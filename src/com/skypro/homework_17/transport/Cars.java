package com.skypro.homework_17.transport;

import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryB;

public class Cars extends Transport<DriverCategoryB> {

    public Cars(String brand, String model, double engineVolume, DriverCategoryB driverCategoryB) {
        super(brand, model, engineVolume, driverCategoryB);
    }

    @Override
    public void startMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. начал движение!");
    }

    @Override
    public void finishMoving() {
        System.out.println("Автомобиль " + getBrand() + " " + getModel() + " с объемом двигателя - "
                + getEngineVolume() + " л. закончил движение!");
    }
}
