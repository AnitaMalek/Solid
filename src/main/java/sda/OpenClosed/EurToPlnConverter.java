package sda.OpenClosed;

public class EurToPlnConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.PLN.getCourse()*amount;
    }
}
