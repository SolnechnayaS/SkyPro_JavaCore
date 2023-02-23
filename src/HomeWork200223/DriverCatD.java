package HomeWork200223;

public class DriverCatD extends Driver {

    String catD = "D";

    public DriverCatD(String name, int stage, boolean driveLicense, String catD) {
        super(name, stage, driveLicense);
        if (catD != null && !catD.isBlank()) {
            this.catD = catD;
        } else {
            this.catD = "D";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\tКатегория: " + this.catD;
    }

    @Override
    public void startMoving() {
        System.out.println("Стартовал водитель категории D " + getName());
    }

    @Override
    public void stopMoving() {
        System.out.println("Остановился водитель категории D " + getName());
    }

    @Override
    public void refuel() {
        System.out.println("Заправляет авто водитель категории D " + getName());
    }

}
