/**
 * New users
 */

import java.util.Random;
import java.util.Scanner;


public class user_data {

    String First_name;
    String Last_name;
    int Client_id;
    double Account_balance;


    void Create_new_client() {
        System.out.println("Your client id is " + generate_id());
        //add in database
        System.out.println("A new client is add to our databse!");
    }

    void Regular_customer() {

        Scanner scanner = new Scanner(System.in);
        String f_name, l_name;
        int id;

        System.out.println("Fill out the form in order to log in");
        f_name = scanner.nextLine();
        l_name = scanner.nextLine();
        id = scanner.nextInt();
        //verify given informations in db
        System.out.println("Welcome back, dear customer");
        scanner.close();
    }

    /*void update_balance(double amount) {
        this.Account_balance = this.Account_balance + amount;
    }*/

    int generate_id() {
        Random random = new Random();

        int id = random.nextInt(9999-1000) + 1000;
        System.out.println(id);
        return id;
    }

}