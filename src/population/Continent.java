package population;
import java.util.*;


class Continent {
    String name;
    List<Country> countries = new ArrayList<>();

    public Continent(String name) {
        this.name = name;
    }

    public void addCountry(Country country) {
        countries.add(country);
    }

    public double getTotalArea() {
        return countries.stream().mapToDouble(Country::getTotalArea).sum();
    }

    public int getTotalPopulation() {
        return countries.stream().mapToInt(Country::getTotalPopulation).sum();
    }
}
