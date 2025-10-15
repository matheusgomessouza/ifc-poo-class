package population;

public class Main {
     static void main() {
        City blumenau = new City("Blumenau", 519.8);
        City joinville = new City("Joinville", 1120.0);

        State santaCatarina = new State("Santa Catarina");
        santaCatarina.addCity(blumenau);
        santaCatarina.addCity(joinville);

        Country brazil = new Country("Brazil");
        brazil.addState(santaCatarina);

        Continent southAmerica = new Continent("South America");
        southAmerica.addCountry(brazil);

        Person matheus = new Person("Matheus", blumenau);

        System.out.println("Population of Blumenau: " + blumenau.getPopulation());
        matheus.migrate(joinville);
        System.out.println("Population of Blumenau after migration: " + blumenau.getPopulation());
        System.out.println("Population of Joinville: " + joinville.getPopulation());
        System.out.println("Total population of Brazil: " + brazil.getTotalPopulation());
        System.out.println("Total population of South America: " + southAmerica.getTotalPopulation());
        System.out.println("Area of South America: " + southAmerica.getTotalArea());
    }
}