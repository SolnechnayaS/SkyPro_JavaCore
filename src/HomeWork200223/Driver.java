package HomeWork200223;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public abstract class Driver {
    String name;
    int stage;
    boolean driveLicense;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStage() {
        return stage;
    }

    public void setStage(int stage) {
        this.stage = stage;
    }

    public boolean isDriveLicense() {
        return driveLicense;
    }

    public void setDriveLicense(boolean driveLicense) {
        this.driveLicense = driveLicense;
    }

    @Override
    public String toString() {
        return "Водитель: " +
                "ФИО: " + name + "\t" +
                "Стаж: " + stage + "\t" +
                "Наличие водительских прав: " + driveLicense;
    }

    static Set<Driver> drivers = new HashSet<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver driver = (Driver) o;
        return stage == driver.stage && driveLicense == driver.driveLicense && name.equals(driver.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, stage, driveLicense);
    }

    public Driver(String name, int stage, boolean driveLicense) {
        this.name = name;
        this.stage = stage;
        this.driveLicense = driveLicense;
        drivers.add(this);
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();
}
