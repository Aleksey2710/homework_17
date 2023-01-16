package com.skypro.homework_17.drivers;

/**
 * Категория С.
 */

public class DriverCategoryC extends Driver{
    public DriverCategoryC(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории С " + getFullName() + " со стажем " + getExperience() + " начал движение!");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории С " + getFullName() + " со стажем " + getExperience() + " закончил движение!");
    }

    @Override
    public void fillTheCar() {
        System.out.println("Водитель категории С " + getFullName() + " со стажем " + getExperience() + " заправляет грузовик!");
    }
}
