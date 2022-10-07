//import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter <PASSWORD>: ");
        String password = keyboard.nextLine();

        // Initialising all check variables as failed to begin with
        boolean lengthOK = false;   // min 7 chars long
        boolean charsOK = false;    // contains min 2 chars {'!', '@', '#', '$', '%', '&', '*'}
        boolean numbersOK = false;  // contains min 2 numbers


        // convert password to an array of chars
        String[] passwordArray = password.split("");
        //System.out.println(Arrays.toString(passwordArray));

        // Criteria check: min 7 chars long
        if (passwordArray.length >= 6){
            lengthOK = true;
            //System.out.println("length is >= 7");
        }


        // Criteria check: contains min 2 chars
        String[] charsList = {"!", "@", "#", "$", "%", "&", "*"};
        int charCount = 0;
        for (int i = 0; i <= passwordArray.length-1; i++) {
            for (int j = 0; j <= charsList.length - 1; j++) {
                if (passwordArray[i].equals(charsList[j])) {
                    charCount++;
                }
            }
        }
        //System.out.println(charCount);
        if (charCount >= 2){
            charsOK = true;
        }


        // Criteria check: contains min 2 numbers
        String[] numsList = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        int numCount = 0;
        for (int i = 0; i <= passwordArray.length-1; i++) {
            for (int j = 0; j <= numsList.length - 1; j++) {
                if (passwordArray[i].equals(numsList[j])) {
                    numCount++;
                }
            }
        }
        //System.out.println(numCount);
        if (numCount >= 2){
            numbersOK = true;
            }


        // final check i.e. evaluation of password
        if (lengthOK && charsOK && numbersOK) {
            System.out.println("STRONG Password detected.");
        } else {
            System.out.println("Password is WEAK.");
        }
    }
}