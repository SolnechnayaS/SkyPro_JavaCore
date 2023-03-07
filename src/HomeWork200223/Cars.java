package HomeWork200223;

import java.util.List;

public class Cars extends Transport<DriverCatB> {

    private BodyType bodyType;

    public Cars(String brand, String model, double engineVolume, DriverCatB driver, Transport.Type type, List <Mechanic> mechanics, BodyType bodyType) {
        super(brand, model, engineVolume, driver, type, mechanics);
        this.bodyType = bodyType;
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void diagnostics() throws TransportTypeException {
            System.out.println(this.getType() + " проходит диагностику");
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
