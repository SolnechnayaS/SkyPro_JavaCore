package HomeWork080223;

public class Trucks extends Transport  <DriverCatC> {

    public Trucks(String brand, String model, double engineVolume, DriverCatC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Грузовой автомобиль\t" + super.toString();
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

    }

    @Override
    public void bestLapTime() {

    }

    @Override
    public void maxSpeed() {

    }
}
