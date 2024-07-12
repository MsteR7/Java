//Reverse a string enter in input

import java.util.Scanner;

public class Reverse_string {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter a word :");
    String word = scanner.nextLine();
    for(int i = word.length(); i > 0; i--) {
        System.out.print(word.charAt(i-1));
    }
        scanner.close();
    }

}
