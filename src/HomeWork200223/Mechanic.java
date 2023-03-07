package HomeWork200223;

public class Mechanic {

    String name;
    String company;
    Transport.Type typeTransport;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Transport.Type getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(Transport.Type typeTransport) {
        this.typeTransport = typeTransport;
    }

    public Mechanic(String name, String company, Transport.Type typeTransport) {
        this.name = name;
        this.company = company;
        this.typeTransport = typeTransport;
    }

    public void maintenance() {
        System.out.println(getName() + " из компании " + getCompany() + " проводит техобслуживание");
    }

    public void carRepair() {
        System.out.println(getName() + " из компании " + getCompany() + " чинит автомобиль");
    }

    @Override
    public String toString() {
        return "фамилия: " + name + ", " +
                "организация ТО: " + company;
    }


}
