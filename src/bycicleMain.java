import movement.Bicycle;

void main() {
    var bicycle = new Bicycle(false, false, 0);

    bicycle.accelerate(20);
    bicycle.showVelocity();

    bicycle.brake(5);
    bicycle.showVelocity();
}