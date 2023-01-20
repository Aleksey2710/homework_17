package com.skypro.homework_17.transport;
/**
 * Грузовик.
 */

import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryC;
import com.skypro.homework_17.exceptions.NotDriverCategoryException;
import com.skypro.homework_17.types.LoadCapacity;

public class Truck extends Transport<DriverCategoryC> {
    LoadCapacity loadCapacity;

    public Truck(String brand, String model, double engineVolume, DriverCategoryC driverCategoryC, LoadCapacity loadCapacity) {
        super(brand, model, engineVolume, driverCategoryC);
        this.loadCapacity = loadCapacity;
    }

    public LoadCapacity getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(LoadCapacity loadCapacity) {
        this.loadCapacity = loadCapacity;
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

    @Override
    public void printType() {
        if (loadCapacity == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getLoadCapacity());
        }
    }

    @Override
    public boolean getDiagnosed() {
        return Math.random() > 0.5;
    }

}
