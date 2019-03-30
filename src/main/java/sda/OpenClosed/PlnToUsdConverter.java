package sda.OpenClosed;

public class PlnToUsdConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.USD.getCourse()*amount;
    }
}
