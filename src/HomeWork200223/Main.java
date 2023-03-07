package HomeWork200223;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static HomeWork200223.ServiceStation.addCarToQueue;
import static HomeWork200223.ServiceStation.checkUp;

public class Main {


    public static void main(String[] args) throws TransportTypeException {

        List<Transport> allTransport = new ArrayList<>();
        Queue<Transport> queue = new LinkedList<>();

        Mechanic mechanic1 = new Mechanic("Petr Ivanov", "STO4", Transport.Type.CAR);
        Mechanic mechanic2 = new Mechanic("Ivan Petrov", "STO4", Transport.Type.TRUCK);
        Mechanic mechanic3 = new Mechanic("Sergey Sidorov", "STO4", Transport.Type.BUS);
        Mechanic mechanic4 = new Mechanic("Petr Ivanov", "STO4", Transport.Type.CAR);
        Mechanic mechanic5 = new Mechanic("Sergey Petrov", "STO4", Transport.Type.TRUCK);
        Mechanic mechanic6 = new Mechanic("Ivan Sidorov", "STO4", Transport.Type.BUS);

        Driver driver1 = new DriverCatB("Mashinin M.A.", 3, true, "");
        Transport car1 = new Cars("Lada", "Granta", 1.2, (DriverCatB) driver1, Transport.Type.CAR, List.of(mechanic1, mechanic4), Cars.BodyType.SEDAN);
        System.out.println(car1);
        allTransport.add(car1);
        Transport car2 = new Cars("Audi", "A8 50L TDI quattro", 3.0, (DriverCatB) driver1, Transport.Type.CAR, List.of(mechanic1), Cars.BodyType.HATCHBACK);
        System.out.println(car2);
        allTransport.add(car2);
        Transport car3 = new Cars("BMW", "Z8", 3.0, (DriverCatB) driver1, Transport.Type.CAR, List.of(mechanic4), Cars.BodyType.COUPE);
        System.out.println(car3);
        allTransport.add(car3);
        System.out.println();

        Driver driver2 = new DriverCatD("Avtobusov A.D.", 5, true, "");
        Transport bus1 = new Bus("LadaAvtobus", "Granta", 1.2, (DriverCatD) driver2, Transport.Type.BUS, List.of(mechanic3, mechanic6), Bus.Capacity.ESPECIALLYSMALL);
        System.out.println(bus1);
        allTransport.add(bus1);
        Transport bus2 = new Bus("AvtobusAudi", "A8 50L TDI quattro", 3.0, (DriverCatD) driver2, Transport.Type.BUS, List.of(mechanic3), Bus.Capacity.SMALL);
        System.out.println(bus2);
        allTransport.add(bus2);
        Transport bus3 = new Bus("BMWAvtobus", "Z8", 3.0, (DriverCatD) driver2, Transport.Type.BUS, List.of(mechanic6), Bus.Capacity.LARGE);
        System.out.println(bus3);
        allTransport.add(bus3);
        System.out.println();

        Driver driver3 = new DriverCatC("Gruzov G.C.", 10, true, "");
        Transport truck1 = new Trucks("GruzoLada", "Granta", 1.2, (DriverCatC) driver3, Transport.Type.TRUCK, List.of(mechanic2), Trucks.Tonnage.N1);
        System.out.println(truck1);
        allTransport.add(truck1);
        Transport truck2 = new Trucks("AudiTruck", "A8 50L TDI quattro", 3.0, (DriverCatC) driver3, Transport.Type.TRUCK, List.of(mechanic5), Trucks.Tonnage.N2);
        System.out.println(truck2);
        allTransport.add(truck2);
        Transport truck3 = new Trucks("BMWGruzo", "Z8", 3.0, (DriverCatC) driver3, Transport.Type.TRUCK, List.of(mechanic2, mechanic5), Trucks.Tonnage.N3);
        System.out.println(truck3);
        allTransport.add(truck3);
        System.out.println();

        System.out.println("Полный список автомобилей участвующих в гонках: " + allTransport.size() + " шт.");
        System.out.println(allTransport);
        System.out.println();

        mechanic1.maintenance();
        mechanic2.carRepair();

        printInfoPersons(car1);
        printInfoPersons(truck1);

//        try {
//            bus1.diagnostics();
//        } catch (TransportTypeException e) {
//            System.out.println(e.getMessage());
//        }


//        System.out.println("\nПолный список механиков, осуществляющих ТО:");
//        System.out.println(Transport.mechanics);


        addCarToQueue(queue, bus1);
        addCarToQueue(queue, bus2);
        addCarToQueue(queue, car1);
        addCarToQueue(queue, bus3);
        addCarToQueue(queue, truck1);

        System.out.println("\nОчередь на ТО составляет: " + queue.size() + " участников");
        System.out.println(queue);


        while (queue.size() > 0) {
            System.out.println();
            checkUp(queue);
        }


    }

    public static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет " + transport.getType() + " " + transport.getBrand() + " и будет участвовать в заезде");

    }

    public static void printInfoPersons(Transport<?> transport) {
        System.out.println("Автомобилем " + transport.getType() + " " + transport.getBrand() + " управляет водитель " + transport.getDriver().getName() + ", обслуживают механики:" + transport.getMechanics());

    }


}
