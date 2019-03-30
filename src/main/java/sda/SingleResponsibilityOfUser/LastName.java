package sda.SingleResponsibilityOfUser;

public class LastName implements CheckData{

    @Override
    public boolean valid(User user) {
        user.getLastName();
        if (user.lastName.endsWith("x")){
            System.out.println("Użytkownik ma niepoprawne nazwisko");
            return false;
        } else {
            System.out.println("Nazwisko jest poprawne");
            return true;
        }
    }
}
