package HomeWork270223;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class Transport<T extends Driver> implements Competing {

    private final String brand;
    private final String defaultBrand = "default";
    private final String model;
    private final String defaultModel = "default";
    private final Type type;
    private double engineVolume;
    private final double defaultEngineVolume = 3.0;

    private T driver;
    private T tonnage;

    private Mechanic mechanic;
    private List<Mechanic> mechanics = new ArrayList<>();

    public List<Mechanic> getMechanics() {
        return mechanics;
    }

    public void setMechanics(List<Mechanic> mechanics) {
        this.mechanics = mechanics;
    }

    private Set<Driver> drivers = new HashSet<>();

    public Set<Driver> getDrivers() {
        return drivers;
    }

    public void setDrivers(Set<Driver> drivers) {
        this.drivers = drivers;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume != 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = defaultEngineVolume;
        }
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public void diagnostics() throws TransportTypeException {
        if (this.getType() == Type.CAR || this.getType() == Type.TRUCK) {
            System.out.println(this.getType() + " проходит диагностику");
        } else {
            throw new TransportTypeException("Данный вид транспорта - " + this.getType() + " - не подлежит диагностике");
        }
    }

    public String toString() {
        return "тип ТС: " + type + ", " +
                "марка: " + brand + ", " +
                "модель: " + model + ", " +
                "объем двигателя: " + engineVolume + ", " +
                "водитель: " + driver + ", " +
                "обслуживают механики: " + mechanics;
    }



    public Transport(String brand, String model, double engineVolume, T driver, Type type, List <Mechanic> mechanics) {
        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = defaultBrand;
        }
        ;

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = defaultModel;
        }
        ;

        setEngineVolume(engineVolume);

        setDriver(driver);
        this.type = type;

        this.mechanics = mechanics;
    }


    enum Type {
        CAR("легковой автомобиль"),
        TRUCK("грузовой автомобиль"),
        BUS("автобус");

        private String type;


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        Type(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return type;
        }
    }

    public Type getType() {
        return type;
    }

    public void printType() {
        if (type != null) {
            System.out.println(type);
        } else {
            System.out.println("Данных по транспортному средству недостаточно");
        }
    }
}