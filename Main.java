import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter <PASSWORD>: ");
        String password = keyboard.nextLine();

        // Initialising all check variables as failed to start with
        boolean lengthOK = false;   // min 7 chars long
        boolean numbersOK = false;  // min 2 numbers
        boolean charsOK = false;    // '!', '@', '#', '$', '%', '&', '*'

        // password to array of chars:
        String[] passwordArray = password.split("");
        System.out.println(Arrays.toString(passwordArray));

        if (passwordArray.length >= 6){
            lengthOK = true;
            System.out.println("length is >= 7");
        }




        // final check i.e. evaluation of password
        if (lengthOK && numbersOK && charsOK) {
            System.out.println("STRONG Password detected.");
        } else {
            System.out.println("Password is WEAK.");
        }

    }
}