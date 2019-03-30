package sda.OpenClosed;

public class UsdToPlnConverter implements Currencies {
    @Override
    public float exchange(float amount) {
        return Currency.PLN.getCourse()*amount;
    }
}
