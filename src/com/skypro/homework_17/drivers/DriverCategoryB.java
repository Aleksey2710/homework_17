package com.skypro.homework_17.drivers;

import com.skypro.homework_17.categorys.Category;

/**
 * Категория В.
 */

public class DriverCategoryB extends Driver {


    public DriverCategoryB(String fullName, boolean driverLicense, int experience, Category category) {
        super(fullName, driverLicense, experience, category);
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
