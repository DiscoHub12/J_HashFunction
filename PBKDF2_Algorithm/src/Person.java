public class Person {

    private final String username;

    private final String password;

    private final static String salt = "1234";

    private final String hash;

    private final PBKDF2 calculateHashes = new PBKDF2();

    public Person(String userName, String password){
        this.username = userName;
        this.password = password;
        this.hash = calculateMyHashes();
    }

    public String calculateMyHashes(){
        return calculateHashes.calculateHash(this.password, salt);
    }

    public String getMyCryptedPassword(){
        return hash;
    }

    public String getMySalt(){
        return salt;
    }

    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
}
