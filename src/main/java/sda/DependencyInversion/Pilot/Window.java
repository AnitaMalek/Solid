package sda.DependencyInversion.Pilot;

public class Window implements Switchable {

    private boolean isOpened;

    @Override
    public void turnOff() {
        isOpened = false;
        System.out.println("Closing window");
    }

    @Override
    public void turnOn() {
        isOpened = true;
        System.out.println("Openind window");
    }

    @Override
    public boolean isTurnedOn() {
        return isOpened;
    }
}
