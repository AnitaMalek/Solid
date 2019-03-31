package sda.LiskovSubstitution;

public class ManualGearCar implements Car {

    private int speed;
    private int gearNumber;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setGearNumber(int gearNumber) {
        this.gearNumber = gearNumber;
    }

    @Override
    public void startEngine() {
        System.out.println("Start engine of manual gear car");
    }

    @Override
    public String toString() {
        return "ManualGearCar{" +
                "speed=" + speed +
                ", gearNumber=" + gearNumber +
                '}';
    }
}
