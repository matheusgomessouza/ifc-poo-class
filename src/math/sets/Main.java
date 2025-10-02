package math.sets;

import java.util.List;

public class Main {
    static void main() {
        Set set1 = new Set(List.of(1, 2, 3));
        Set set2 = new Set(List.of(3, 4, 5));

        Set union = set1.union(set2.getElements());
        Set intersection = set1.intersection(set2.getElements());
        Set difference = set1.difference(set2.getElements());

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Difference: " + difference);
    }
}


