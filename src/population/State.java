package population;
import java.util.*;


class State {
    String name;
    List<City> cities = new ArrayList<>();

    public State(String name) {
        this.name = name;
    }

    public void addCity(City city) {
        cities.add(city);
    }

    public double getTotalArea() {
        return cities.stream().mapToDouble(c -> c.area).sum();
    }

    public int getTotalPopulation() {
        return cities.stream().mapToInt(City::getPopulation).sum();
    }
}

