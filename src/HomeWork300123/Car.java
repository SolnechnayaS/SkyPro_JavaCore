package HomeWork300123;

public class Car {
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int year;
    private String country;

    Car(String brand, String model, double engineVolume, String color, int year, String country) {
        if (brand != null &&  brand != "") {this.brand = brand;}
        else {this.brand = "default";};

        if (model != null &&  model != "") {this.model = model;}
        else {this.model = "default";};

        if (engineVolume>0) {this.engineVolume = engineVolume;}
        else {this.engineVolume = 1.5;}

        if (color != null && color != "") {this.color = color;}
        else {this.color = "белый";};

        if (year>0) {this.year = year;}
        else {this.year = 2000;}

        if (country != null && country != "") {this.country = country;}
        else {this.country = "default";};
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    private void setYear(int year) {
        this.year = year;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "\nБренд  и модель: " + brand + " " + model +
                "\nОбъем двигателя: " + engineVolume + " л" +
                "\nЦвет кузова: " + color +
                "\nГод выпуска: " + year +
                "\nСтрана сборки: " + country;
    }
}
