//----------------------------------------------------------------------------------------------------------------- Factorial -----------------------------------------------------------------------------------------------------------------//
//This Program Determines The Factorial Of Positive Number Inputted By User.
import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        //Scanner to collect user input.
        Scanner sc = new Scanner(System.in);

        // Declare Variables
        int userInput;
        int fact = 1;

        //Collect user input
        System.out.println("Welcome!\nPlease Enter a Positive Integer:");
        userInput = sc.nextInt();

        //Calculate the Factorial
        for (int i = 1; i<=userInput; i++) {
            fact = fact * i;
        }
        System.out.printf("Factorial of %d = %d", userInput, fact);
    }
}