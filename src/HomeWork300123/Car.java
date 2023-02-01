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

    public static void main(String[] args) {
        Car car1 = new Car("Lada","Granta",1.7,"желтый",2015,"Россия");
        System.out.println(car1);
        Car car2 = new Car("Audi","A8 50L TDI quattro",3.0,"черный",2020,"Германия");
        System.out.println(car2);
        Car car3 = new Car("BMW","Z8",3,"черный",2021,"Германия");
        System.out.println(car3);
        Car car4 = new Car("Kia","Sportage 4-го поколения",2.4,"красный",2018,"Южная Корея");
        System.out.println(car4);
        Car car5 = new Car("Hyundai","Avante",1.6,"оранжевый",2016,"Южная Корея");
        System.out.println(car5);
        Car car6 = new Car("","",0,"",0,"");
        System.out.println(car6);

    }
}
