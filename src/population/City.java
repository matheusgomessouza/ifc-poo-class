package population;
import java.util.*;

class City {
    String name;
    double area;
    List<Person> residents = new ArrayList<>();

    public City(String name, double area) {
        this.name = name;
        this.area = area;
    }

    public void addResident(Person p) {
        residents.add(p);
    }

    public void removeResident(Person p) {
        residents.remove(p);
    }

    public int getPopulation() {
        return residents.size();
    }
}

