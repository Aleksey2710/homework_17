package com.skypro.homework_17.transport;
/**
 * Автобус.
 */

import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryD;
import com.skypro.homework_17.types.CapacityBus;

public class Bus extends Transport<DriverCategoryD> {
    CapacityBus capacityBus;

    public Bus(String brand, String model, double engineVolume, DriverCategoryD driverCategoryD, CapacityBus capacityBus) {
        super(brand, model, engineVolume, driverCategoryD);
        this.capacityBus = capacityBus;
    }

    public CapacityBus getCapacityBus() {
        return capacityBus;
    }

    public void setCapacityBus(CapacityBus capacityBus) {
        this.capacityBus = capacityBus;
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

    @Override
    public void printType() {
        if (capacityBus == null) {
            System.out.println("Данных по транспортному средству недостаточно");
        } else {
            System.out.println(getCapacityBus());
        }
    }

    @Override
    public boolean getDiagnosed() {
        System.out.println("Автобус " + getBrand() + " " + getModel() + " в диагностике не нуждается!");
        return true;
    }

}
