package com.skypro.homework_17.mechanic;
/**
 * Команда механиков.
 */

import com.skypro.homework_17.exceptions.NotDriverCategoryException;
import com.skypro.homework_17.transport.Transport;

import java.util.Objects;

public class Mechanic<T extends Transport> {

    private final String fullName;

    private final String company;

//    private final T transport;

    public Mechanic(String fullName, String company/*, T transport*/) {
        this.fullName = fullName;
        this.company = company;
//        this.transport = transport;
    }

    public String getFullName() {
        return fullName;
    }

    public String getCompany() {
        return company;
    }

//    public T getTransport() {
//        return transport;
//    }

    public void carryOutMaintenance(T transport) throws NotDriverCategoryException {
        if (!transport.getDiagnosed()) {
            System.out.println("Механик " + getFullName() + " из компании " + getCompany() + " проводит техобслуживание " +
                    transport.getBrand() + " " + transport.getModel());
            fixTheCar(transport);
        }
    }

    public void fixTheCar(T transport) {
        System.out.println("Механик " + getFullName() + " из компании " + getCompany() + " починил " +
                transport.getBrand() + " " + transport.getModel());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mechanic<?> mechanic = (Mechanic<?>) o;
        return Objects.equals(fullName, mechanic.fullName) && Objects.equals(company, mechanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, company);
    }

    @Override
    public String toString() {
        return fullName +
                ", из компании " + company;
    }
}
