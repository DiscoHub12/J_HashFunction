import java.util.Objects;
import java.util.Set;

public class Admin {

    private PBKDF2 cryptedCalculate;

    public Admin(){
        this.cryptedCalculate = new PBKDF2();
    }

    public boolean isAccountLogged(Set<Person> personsAccount, String username, String password, String salt){
        String cryptedPassword = cryptedCalculate.calculateHash(password, salt);
        for(Person person : personsAccount){
            String cryptedPersonPassword = cryptedCalculate.calculateHash(person.getPassword(), person.getMySalt());
            if(Objects.equals(cryptedPassword, cryptedPersonPassword))
                return true;
        }
        return false;
    }
}
