public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //SHA-1 Algorithm
        SHA1 hashSha = new SHA1();
        //Normal Password:
        String password = "testPassword12.";
        //Encrypted password using SHA-1
        String encryptedPassword = hashSha.encryptThisString(password);

        System.out.println("\nNormal Passowrd : " + password +
                "\nEncrypted Password : " + encryptedPassword);
    }
}