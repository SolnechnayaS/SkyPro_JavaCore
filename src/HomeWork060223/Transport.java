package HomeWork060223;

public class Transport {

//    «Марка»,
//            «Модель»,
//            «Год выпуска»,
//            «Страна производства»,
//            «Цвет кузова»,
//            «Максимальная скорость передвижения».

    private final String brand;
    private final String defaultBrand="default";
    private final String model;
    private final String defaultModel="default";
    private final int year;
    private final int defaultYear=2000;
    private final String country;
    private final String defaultCountry="default";
    private String color;
    private final String defaultColor="white";
    private int maxSpeed;
    private final int defaultMaxSpeed=180;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color != null &&  !color.isBlank()) {this.color = color;}
        else {this.color = defaultColor;};
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed != 0) {this.maxSpeed = maxSpeed;}
        else {this.maxSpeed = defaultMaxSpeed;};
    }

    @Override
    public String toString() {
        return
                "Марка: " + brand + "\n" +
                "Модель: " + model + "\n" +
                "Год выпуска: " + year + "\n" +
                "Страна производства: " + country + "\n" +
                "Цвет: " + color + "\n" +
                "Максимальная скорость: " + maxSpeed + "\n";
    }

    public Transport(String brand, String model, int year, String country, String color, int maxSpeed) {
        if (brand != null &&  !brand.isBlank()) {this.brand = brand;}
        else {this.brand = defaultBrand;};

        if (model != null &&  !model.isBlank()) {this.model = model;}
        else {this.model = defaultModel;};

        if (year != 0) {this.year = year;}
        else {this.year = defaultYear;};

        if (country != null &&  !country.isBlank()) {this.country = country;}
        else {this.country = defaultCountry;};

        setColor(color);
        setMaxSpeed(maxSpeed);
    }

}
