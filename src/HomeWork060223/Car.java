package HomeWork060223;

public class Car extends Transport {

    private double engineVolume;
    private double defaultEngineVolume = 3.0;
    private String transmission;
    private String defaultTransmission = "manual";
    private final String bodyType;
    private final String defaultBodyType = "sedan";
    private String regNumber;
    private String defaultRegNumber = "a000aa000";
    private final int numSeats;
    private final int defaultNumSeat = 5;

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = defaultEngineVolume;
        }
    }


    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if (transmission != null && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = defaultTransmission;
        }
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber != null && !regNumber.isBlank()) {
            this.regNumber = regNumber;
        } else {
            this.regNumber = defaultRegNumber;
        }
    }


    public int getNumSeats() {
        return numSeats;
    }

    @Override
    public String toString() {
        return "Марка: " + getBrand() + "\n" +
                "Модель: " + getModel() + "\n" +
                "Год выпуска: " + getYear() + "\n" +
                "Страна производства: " + getCountry() + "\n" +
                "Цвет: " + getColor() + "\n" +
                "Максимальная скорость: " + getMaxSpeed() + "\n" +
                "Объем двигателя: " + engineVolume + "\n" +
                "Коробка передач: " + transmission + "\n" +
                "Тип кузова: " + bodyType + "\n" +
                "Регистрационный номер: " + regNumber + "\n" +
                "Число мест: " + numSeats + "\n";
    }

    public Car(
            String brand,
            String model,
            int year,
            String country,
            String color,
            int maxSpeed,
            double engineVolume,
            String transmission,
            String bodyType,
            String regNumber,
            int numSeats) {
        super(brand, model, year, country, color, maxSpeed);
        setEngineVolume(engineVolume);
        setTransmission(transmission);

        if (bodyType != null && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        } else {
            this.bodyType = defaultBodyType;
        }

        setRegNumber(regNumber);

        if (numSeats > 0) {
            this.numSeats = numSeats;
        } else {
            this.numSeats = defaultNumSeat;
        }

    }

}
