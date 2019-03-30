package sda.OpenClosed;

public class PlnToEurConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.EUR.getCourse()*amount;
    }
}
