package sda.DependencyInversion.Pilot;

    public class Light implements Switchable{

        private boolean isTurnedOn;

        public void turnOn() {
            isTurnedOn = true;
            System.out.println("Turn on light");
        }

        public void turnOff() {
            isTurnedOn = false;
            System.out.println("Turn off light");
        }

        public boolean isTurnedOn() {
            return isTurnedOn;
        }
    }

