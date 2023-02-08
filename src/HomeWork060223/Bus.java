package HomeWork060223;

public class Bus extends Transport{

    private final String klassBus;
    private final String defaultKlassBus = "minibus";

    public String getKlassBus() {
        return klassBus;
    }

    @Override
    public String toString() {
        return
                "Марка автобуса: " + getBrand() + "\n" +
                        "Модель автобуса: " + getModel() + "\n" +
                        "Год выпуска: " + getYear() + "\n" +
                        "Страна производства: " + getCountry() + "\n" +
                        "Цвет: " + getColor() + "\n" +
                        "Максимальная скорость: " + getMaxSpeed() + "\n" +
                "Класс автобуса: " + klassBus + "\n";
    }

    public Bus(String brand, String model, int year, String country, String color, int maxSpeed, String klassBus) {
        super(brand, model, year, country, color, maxSpeed);

        if (klassBus != null && !klassBus.isBlank()) {
            this.klassBus = klassBus;
        } else {
            this.klassBus = defaultKlassBus;
        }
    }
}
