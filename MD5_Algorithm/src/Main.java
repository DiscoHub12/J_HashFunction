public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        //MD5 Algorithm execution
        MD5 hashMd5 = new MD5();
        //Normal Password
        String password = "testPassword12.";
        //Encrypted password using MD5
        String encryptedPassword = hashMd5.getMd5(password);

        System.out.println("\nNormal Password : " + password +
                "\nEncrypted Password : "  + encryptedPassword);



    }
}