package sda.LiskovSubstitution;

public class AutomaticGearCar implements Car {

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine of automatic gear car");
    }

    @Override
    public String toString() {
        return "AutomaticGearCar{" +
                "speed=" + speed +
                '}';
    }
}
