import health.Person;

void main() {
    var person = new Person("Matheus Souza", 81.1, 1.81);

    var height = person.getHeight();
    var weight = person.getWeight();

    System.out.println(person.calculateImc(height,  weight));
}
