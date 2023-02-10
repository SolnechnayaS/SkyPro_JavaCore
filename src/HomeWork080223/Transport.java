package HomeWork080223;

public abstract class Transport <T extends Driver> implements Competing {

    private final String brand;
    private final String defaultBrand = "default";
    private final String model;
    private final String defaultModel = "default";
    private double engineVolume;
    private final double defaultEngineVolume = 3.0;

    private T driver;

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

    public String toString() {
        return
                "Марка: " + brand + "\t" +
                        "Модель: " + model + "\t" +
                        "Объем двигателя: " + engineVolume;
    }

    public Transport(String brand, String model, double engineVolume, T driver) {
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
    }
}
