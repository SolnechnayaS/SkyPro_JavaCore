package HomeWork270223;

import java.util.List;

public class Trucks extends Transport<DriverCatC> {
    private Tonnage tonnage;

    public Trucks(String brand, String model, double engineVolume, DriverCatC driver, Transport.Type type, List <Mechanic> mechanics, Tonnage tonnage) {
        super(brand, model, engineVolume, driver, type, mechanics);
        this.tonnage = tonnage;
    }

    public Tonnage getTonnage() {
        return tonnage;
    }

    public void setTonnage(Tonnage tonnage) {
        this.tonnage = tonnage;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + tonnage;
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

    @Override
    public void diagnostics() throws TransportTypeException {
            System.out.println(this.getType() + " проходит диагностику");
    }
    enum Tonnage {
        N1(null, 3.5f),
        N2(3.5f,12f),
        N3(12f,null);

        private Float minTonnage;
        private Float maxTonnage;

            Tonnage(Float minTonnage, Float maxTonnage) {
                this.minTonnage = minTonnage;
                this.maxTonnage = maxTonnage;
        }

        public float getMinTonnage() {
            return minTonnage;
        }

        public void setMinTonnage(Float minTonnage) {
            this.minTonnage = minTonnage;
        }

        public float getMaxTonnage() {
            return maxTonnage;
        }

        public void setMaxTonnage(Float maxTonnage) {
            this.maxTonnage = maxTonnage;
        }


        @Override
        public String toString() {
                String tonnage = "грузоподъемность: ";
                if (minTonnage == null || minTonnage ==0) {
                    tonnage = tonnage+ "до " + maxTonnage + " тонн";
                }
                else if (maxTonnage == null || maxTonnage == 0) {
                    tonnage = tonnage + "свыше " + minTonnage + " тонн";
                }
                else {
                    tonnage = tonnage + "от " + minTonnage + " до " + maxTonnage + " тонн";
                }
            return tonnage;
        }

    }
}
