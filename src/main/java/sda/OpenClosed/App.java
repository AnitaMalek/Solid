package sda.OpenClosed;

public class App {

    public static void main(String[] args) {
        Currencies currencies = new PlnToEurConverter();
        Walutomat walutomat = new Walutomat();
        walutomat.setCurrencies(currencies);
        System.out.println("Konwertuj: " + walutomat.exchange(2000));
    }
}
