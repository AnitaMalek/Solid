package sda.DependencyInversion.Phone;

public class Main {
    public static void main(String[] args) {
        AudioInput soundbar = new Soundbar();
        AudioInput tv = new Tv();

        Telephone smartphone = new Telephone(tv);
        smartphone.audioandVisionInput();

        smartphone.changeVolume(80);
    }

}
