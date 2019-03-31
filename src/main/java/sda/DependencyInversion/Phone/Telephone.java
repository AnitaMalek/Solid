package sda.DependencyInversion.Phone;

public class Telephone {
    private AudioInput ai;

    public Telephone(AudioInput ai){
        this.ai = ai;
    }

    public void audioandVisionInput(){
        if (ai.isTurnedOn()) {
            ai.turnOff();
        } else {
            ai.turnOn();
        }
    }
    public void changeVolume(int volumeLevel){
        if (ai.volumeLevel() >= volumeLevel){
            ai.volumeDown();
        } else {
            ai.volumeUp();
        }
    }


}
