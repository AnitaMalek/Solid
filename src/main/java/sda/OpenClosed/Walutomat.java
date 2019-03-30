package sda.OpenClosed;

public class Walutomat {

    public Currencies currencies;

    public void setCurrencies(Currencies currencies) {
        this.currencies = currencies;
    }

    public float exchange(float amount) {
        return currencies.exchange(amount);
    }
}
