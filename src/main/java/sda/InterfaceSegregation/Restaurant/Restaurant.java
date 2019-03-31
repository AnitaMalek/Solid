package sda.InterfaceSegregation.Restaurant;

public class Restaurant implements PayIn, CustomerOrder {


    @Override
    public void walkInCustomerOrder() {
        System.out.println("Proszę złożyć zamówienie !");
    }

    @Override
    public void payInPerson() {
        System.out.println("Płatność kartą, czy gotówką?");
    }
}
