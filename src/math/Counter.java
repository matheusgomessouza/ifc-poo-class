package math;

public class Counter extends AbstractCounter {
    private int counter;

    public  void increment() {
        System.out.println("Current counter: " + counter);
        counter++;
        System.out.println("Counter incremented: " + counter);
    }

    public void decrement() {
        System.out.println("Current counter: " + counter);
        counter--;
        System.out.println("Counter decremented: " + counter);
    }

    public void increment(int amount) {
        System.out.println("Current counter: " + counter);
        counter += amount;
        System.out.println("Counter incremented with specific amount: " + counter);
    }

    public void decrement(int amount) {
        System.out.println("Current counter: " + counter);
        counter -= amount;
        System.out.println("Counter decremented with specific amount: " + counter);
    }

    public Counter(int counter) {
        this.counter = counter;
    }

    public void reset() {
        counter = 0;
        System.out.println("Counter zeroed: " + counter);
    }
}
