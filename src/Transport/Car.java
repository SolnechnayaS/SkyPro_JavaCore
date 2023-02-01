package Transport;

public class Car {
    private int counterCar = 0;
    private final String brand;
    private final String defaultBrand = "default";
    private final String model;
    private final String defaultModel = "default";
    private double engineVolume;
    private double defaultEngineVolume = 3.0;
    private String color;
    private String defaultColor = "белый";
    private final int year;
    private final int defaultYear = 2000;
    private final String country;
    private final String defaultCountry = "default";
    private String transmission;
    private String defaultTransmission = "ручная";
    private final String bodyType;
    private final String defaultBodyType = "седан";
    private String regNumber;
    private String defaultRegNumber = "a000aa000";
    private final int numSeats;
    private final int defaultNumSeat = 5;

    private Key key;
    private static boolean tires;
    // true - летние, false - зимние

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
        if (engineVolume > 0) {
            this.engineVolume = engineVolume;
        } else {
            this.engineVolume = defaultEngineVolume;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null && !color.isBlank()) {
            this.color = color;
        } else {
            this.color = defaultColor;
        }
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTrasmission(String transmission) {
        if (transmission != null && !transmission.isBlank()) {
            this.transmission = transmission;
        } else {
            this.transmission = defaultTransmission;
        }
        this.transmission = transmission;
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

    public boolean isTires() {
        return tires;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public int getCounterCar() {
        return counterCar;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        if (key == null) {
            key = new Key (false,false);
        }
        this.key = key;
    }

    @Override
    public String toString() {
        return "\nБренд  и модель: " + brand + " " + model +
                "\nОбъем двигателя: " + engineVolume + " л" +
                "\nЦвет кузова: " + color +
                "\nГод выпуска: " + year +
                "\nСтрана сборки: " + country +
                "\nКоробка передач: " + transmission +
                "\nТип кузова: " + bodyType +
                "\nРегистрационный номер: " + regNumber +
                "\nКоличество мест: " + numSeats +"\n"+
                (tires ? "Летняя":"Зимняя") + " резина" +"\n"+
                key;
    }

    Car(String brand,
        String model,
        double engineVolume,
        String color,
        int year,
        String country,
        String transmission,
        String bodyType,
        String regNumber,
        int numSeats,
        boolean tires, Key key) {

        counterCar++;

        if (brand != null && !brand.isBlank()) {
            this.brand = brand;
        } else {
            this.brand = defaultBrand;
        }

        if (model != null && !model.isBlank()) {
            this.model = model;
        } else {
            this.model = defaultModel;
        }

        setEngineVolume(engineVolume);

        setColor(color);

        if (year > 0) {
            this.year = year;
        } else {
            this.year = defaultYear;
        }

        if (country != null && !country.isBlank()) {
            this.country = country;
        } else {
            this.country = defaultCountry;
        }

        setTrasmission(transmission);

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

        this.tires = tires;
        setKey(key);
    }

    public static void changeTires(int numberMonth) {
        if (numberMonth > 4 && numberMonth < 11) {
            tires = true;
        }
        else {
            tires = false;
        }

    }

    public static class Key {
        private final boolean keylessAccess;
        private final boolean remoteEngineStart;

        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public Key(boolean keylessAccess, boolean remoteEngineStart) {
            this.keylessAccess = keylessAccess;
            this.remoteEngineStart = remoteEngineStart;
        }

        @Override
        public String toString() {
            return (keylessAccess? "бесключевой доступ":"отсутствует бесключевой доступ") +", "+(remoteEngineStart? "удаленный запуск двигателя": "отсутствует удаленный запуск ");
        }
    }

    public static void main(String[] args) {
        int month = 6;
        Car car1 = new Car("Lada", "Granta", 1.7, "желтый", 2015, "Россия", "", "", "", 0, true, null);
        System.out.println(car1);
        Car car2 = new Car("Audi", "A8 50L TDI quattro", 3.0, "черный", 2020, "Германия", "", "", "", 0, true, new Car.Key(false,true));
        System.out.println(car2);
        Car car3 = new Car("BMW", "Z8", 3, "черный", 2021, "Германия", "", "", "", 0, false, new Car.Key(true,true));
        System.out.println(car3);
        Car car4 = new Car("Kia", "Sportage 4-го поколения", 2.4, "красный", 2018, "Южная Корея", "", "", "", 0, true, new Car.Key(false,true));
        System.out.println(car4);
        Car car5 = new Car("Hyundai", "Avante", 1.6, "оранжевый", 2016, "Южная Корея", "", "", "", 0, true, new Car.Key(true,false));
        System.out.println(car5);
        Car car6 = new Car("", "", 0, "", 0, "", "", "", "", 0, false, null);
        System.out.println(car6);

        changeTires(month);
        System.out.println(car6);

    }
}
