package HomeWork200223;

public class DriverCatB extends Driver {

    String catB = "B";

    public DriverCatB(String name, int stage, boolean driveLicense, String catB) {
        super(name, stage, driveLicense);
        this.catB = catB;
    }

    @Override
    public String toString() {
        return super.toString() + "\tКатегория: " + this.catB;
    }

    @Override
    public void startMoving() {
        System.out.println("Стартовал водитель категории В " + getName());
    }

    @Override
    public void stopMoving() {
        System.out.println("Остановился водитель категории В " + getName());
    }

    @Override
    public void refuel() {
        System.out.println("Заправляет авто водитель категории В " + getName());
    }

}
