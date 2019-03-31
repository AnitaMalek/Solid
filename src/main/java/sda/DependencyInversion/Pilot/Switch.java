package sda.DependencyInversion.Pilot;

public class Switch {
    private Switchable sw;

    public Switch(Switchable sw) {
        this.sw = sw;
    }

    public void switchInput(){
        if (sw.isTurnedOn()) {
            sw.turnOff();
        } else {
            sw.turnOn();
        }
    }
}
