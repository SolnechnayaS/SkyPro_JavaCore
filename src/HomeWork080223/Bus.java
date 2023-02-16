package HomeWork080223;

public class Bus extends Transport<DriverCatD> {
    public Bus(String brand, String model, double engineVolume, DriverCatD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Автобус\t" + super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Стартовал\t" + toString());
    }

    @Override
    public void stopMoving() {
        System.out.println("Остановился\t" + toString());
    }

    @Override
    public void pitStop() {
        System.out.println("Пит-стоп\t" + toString());
    }

    @Override
    public void bestLapTime() {
    }

    @Override
    public void maxSpeed() {
    }

}
