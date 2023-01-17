package com.skypro.homework_17;
/**
 * Гоночный заезд.
 */

import com.skypro.homework_17.categorys.Category;
import com.skypro.homework_17.categorys.CategoryB;
import com.skypro.homework_17.categorys.CategoryC;
import com.skypro.homework_17.categorys.CategoryD;
import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryB;
import com.skypro.homework_17.drivers.DriverCategoryC;
import com.skypro.homework_17.drivers.DriverCategoryD;
import com.skypro.homework_17.exceptions.NotDriverCategoryException;
import com.skypro.homework_17.transport.Bus;
import com.skypro.homework_17.transport.Car;
import com.skypro.homework_17.transport.Transport;
import com.skypro.homework_17.transport.Truck;
import com.skypro.homework_17.types.BodyType;
import com.skypro.homework_17.types.CapacityBus;
import com.skypro.homework_17.types.LoadCapacity;

public class Main {
    public static void main(String[] args) {

        DriverCategoryB ivanov = new DriverCategoryB("Иванов Иван Иванович", true, 1, new CategoryB("категория В"));
        DriverCategoryC petrov = new DriverCategoryC("Петров Петр Петрович", true, 2, new CategoryC("категория С"));
        DriverCategoryD vasilev = new DriverCategoryD("Васильев Василий Васильевич", true, 3, new CategoryD("категория D"));

        Car hyundai = new Car("Hyundai", "Avante", 1.6, ivanov, BodyType.SEDAN);
        Car lada = new Car("Lada", "Granta", 1.7, ivanov, BodyType.HATCHBACK);
        Car audi = new Car("Audi", "A8 50 L TDI quattro", 3.0, ivanov, BodyType.COUPE);
        Car bmw = new Car("BMW", "Z8", 3.0, ivanov, BodyType.UNIVERSAL);

        Truck kamAZ = new Truck("KamAZ", "65115", 6.7, petrov, LoadCapacity.N1);
        Truck mercedesBenz = new Truck("Mercedes-Benz", "Arocs", 12.8, petrov, LoadCapacity.N2);
        Truck man = new Truck("MAN", "TGS 41.400", 12.4, petrov, LoadCapacity.N3);
        Truck freightliner = new Truck("Freightliner", "FLD", 14.0, petrov, LoadCapacity.N3);

        Bus blueBird = new Bus("Blue", "Bird TC/2000", 7.0, vasilev, CapacityBus.SMALL);
        Bus volgabus = new Bus("Volgabus", "Ситиритм 12 GLE", 8.4, vasilev, CapacityBus.BIG);
        Bus gm = new Bus("GM", "New Look bus", 9.0, vasilev, CapacityBus.MIDDLE);
        Bus ikarus = new Bus("Ikarus", "250", 10.7, vasilev, CapacityBus.VERY_BIG);


        printAllInfo(bmw);
        printAllInfo(hyundai);
        printAllInfo(lada);
        printAllInfo(audi);

        printAllInfo(kamAZ);
        printAllInfo(mercedesBenz);
        printAllInfo(man);
        printAllInfo(freightliner);

        printAllInfo(blueBird);
        printAllInfo(volgabus);
        printAllInfo(ikarus);
        printAllInfo(gm);

        getLicense(bmw, hyundai, lada, audi,
                kamAZ, mercedesBenz, man, freightliner,
                blueBird, volgabus, ikarus, gm);
    }

    public static void separator() {
        System.out.println("==================================================================");
    }

    public static void printInfo(com.skypro.homework_17.transport.Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " + transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде.");
    }

    public static void printAllInfo(com.skypro.homework_17.transport.Transport<?> transport) {
        separator();
        System.out.println(transport);
        transport.printType();
        separator();
        transport.startMoving();
        transport.getBestLapTime();
        transport.getMaxSpeed();
        transport.getPitStop();
        transport.finishMoving();
        separator();
        printInfo(transport);
        separator();
    }

    public static void getLicense(Transport... transports) {
        int counts = 0;
        for (Transport transport : transports) {
            service(transport);
            counts++;
        }
        System.out.println(counts);
    }

    public static void service(Transport transport) {
        try {
            if (!transport.getDiagnosed()) {
                throw new NotDriverCategoryException("Транспорт " + transport.getBrand() + " " +
                        transport.getModel() + " диагностику не прошел!");
            }
        } catch (NotDriverCategoryException e) {
            System.out.println(e.getMessage());
        }
    }
}
