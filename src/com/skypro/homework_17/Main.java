package com.skypro.homework_17;

import com.skypro.homework_17.drivers.Driver;
import com.skypro.homework_17.drivers.DriverCategoryB;
import com.skypro.homework_17.drivers.DriverCategoryC;
import com.skypro.homework_17.drivers.DriverCategoryD;
import com.skypro.homework_17.transport.Buses;
import com.skypro.homework_17.transport.Cars;
import com.skypro.homework_17.transport.Trucks;
import com.sun.jdi.connect.Transport;

public class Main {
    public static void main(String[] args) {
        DriverCategoryB ivanov = new DriverCategoryB("Иванов Иван Иванович", true, 1);
        DriverCategoryC petrov = new DriverCategoryC("Петров Петр Петрович", true, 2);
        DriverCategoryD vasilev = new DriverCategoryD("Васильев Василий Васильевич", true, 3);

        Cars hyundai = new Cars("Hyundai", "Avante", 1.6, ivanov);
        Cars lada = new Cars("Lada", "Granta", 1.7, ivanov);
        Cars audi = new Cars("Audi", "A8 50 L TDI quattro", 3.0, ivanov);
        Cars bmw = new Cars("BMW", "Z8", 3.0, ivanov);

        Trucks kamAZ = new Trucks("KamAZ", "65115", 6.7, petrov);
        Trucks mercedesBenz = new Trucks("Mercedes-Benz", "Arocs", 12.8, petrov);
        Trucks man = new Trucks("MAN", "TGS 41.400", 12.4, petrov);
        Trucks freightliner = new Trucks("Freightliner", "FLD", 14.0, petrov);

        Buses blueBird = new Buses("Blue", "Bird TC/2000", 7.0, vasilev);
        Buses volgabus = new Buses("Volgabus", "Ситиритм 12 GLE", 8.4, vasilev);
        Buses gm = new Buses("GM", "New Look bus", 9.0, vasilev);
        Buses ikarus = new Buses("Ikarus", "250", 10.7, vasilev);

        separator();
        System.out.println(man);
        man.startMoving();
        man.getBestLapTime();
        man.getMaxSpeed();
        man.getPitStop();
        man.finishMoving();

        separator();
        System.out.println(bmw);
        bmw.startMoving();
        bmw.getBestLapTime();
        bmw.getMaxSpeed();
        bmw.getPitStop();
        bmw.finishMoving();

        separator();
        System.out.println(volgabus);
        volgabus.startMoving();
        volgabus.getBestLapTime();
        volgabus.getMaxSpeed();
        volgabus.getPitStop();
        volgabus.finishMoving();

        separator();

        System.out.println("водитель " + ivanov.getFullName() + " управляет автомобилем " + bmw + " и будет участвовать в заезде.");
    }
    public static void separator() {
        System.out.println("==================================================================");
    }
}
