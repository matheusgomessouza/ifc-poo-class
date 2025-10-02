package auto;

public class Main {
    static void main() {
        Vehicle vehicle = new Vehicle();
        vehicle.setFuelCapacity(10);
        vehicle.setDistancePerLitre(12);

        vehicle.drive(50);
        vehicle.showTraveledDistance();
        vehicle.showRange();

        Car car = new Car("Fiat Argo", 40, 14);
        car.drive(100);
        car.showTraveledDistance();
        car.showRange();

        Motorcycle moto = new Motorcycle("Yamaha MT-03", 15, 30);
        moto.drive(200);
        moto.showTraveledDistance();
        moto.showRange();
    }
}
