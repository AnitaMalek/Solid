package sda.OpenClosed;

public class PlnToGbpConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.GBP.getCourse()*amount;
    }
}
