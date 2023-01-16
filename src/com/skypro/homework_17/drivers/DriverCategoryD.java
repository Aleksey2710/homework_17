package com.skypro.homework_17.drivers;

/**
 * Категория D.
 */

public class DriverCategoryD extends Driver{
    public DriverCategoryD(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории D " + getFullName() + " со стажем " + getExperience() + " начал движение!");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории D " + getFullName() + " со стажем " + getExperience() + " закончил движение!");
    }

    @Override
    public void fillTheCar() {
        System.out.println("Водитель категории В " + getFullName() + " со стажем " + getExperience() + " заправляет автобус!");
    }
}
