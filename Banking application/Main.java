import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Scanner;


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
                access_database();
                break;
            case "c":
                clients.Regular_customer();
                access_database();
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
                System.out.println("This is not a playground. Perphaps, you may try our servives later on.");
            }
        }
    }

    static int verify_input(String reponse) {

        user_data clients = new user_data();

        if (reponse.equalsIgnoreCase("i")) {
            clients.Create_new_client();
            access_database();
            return 2;
        } else if (reponse.equalsIgnoreCase("c")) {
            clients.Regular_customer();
            access_database();
            return 1;
        } else {
            return 0;
        }
    }

    static String access_database() {

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Bank_db", "root", "");
        conn.close();
        return "Sucess";
    }
    catch (Exception e){
        System.out.println(e);
        return "Failed";
        }
    }
}