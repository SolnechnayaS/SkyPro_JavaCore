package HomeWork200223;

import java.util.ArrayList;
import java.util.List;

public class Mechanic {

    String name;
    String categorie;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategorie() {
        return categorie;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    static List<Mechanic> mechanics = new ArrayList<>();
    public Mechanic(String name, String categorie) {
        this.name = name;
        this.categorie = categorie;
        mechanics.add(this);
    }

    @Override
    public String toString() {
        return "фамилия: " + name + ", " +
                "категория обслуживаемого ТС: " + categorie;
    }


}
