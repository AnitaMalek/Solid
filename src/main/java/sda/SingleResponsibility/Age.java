package sda.SingleResponsibility;

public class Age implements CheckData {

    @Override
    public boolean valid(User user) {
        user.getAge();
        if (user.age < 18) {
            System.out.println("Użytkownik jest niepełnoletni");
            return false;
        } else {
            System.out.println("Użytkownik jest pełnoletni");
            return true;
        }
    }
}