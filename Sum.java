/**
 * Sum two numbers
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sum {

    public static void hello(String[] args) {
        int a, b, c;
        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter the first number :");
            a = scanner.nextInt();

            System.out.println("Enter the second number :");
            b = scanner.nextInt();
            c = a + b;

            System.out.println("The sum of the two numbers is " + c);
            scanner.close();
        }
        catch(InputMismatchException e) {
            System.out.println("Enter a number");
        }
    }
}