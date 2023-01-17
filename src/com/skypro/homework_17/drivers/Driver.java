package com.skypro.homework_17.drivers;

import com.skypro.homework_17.categorys.Category;

/**
 * Водитель (общий для всех категорий).
 */

public abstract class Driver<C extends Category> {

    private String fullName;

    private boolean driverLicense;

    private int experience;

    private C category;

    private static final String DEFAULT_VALUE = "default";

    public Driver(String fullName, boolean driverLicense, int experience, C category) {
        setFullName(fullName);
        setDriverLicense(driverLicense);
        setExperience(experience);
        setCategory(category);
    }

    public C getCategory() {
        return category;
    }

    public void setCategory(C category) {
        if (category == null) {
            throw new IllegalArgumentException("Нужно указать категорию прав!");
        } else {
            this.category = category;
        }
    }

    public abstract void startMoving();

    public abstract void stay();

    public abstract void fillTheCar();

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.isBlank() || fullName.isEmpty()) {
            this.fullName = DEFAULT_VALUE;
        } else {
            this.fullName = fullName;
        }
    }

    public boolean isDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(boolean driverLicense) {
        this.driverLicense = driverLicense;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience < 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }
}
