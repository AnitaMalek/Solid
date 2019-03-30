package sda.SingleResponsibility;

public class RealUser {

    public static void main(String[] args) {
        CheckData emailValidator= new Email();
        CheckData ageValidator= new Age();
        CheckData nameValidator = new Name();
        CheckData lastNameValidator = new LastName();
        User user1 = new User(2, "Maria", "Kowalska", "");
        System.out.println("Email validator: " + emailValidator.valid(user1));
        System.out.println("Age validator: " + ageValidator.valid(user1));
        System.out.println("Name validator: " + nameValidator.valid(user1));
        System.out.println("LastName validator: " + lastNameValidator.valid(user1));

    }
}
