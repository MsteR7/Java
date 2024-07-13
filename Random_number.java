import java.util.Random;
import java.util.Scanner;

public class Random_number {
    public static void main(String[] args) {

        Random random = new Random(); //Object for random number
        Scanner scanner = new Scanner(System.in); // Obtain user's input
        int player_guess;
        boolean win_status = false;

        int random_number = random.nextInt(100) + 1; //Generate random number
        System.out.println("Try to guess the mysterious number :");
        try {
            player_guess = scanner.nextInt();
            for (int i = 0; i != 5; i++) {
                if (random_number > player_guess) {
                    System.out.println("Higher");
                    player_guess = scanner.nextInt();
                } else if (random_number < player_guess) {
                    System.out.println("Lower");
                    player_guess = scanner.nextInt();
                } else {
                    System.out.println("Jackpot! You've found it");
                    win_status = true;
                    break;
                }
            }
            if (win_status == false)
                System.out.println("Game Over. You have used up all your attempts");
            scanner.close();
        } catch (java.util.InputMismatchException e) {
            System.out.println("I see you, but it doesn't work like that :)");
        }
    }
}
