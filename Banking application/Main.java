import java.util.Scanner;

/*
 * Warnings - exemple negative balance Bank main file
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String client_response;

        user_data clients = new user_data();

        System.out.println("Souhaitez-vous vous inscrire ou vous connecter [Tapez (i) ou (c)]");
        client_response = scanner.nextLine();
        switch (client_response.toLowerCase()) {
            case "i":
                clients.Create_new_client();
                break;
            case "c":
                clients.Regular_customer();
                break;
            default:
                treat_incorrect_input(scanner, client_response);
                break;
            }
        scanner.close();
    }

    static void treat_incorrect_input(Scanner sc, String client_response) {
        System.out.println("Invalid answer. Please try again!");
        for (int i = 3; i >= 0 ; i--) {
            client_response = sc.nextLine();
            if (verify_input(client_response) == 0)
                System.out.println("Wrong answer. You are left with " + i + " attemps");
            else
                break;
            if (i == 0) {
                System.out.println("This is not a playground. Perphaps, may you try our servives later on.");
            }
        }
    }

    static int verify_input(String reponse) {
        if (reponse.equalsIgnoreCase("i"))
            return 2;
        else if (reponse.equalsIgnoreCase("c"))
            return 1;
        else
            return 0;
    }
}

//