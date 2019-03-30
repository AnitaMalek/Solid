package sda.SingleResponsibility;

public class Name implements CheckData {

    @Override
    public boolean valid(User user) {
        user.getName();
        if (user.name.endsWith("a")){
            System.out.println("Użytkowanik jest kobietą");
            return true;
        } else {
            System.out.println("Użytkownik nie jest kobietą");
            return false;
        }

    }
}
