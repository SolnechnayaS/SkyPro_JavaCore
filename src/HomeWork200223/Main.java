package HomeWork200223;

import java.util.ArrayList;
import java.util.List;

public class Main {


    public static void main(String[] args) throws TransportTypeException {

        Driver driver1 = new DriverCatB("Mashinin M.A.", 3, true, "");
        Transport car1 = new Cars("Lada", "Granta", 1.2, (DriverCatB) driver1, Transport.Type.CAR, Cars.BodyType.SEDAN);
        System.out.println(car1);
        Transport car2 = new Cars("Audi", "A8 50L TDI quattro", 3.0, (DriverCatB) driver1, Transport.Type.CAR, Cars.BodyType.HATCHBACK);
        System.out.println(car2);
        Transport car3 = new Cars("BMW", "Z8", 3.0, (DriverCatB) driver1, Transport.Type.CAR, Cars.BodyType.COUPE);
        System.out.println(car3);
//        Transport car4 = new Cars("", "", 0, (DriverCatB) driver1, Transport.Type.CAR, Cars.BodyType.SUV);
//        System.out.println(car4);
        System.out.println();

        car3.startMoving();
        car2.stopMoving();
        printInfo(car1);
        System.out.println();

        Driver driver2 = new DriverCatD("Avtobusov A.D.", 5, true, "");
        Transport bus1 = new Bus("LadaAvtobus", "Granta", 1.2, (DriverCatD) driver2, Transport.Type.BUS, Bus.Capacity.ESPECIALLYSMALL);
        System.out.println(bus1);
        Transport bus2 = new Bus("AvtobusAudi", "A8 50L TDI quattro", 3.0, (DriverCatD) driver2, Transport.Type.BUS, Bus.Capacity.SMALL);
        System.out.println(bus2);
        Transport bus3 = new Bus("BMWAvtobus", "Z8", 3.0, (DriverCatD) driver2, Transport.Type.BUS, Bus.Capacity.LARGE);
        System.out.println(bus3);
//        Transport bus4 = new Bus("", "", 0, (DriverCatD) driver2, Transport.Type.BUS, Bus.Capacity.AVERAGE);
//        System.out.println(bus4);

        System.out.println();
        bus1.startMoving();
        bus3.stopMoving();
        printInfo(bus2);
        System.out.println();

        Driver driver3 = new DriverCatC("Gruzov G.C.", 10, true, "");
        Transport truck1 = new Trucks("GruzoLada", "Granta", 1.2, (DriverCatC) driver3, Transport.Type.TRUCK, Trucks.Tonnage.N1);
        System.out.println(truck1);
        Transport truck2 = new Trucks("AudiTruck", "A8 50L TDI quattro", 3.0, (DriverCatC) driver3, Transport.Type.TRUCK, Trucks.Tonnage.N2);
        System.out.println(truck2);
        Transport truck3 = new Trucks("BMWGruzo", "Z8", 3.0, (DriverCatC) driver3, Transport.Type.TRUCK, Trucks.Tonnage.N3);
        System.out.println(truck3);
//        Transport truck4 = new Trucks("", "", 0, (DriverCatC) driver3, null, Trucks.Tonnage.N1);
//        System.out.println(truck4);

        System.out.println();
        truck3.startMoving();
        truck1.stopMoving();
        printInfo(truck2);

        System.out.println();
        truck3.printType();

        System.out.println();
//        truck4.printType();
//
//        System.out.println();
//        bus1.diagnostics();
//        car1.diagnostics();
//        truck1.diagnostics();

        try {
            bus1.diagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        try {
            car1.diagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        try {
            truck1.diagnostics();
        } catch (TransportTypeException e) {
            System.out.println(e.getMessage());
        }

        Mechanic mechanic1 = new Mechanic("Ivanov", "catB");
        Mechanic mechanic2 = new Mechanic("Petrov", "catC");
        Mechanic mechanic3 = new Mechanic("Sidorov", "catD");

        System.out.println("\nПолный список механиков, осуществляющих ТО:");
        System.out.println(Transport.mechanics);

        System.out.println("\nОчередь на ТО составляет: " + ServiceStation.queue.size() + " участников");
        System.out.println(Transport.allTransport);

        while (ServiceStation.queue.size() >0) {
            System.out.println();
            ServiceStation.checkUp(ServiceStation.queue);
        }

    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет " + transport.getType() + " " + transport.getBrand() + " и будет участвовать в заезде");

    }



}
