package sda.DependencyInversion.Phone;

public class Soundbar implements AudioInput {

    private boolean isTurnedOn;
    int volumeLevel = 50;

    @Override
    public void turnOn() {
        isTurnedOn = true;
        System.out.println("Soundbar turned on. ");
    }

    @Override
    public void turnOff() {
        isTurnedOn = false;
        System.out.println("Soundbar turned off. ");

    }

    @Override
    public void volumeUp() {
        System.out.println("Volume has been setted up. ");
        volumeLevel++;

    }

    @Override
    public void volumeDown() {
        System.out.println("Volume has been setted down. ");
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
