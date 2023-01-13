package com.skypro.homework_17.drivers;

public abstract class Driver {

    private String fullName;

    private boolean driverLicense;

    private int experience;

    private static final String DEFAULT_VALUE = "default";

    public Driver(String fullName, boolean driverLicense, int experience) {
        setFullName(fullName);
        setDriverLicense(driverLicense);
        setExperience(experience);
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
        if (driverLicense == true) {
            this.driverLicense = driverLicense;
        } else {
            System.out.println("Водитель не может участвовать в гонках, т.к. нет водительских прав!");
        }
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
