package sda.LiskovSubstitution.Car;

public class TryCar {

    //Zaproponuj rozwiązanie poniższego problemu z wykorzystaniem zasady Liskov Substition:
    //Istnieje możliwość stworzenia samochodu zarówno o skrzyni biegów manualnej jak i automatycznej
    //
    //public Car {
    //		void startEngine(){
    //		}
    //		void driveWithSpeed(int speed) {
    //		}
    //		void changeGear(int gearNumber){
    //		}
    //}

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
