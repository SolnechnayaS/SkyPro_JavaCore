package HomeWork150223;

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

    public Driver(String name, int stage, boolean driveLicense) {
        this.name = name;
        this.stage = stage;
        this.driveLicense = driveLicense;
    }

    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void refuel();
}
