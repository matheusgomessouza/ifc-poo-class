package population;
import java.util.*;

public class Country {
    String name;
    List<State> states = new ArrayList<>();

    public Country(String name) {
        this.name = name;
    }

    public void addState(State state) {
        states.add(state);
    }

    public double getTotalArea() {
        return states.stream().mapToDouble(State::getTotalArea).sum();
    }

    public int getTotalPopulation() {
        return states.stream().mapToInt(State::getTotalPopulation).sum();
    }
}

