package HomeWork270223;

public class DriverCatB extends Driver {

    String catB = "B";

    public DriverCatB(String name, int stage, boolean driveLicense, String catB) {
        super(name, stage, driveLicense);

        if (catB != null && !catB.isBlank()) {
            this.catB = catB;
        } else {
            this.catB = "B";
        }
    }

    @Override
    public String toString() {
        return super.toString() + " категории: " + this.catB;
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
