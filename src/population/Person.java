package population;

public class Person {
    String name;
    City city;

    public Person(String name, City city) {
        this.name = name;
        this.city = city;
        city.addResident(this);
    }

    public void migrate(City newCity) {
        city.removeResident(this);
        newCity.addResident(this);
        this.city = newCity;
    }
}

