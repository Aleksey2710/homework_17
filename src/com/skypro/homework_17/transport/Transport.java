package com.skypro.homework_17.transport;
/**
 * Транспорт (общий для всех видов машин).
 */

import com.skypro.homework_17.Competing;
import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.exceptions.NotDriverCategoryException;
import com.skypro.homework_17.mechanic.Mechanic;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public abstract class Transport<D extends Driver> implements Competing {

    private String brand;
    private String model;
    private double engineVolume;

    private final D driver;

    private final List<Driver<?>> drivers;
    private final List<Mechanic<?>> mechanics;

    private static final String DEFAULT_VALUE = "default";
    private static final double DEFAULT_ENGINE_VOLUME = 1.5;

    public abstract void startMoving();

    public abstract void finishMoving();

    public Transport(String brand, String model, double engineVolume, D driver) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
        this.driver = driver;
        drivers = new LinkedList<>();
        mechanics = new LinkedList<>();

    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = DEFAULT_VALUE;
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = DEFAULT_VALUE;
        } else {
            this.model = model;
        }
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume < 0) {
            this.engineVolume = Math.abs(engineVolume);
        } else if (engineVolume == 0) {
            this.engineVolume = DEFAULT_ENGINE_VOLUME;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    @Override
    public void getPitStop() {
        System.out.println(getBrand() + " " + getModel() + " остановился на пит-стоп!");
    }

    @Override
    public void getBestLapTime() {
        int minTime = 300;
        int maxTime = 500;
        int bestLapTime = (int)(minTime + (maxTime - minTime) * Math.random());
        System.out.println("Лучшее время круга у " + getBrand() + " " + getModel() + " равно - " + bestLapTime + " секунд.");
    }

    @Override
    public void getMaxSpeed() {
        int minSpeed = 60;
        int maxSpeed = 200;
        int bestMaxSpeed = (int)(minSpeed + (maxSpeed - minSpeed) * Math.random());
        System.out.println("Максимальная скорость у " + getBrand() + " " + getModel() + " равна - " + bestMaxSpeed + " км/ч.");
    }

    public D getDriver() {
        return driver;
    }

    public abstract void printType();

    public abstract boolean getDiagnosed() throws NotDriverCategoryException;

//    public void addMechanic(Mechanic<?> mechanic) {
//        mechanics.add(mechanic);
//    }
//    public void addDriver(Driver<?> driver) {
//        drivers.add(driver);
//    }

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mechanic<?>> getMechanics() {
        return mechanics;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transport<?> transport = (Transport<?>) o;
        return Double.compare(transport.engineVolume, engineVolume) == 0 && Objects.equals(brand, transport.brand) && Objects.equals(model, transport.model) && Objects.equals(driver, transport.driver);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Транспорт " + getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
