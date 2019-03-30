package sda.SingleResponsibilityOfUser;

public class Email implements CheckData {

    @Override
    public boolean valid(User user) {
        user.getEmail();
         if (user.email.contains("@")){
             System.out.println("Email jest poprawny");
            return true;
        } else if (user.email.isEmpty()) {
             System.out.println("Należy wpisać adres email");
             return false;
         } else {
             System.out.println("Niepoprawny email");
             return false;
         }
    }
}
