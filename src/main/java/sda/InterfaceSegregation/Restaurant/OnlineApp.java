package sda.InterfaceSegregation.Restaurant;

public class OnlineApp implements OnlineOrder, OnlinePayment {

    @Override
    public void acceptOnlineOrder() {
        System.out.println("Online order accepted.");

    }

    @Override
    public void payOnline() {
        System.out.println("Please choose the method of payment.");

    }
}
