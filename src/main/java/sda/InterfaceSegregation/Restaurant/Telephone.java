package sda.InterfaceSegregation.Restaurant;

public class Telephone implements TelephoneOrder {
    @Override
    public void takeTelephoneOrder() {
        System.out.println("Please give me your order.");
    }
}
