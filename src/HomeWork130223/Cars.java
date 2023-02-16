package HomeWork130223;

public class Cars extends Transport<DriverCatB> {

    private BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, DriverCatB driver, Type type, BodyType bodyType) {
        super(brand, model, engineVolume, driver, type);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + bodyType;
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

    enum BodyType {
        SEDAN("Седан"),
        HATCHBACK("Хэтчбек"),
        COUPE("Купе"),
        ESTATE("Универсал"),
        SUV("Внедорожник"),
        CROSSOVER("Кроссовер"),
        PICKUP("Пикап"),
        VAN("Фургон"),
        MINIVAN("Минивэн");

        private String bodyType;

        BodyType(String bodyType) {
            this.bodyType = bodyType;
        }
        public String getBodyType() {
            return bodyType;
        }

        @Override
        public String toString() {
            return "тип кузова: " + bodyType;
        }
    }
}
