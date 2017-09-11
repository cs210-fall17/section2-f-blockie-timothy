mport java.security.*;
import java.util.*;

public class Encrypt {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter your netid:");
        String netid = in.nextLine();

        try {

            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(netid.getBytes("UTF-8")); // Change this to "UTF-16" if needed

            byte[] digest = md.digest();
            for (byte b : digest)
                System.out.print(String.format("%02x", b));
            System.out.println("");

        } catch (Exception e) {
            System.out.println("Something broke");
        }   
    }

}
