import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Simulation Creating Account:
        Person firstAccount = new Person("User1", "passwone");
        Person secondAccoutn = new Person("User2", "passwtwo");
        Person thirdAccount = new Person("User3", "passwthree");
        Person fourAccount = new Person("User4", "passwfour");

        //Simulation get crypted Password by PBKDF2 Algorithm:
        System.out.println("First Account --> hashes password is: " + firstAccount.getMyCryptedPassword());
        System.out.println("Second Account --> hashes password is: " + secondAccoutn.getMyCryptedPassword());

        //Account person inside Site:
        Set<Person> persons = new HashSet<>();
        Collections.addAll(persons, firstAccount, secondAccoutn, thirdAccount, fourAccount);

        //Simulation Login Account:
        Admin admin = new Admin();
        boolean isIinside = admin.isAccountLogged(persons, "User1", "passwone", "1234");
        System.out.println("Your account is Logged: " + isIinside);
    }
}