package sda.InterfaceSegregation.Restaurant;

public class RestaurantService {

    public static void main(String[] args) {

        Restaurant restaurant = new Restaurant();
        restaurant.walkInCustomerOrder();
        restaurant.payInPerson();
        Telephone telephone = new Telephone();
        telephone.takeTelephoneOrder();
        OnlineApp onlineApp = new OnlineApp();
        onlineApp.acceptOnlineOrder();
        onlineApp.payOnline();
    }
}
