import java.util.Random;
import java.util.Scanner;;

public class Random_number {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int player_guess;

        int random_number = random.nextInt(100) + 1;
        System.out.println("Try to guess the mysterious number :");
        player_guess = scanner.nextInt();

        if(random_number > player_guess)
            System.out.println("High");
        else if (random_number < player_guess) {
            System.out.println("Low");
        } else {
            System.out.println("Jackpot! You've found it");
        }
        scanner.close();
    }
}
