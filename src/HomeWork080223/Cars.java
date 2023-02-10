package HomeWork080223;

public class Cars extends Transport  <DriverCatB>{

    public Cars(String brand, String model, double engineVolume, DriverCatB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public String toString() {
        return "Легковой автомобиль\t" + super.toString();
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
