package sda.DependencyInversion.Pilot;

public class Main {
    public static void main(String[] args) {
        Switchable light = new Light();
        Switchable window = new Window();

        Switch sw = new Switch(window);
        sw.switchInput();
        sw.switchInput();
    }

}
