package sda.DependencyInversion.Phone;

public class Tv implements AudioInput {

    private boolean isTurnedOn;
    int volumeLevel = 50;



    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Tv turned on. ");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Tv turned down. ");
    }

    @Override
    public void volumeUp() {
        System.out.println("Tv volume setted up. ");
        volumeLevel++;
    }

    @Override
    public void volumeDown() {
        System.out.println("Tv volume setted down. ");
        volumeLevel--;
    }

    @Override
    public int volumeLevel() {
        return volumeLevel;
    }

    public boolean isTurnedOn() {
        return isTurnedOn;
    }
}
