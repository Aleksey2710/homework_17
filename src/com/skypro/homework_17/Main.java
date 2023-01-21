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
import com.skypro.homework_17.mechanic.Mechanic;
import com.skypro.homework_17.transport.Bus;
import com.skypro.homework_17.transport.Car;
import com.skypro.homework_17.transport.Transport;
import com.skypro.homework_17.transport.Truck;
import com.skypro.homework_17.types.BodyType;
import com.skypro.homework_17.types.CapacityBus;
import com.skypro.homework_17.types.LoadCapacity;

import java.util.*;

public class Main {
    public static void main(String[] args) throws NotDriverCategoryException {
        long before = System.currentTimeMillis();

        DriverCategoryB ivanov = new DriverCategoryB("Иванов Иван Иванович", true, 1,
                new CategoryB("В"));
        DriverCategoryC petrov = new DriverCategoryC("Петров Петр Петрович", true, 2,
                new CategoryC("С"));
        DriverCategoryD vasilev = new DriverCategoryD("Васильев Василий Васильевич", true, 3,
                new CategoryD("D"));

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

        Mechanic<Car> mike = new Mechanic<>("Mike Lasovsky", "\"Monsters Co\""/*, bmw*/);
        Mechanic<Car> bob = new Mechanic<>("Bob Dillan", "\"Motor H\""/*, hyundai*/);
        Mechanic<Car> bill = new Mechanic<>("Bill Turner", "\"LadaDead\""/*, lada*/);
        Mechanic<Car> arnold = new Mechanic<>("Arnold Shwarzeneger", "\"Olimpic\""/*, audi*/);


        bmw.getMechanics().add(mike);
        bmw.getMechanics().add(new Mechanic<Car>("Fill Konors", "\"Monsters Co\""));
        bmw.getDrivers().add(ivanov);
        bmw.getDrivers().add(new DriverCategoryB("Штурман Петр", true, 1,
                new CategoryB("В")));

        lada.getMechanics().add(bill);
        lada.getMechanics().add(new Mechanic<Car>("Kurt Russel", "\"LadaDead\""));
        lada.getDrivers().add(new DriverCategoryB("Водитель Лада", true, 3,
                new CategoryB("В")));
        lada.getDrivers().add(new DriverCategoryB("Штурман Лада", true, 2,
                new CategoryB("В")));

        hyundai.getMechanics().add(bob);
        hyundai.getMechanics().add(new Mechanic<Car>("Michael Jackson", "\"Motor H\""));
        hyundai.getDrivers().add(new DriverCategoryB("Водитель Хюндай", true, 4,
                new CategoryB("В")));
        hyundai.getDrivers().add(new DriverCategoryB("Штурман Хюндай", true, 3,
                new CategoryB("В")));

        audi.getMechanics().add(arnold);
        audi.getMechanics().add(new Mechanic<Car>("Brus Willis", "\"Olimpic\""));
        audi.getDrivers().add(new DriverCategoryB("Водитель Ауди", true, 8,
                new CategoryB("В")));
        audi.getDrivers().add(new DriverCategoryB("Штурман Ауди", true, 6,
                new CategoryB("В")));

        kamAZ.getMechanics().add(new Mechanic<Truck>("Rob Shnider", "\"KAMAZ Co\""));
        kamAZ.getMechanics().add(new Mechanic<Truck>("Leo Nardo", "\"KAMAZ Co\""));
        kamAZ.getDrivers().add(petrov);
        kamAZ.getDrivers().add(new DriverCategoryC("Штурман Камаз", true, 1,
                new CategoryC("C")));

        mercedesBenz.getMechanics().add(new Mechanic<Truck>("Stan Li", "\"MB Co\""));
        mercedesBenz.getMechanics().add(new Mechanic<Truck>("Leo Nardo", "\"MB Co\""));
        mercedesBenz.getDrivers().add(new DriverCategoryC("Водитель МБ", true, 5,
                new CategoryC("C")));
        mercedesBenz.getDrivers().add(new DriverCategoryC("Штурман МБ", true, 4,
                new CategoryC("C")));

        man.getMechanics().add(new Mechanic<Truck>("Elvis Presley", "\"MAN Co\""));
        man.getMechanics().add(new Mechanic<Truck>("Matt Dimon", "\"MAN Co\""));
        man.getDrivers().add(new DriverCategoryC("Водитель Ман", true, 6,
                new CategoryC("C")));
        man.getDrivers().add(new DriverCategoryC("Штурман Ман", true, 5,
                new CategoryC("C")));

        freightliner.getMechanics().add(new Mechanic<Truck>("Tom Crus", "\"Freightliner Co\""));
        freightliner.getMechanics().add(new Mechanic<Truck>("Jack Nicolson", "\"Freightliner Co\""));
        freightliner.getDrivers().add(new DriverCategoryC("Водитель Фрай", true, 6,
                new CategoryC("C")));
        freightliner.getDrivers().add(new DriverCategoryC("Штурман Фрай", true, 5,
                new CategoryC("C")));

        blueBird.getMechanics().add(new Mechanic<Bus>("Механик Блуберд 1", "\"Blue Co\""));
        blueBird.getMechanics().add(new Mechanic<Bus>("Механик Блуберд 2", "\"Blue Co\""));
        blueBird.getDrivers().add(vasilev);
        blueBird.getDrivers().add(new DriverCategoryD("Штурман Блуберд", true, 5,
                new CategoryD("D")));

        ikarus.getMechanics().add(new Mechanic<Bus>("Механик Икарус 1", "\"Ikarus Co\""));
        ikarus.getMechanics().add(new Mechanic<Bus>("Механик Икарус 2", "\"Ikarus Co\""));
        ikarus.getDrivers().add(new DriverCategoryD("Водитель Икарус", true, 8,
                new CategoryD("D")));
        ikarus.getDrivers().add(new DriverCategoryD("Штурман Икарус", true, 9,
                new CategoryD("D")));

        gm.getMechanics().add(new Mechanic<Bus>("Механик Джим 1", "\"GM Co\""));
        gm.getMechanics().add(new Mechanic<Bus>("Механик Джим 2", "\"GM Co\""));
        gm.getDrivers().add(new DriverCategoryD("Водитель Джим", true, 8,
                new CategoryD("D")));
        gm.getDrivers().add(new DriverCategoryD("Штурман Джим", true, 9,
                new CategoryD("D")));

        volgabus.getMechanics().add(new Mechanic<Bus>("Механик Волга 1", "\"Volga\""));
        volgabus.getMechanics().add(new Mechanic<Bus>("Механик Волга 2", "\"Volga\""));
        volgabus.getDrivers().add(new DriverCategoryD("Водитель Волга", true, 10,
                new CategoryD("D")));
        volgabus.getDrivers().add(new DriverCategoryD("Штурман Волга", true, 11,
                new CategoryD("D")));


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

        List<Transport<?>> transports = List.of(bmw, hyundai, lada, audi,
                kamAZ, mercedesBenz, man, freightliner,
                blueBird, volgabus, ikarus, gm);

        for (Transport<?> transport : transports) {
            if (!transport.getDiagnosed()) {
                transport.getPitStop();
                separator();
            } else {
                printDriverAndMechanic(transport);
                separator();
            }
        }

        Set<Transport<?>> transportsSet = Set.of(bmw, hyundai, lada, audi,
                kamAZ, mercedesBenz, man, freightliner,
                blueBird, volgabus, ikarus, gm);

        for (Transport<?> transport : transportsSet) {
            System.out.println(transport);
        }

        Map<Transport<?>, Mechanic<?>> mechanicMap = new HashMap<>();
        mechanicMap.put(bmw, mike);
        System.out.println(mechanicMap.get(bmw));


        long after = System.currentTimeMillis();
        System.out.println("Время выполнения программы в миллисекундах равно " + (after - before) + " миллисекунд");
    }

    public static void printDriverAndMechanic(Transport<?> transport) {
        System.out.println("Информация по транспорту " + transport.getBrand() + " " + transport.getModel() + " :");
        System.out.println("Водители - " + transport.getDrivers());
        System.out.println("Механики - " + transport.getMechanics());
    }


    public static void separator() {
        System.out.println("==================================================================");
    }

    public static void printInfo(com.skypro.homework_17.transport.Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getFullName() + " управляет автомобилем " +
                transport.getBrand() + " " + transport.getModel() + " и будет участвовать в заезде.");
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

    public static void getLicense(Transport<?>... transports) {
        int counts = 0;
        for (Transport<?> transport : transports) {
            service(transport);
            counts++;
        }
        System.out.println(counts);
    }

    public static void service(Transport<?> transport) {
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
