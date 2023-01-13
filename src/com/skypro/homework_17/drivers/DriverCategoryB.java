package com.skypro.homework_17.drivers;

public class DriverCategoryB extends Driver{
    public DriverCategoryB(String fullName, boolean driverLicense, int experience) {
        super(fullName, driverLicense, experience);
    }

    @Override
    public void startMoving() {
        System.out.println("Водитель категории В " + getFullName() + " со стажем " + getExperience() + " начал движение!");
    }

    @Override
    public void stay() {
        System.out.println("Водитель категории В " + getFullName() + " со стажем " + getExperience() + " закончил движение!");
    }

    @Override
    public void fillTheCar() {
        System.out.println("Водитель категории В " + getFullName() + " со стажем " + getExperience() + " заправляет автомобиль!");
    }
}
