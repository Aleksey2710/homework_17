package com.skypro.homework_17.transport;
/**
 * Автомобиль.
 */

import com.skypro.homework_17.drivers.DriverCategoryB;
import com.skypro.homework_17.types.BodyType;

public class Car extends Transport<DriverCategoryB> {

    private BodyType bodyType;

    public Car(String brand, String model, double engineVolume, DriverCategoryB driverCategoryB, BodyType bodyType) {
        super(brand, model, engineVolume, driverCategoryB);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
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

    @Override
    public void printType() {
        if (bodyType == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getBodyType());
        }
    }
}
