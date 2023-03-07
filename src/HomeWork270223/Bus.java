package HomeWork270223;

import java.util.List;

public class Bus extends Transport<DriverCatD> {
    private Capacity capacity;


    public Bus(String brand, String model, double engineVolume, DriverCatD driver, Transport.Type type, List <Mechanic> mechanics, Capacity capacity) {
        super(brand, model, engineVolume, driver, type, mechanics);
        this.capacity = capacity;
    }

    public Capacity getCapacity() {
        return capacity;
    }

    public void setCapacity(Capacity capacity) {
        this.capacity = capacity;
    }

    @Override
    public void diagnostics() throws TransportTypeException {
            throw new TransportTypeException("Данный вид транспорта - " + this.getType() + " - не подлежит диагностике");
    }

    @Override
    public String toString() {
        return super.toString() + ", " + capacity;
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
        System.out.println("Пит-стоп\t" + toString());
    }

    @Override
    public void bestLapTime() {
    }

    @Override
    public void maxSpeed() {
    }


    enum Capacity {
        ESPECIALLYSMALL(null, 10),
        SMALL(null, 25),
        AVERAGE(25, 50),
        LARGE(50, 80),
        ESPECIALLYLARGE(80, 120);

        private Integer minCapacity;
        private Integer maxCapacity;

        Capacity(Integer minCapacity, Integer maxCapacity) {
            this.minCapacity = minCapacity;
            this.maxCapacity = maxCapacity;
        }

        public Integer getMinCapacity() {
            return minCapacity;
        }

        public void setMinCapacity(Integer minCapacity) {
            this.minCapacity = minCapacity;
        }

        public Integer getMaxCapacity() {
            return maxCapacity;
        }

        public void setMaxCapacity(Integer maxCapacity) {
            this.maxCapacity = maxCapacity;
        }

        @Override
        public String toString() {
            String capacity = "вместимость: ";
            if (minCapacity == null || minCapacity == 0) {
                capacity = capacity + "до " + maxCapacity + " пассажиров";
            } else if (maxCapacity == null || maxCapacity == 0) {
                capacity = capacity + "свыше " + minCapacity + " пассажиров";
            } else {
                capacity = capacity + "от " + minCapacity + " до " + maxCapacity + " пассажиров";
            }
            return capacity;
        }


    }

}
