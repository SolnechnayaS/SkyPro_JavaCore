package HomeWork200223;

public class DriverCatC extends Driver {

    String catC = "C";

    public DriverCatC(String name, int stage, boolean driveLicense, String catC) {
        super(name, stage, driveLicense);
        if (catC != null && !catC.isBlank()) {
            this.catC = catC;
        } else {
            this.catC = "C";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\tКатегория: " + this.catC;
    }

    @Override
    public void startMoving() {
        System.out.println("Стартовал водитель категории C " + getName());
    }

    @Override
    public void stopMoving() {
        System.out.println("Остановился водитель категории C " + getName());
    }

    @Override
    public void refuel() {
        System.out.println("Заправляет авто водитель категории C " + getName());
    }

}
