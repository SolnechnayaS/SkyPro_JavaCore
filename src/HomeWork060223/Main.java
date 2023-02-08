package HomeWork060223;
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("Lada", "Granta", 2015, "Россия", "желтый",140, 1.7, "", "хэчбек", "a111a777", 5);
        System.out.println(car1);
        Car car2 = new Car("Audi", "A8 50L TDI quattro",2020,"Германия", "черный", 220, 3.0, "", "", "", 0);
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 2021, "Германия", "черный", 220, 3, "", "", "", 5);
        System.out.println(car3);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 200, 2.4, "", "", "", 0);
        System.out.println(car4);
        Car car5 = new Car("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180, 1.6, "", "", "", 0);
        System.out.println(car5);
        Car car6 = new Car("", "", 0, "", "", 0, 0, "", "", "", 0);
        System.out.println(car6);


        Bus bus1 = new Bus("BMW", "Z8", 2021, "Германия", "черный", 220, "");
        System.out.println(bus1);
        Bus bus2 = new Bus("Kia", "Sportage 4-го поколения", 2018, "Южная Корея", "красный", 200, "микроавтобус");
        System.out.println(bus2);
        Bus bus3 = new Bus("Hyundai", "Avante", 2016, "Южная Корея", "оранжевый", 180, "двухэтажный");
        System.out.println(bus3);

    }
}
