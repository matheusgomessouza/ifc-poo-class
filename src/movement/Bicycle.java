package movement;

public class Bicycle {
    private Boolean moving = false;
    private Boolean stopped = false;
    private int velocity;

    public Boolean getMoving() {
        return moving;
    }

    public void setMoving(Boolean moving) {
        this.moving = moving;
    }

    public Boolean getStopped() {
        return stopped;
    }

    public void setStopped(Boolean stopped) {
        this.stopped = stopped;
    }

    public int getVelocity() {
        return velocity;
    }

    public void setVelocity(int velocity) {
        this.velocity = velocity;
    }

    public void accelerate(int delta) {
        // implement negative error handling
        this.velocity += delta;
        stopped = false;
        moving = true;
    }

    public void brake(int delta) {
        this.velocity -= delta;
        moving = false;
        stopped = true;
    }

    public void showVelocity() {
         System.out.println("The current velocity is: " + this.velocity + "KM/h");
    }

    public Bicycle(Boolean moving, Boolean stopped, int velocity) {
        this.moving = moving;
        this.stopped = stopped;
        this.velocity = velocity;
    }
}
