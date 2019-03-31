package sda.LiskovSubstitution;

public class TryCar {

    public static void main(String[] args) {
        AutomaticGearCar automatic = new AutomaticGearCar();
        automatic.startEngine();
        automatic.setSpeed(150);
        System.out.println(automatic);
        ManualGearCar manual = new ManualGearCar();
        manual.startEngine();
        manual.setSpeed(160);
        manual.setGearNumber(6);
        System.out.println(manual);

    }
}
