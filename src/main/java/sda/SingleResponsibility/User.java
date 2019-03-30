package sda.SingleResponsibility;

public class User {

    public int age;
    public String name;
    public String lastName;
    public String email;

    public User(int age, String name, String lastName, String email) {
        this.age = age;
        this.name = name;
        this.lastName = lastName;
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
