package sda.OpenClosed;

public class GbpToPlnConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.PLN.getCourse()*amount;
    }
}
