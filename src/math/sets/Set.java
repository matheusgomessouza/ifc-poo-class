package math.sets;

import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Set {
    private final List<Integer> set;

    public Set(List<Integer> set) {
        this.set = new ArrayList<>(set); // Defensive copy
    }

    public List<Integer> getElements() {
        return set;
    }

    public Set union(List<Integer> setTwo) {
        List<Integer> union = Stream.of(this.set, setTwo)
                .flatMap(List::stream)
                .distinct()
                .collect(Collectors.toList());
        return new Set(union);
    }

    public Set intersection(List<Integer> setTwo) {
        List<Integer> intersection = this.set.stream()
                .filter(setTwo::contains)
                .distinct()
                .collect(Collectors.toList());
        return new Set(intersection);
    }

    public Set difference(List<Integer> setTwo) {
        List<Integer> difference = this.set.stream()
                .filter(e -> !setTwo.contains(e))
                .collect(Collectors.toList());
        return new Set(difference);
    }

    @Override
    public String toString() {
        return set.toString();
    }
}

