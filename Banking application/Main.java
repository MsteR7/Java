import java.util.Scanner;

/*
 * Warnings - exemple negative balance Bank main file
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String client_response;

        user_data clients = new user_data();

        System.out.println("Êtes-vous un nouveau client? [Tapez (Oui) ou (Non)]");
        for (int i = 0; i < 3; i++) {
        client_response = scanner.nextLine();
        int incorrect_filling_counter = i;
        switch (client_response.toLowerCase()) {
            case "oui":
                clients.Create_new_client();
                break;
            case "non":
                clients.Regular_customer();
                break;
            default:
                System.out.println("Invalid answer. Please try again!");
                incorrect_filling_counter = incorrect_filling_counter + 1;
            if (incorrect_filling_counter == 3)
                System.out.println("This is not a playground. Perphaps, may you try our servives later on.");
                break;
            }
        }
        scanner.close();
        }
}