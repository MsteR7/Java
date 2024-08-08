import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String client_response;

        user_data user = new user_data();

        System.out.println("Souhaitez-vous vous inscrire ou vous connecter [Tapez (i) ou (c)]");
        client_response = scanner.nextLine();
        switch (client_response.toLowerCase()) {
            case "i":
                user.get_information_for_registration();
                user.Create_new_client(user.First_name, user.Last_name, user.Client_id, user.Phone_number);
                break;
            case "c":
                user.get_information_for_connexion();
                user.Regular_customer(user.Client_id, user.Phone_number);
                break;
            default:
                treat_incorrect_input(scanner, client_response);
                break;
            }
        scanner.close();
        //What sesction do you want to access??
            //Atm = Deposite or withdraw money
            //Transaction = Do or See all your transactions
            //Account = List F/L name + ID + Balance
            // Exit = Quit the program
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
                System.out.println("This is not a playground. Perphaps, you may try our servives later on.");
            }
        }
    }

    static int verify_input(String reponse) {

        user_data user = new user_data();

        if (reponse.equalsIgnoreCase("i")) {
            user.get_information_for_registration();
            user.Create_new_client(user.First_name, user.Last_name, user.Client_id, user.Phone_number);
            return 2;
        } else if (reponse.equalsIgnoreCase("c")) {
            user.get_information_for_connexion();
            user.Regular_customer(user.Client_id, user.Phone_number);
            return 1;
        } else {
            return 0;
        }
    }

}