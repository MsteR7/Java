/**
 * New users
 */

import java.util.Random;
import java.util.Scanner;
;


public class user_data {

    String First_name;
    String Last_name;
    int Phone_number;
    int Client_id;
    double Account_balance;

    database db = new database();


    void Create_new_client(String First, String Last, int Id, int Phone) {
        System.out.println("Your client id is " + Id + ". Keep it a secret and don't share with anyone!");
        //db.access_database(First, Last, Id, 0, Phone); //add in database
        System.out.println("New client register!");
    }

    void Regular_customer(int Id, int Phone) {

        //db.access_database(Id, Phone); //verify given informations in db
        System.out.println("Acess granted. Welcome back, dear customer");
    }

    /*void update_balance(double amount) {
        this.Account_balance = this.Account_balance + amount;
    }*/

    int generate_id() { // Define as a primary key
        Random random = new Random();

        int id = random.nextInt(9999-1000) + 1000;
        return id;
    }

    public void get_information_for_registration()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill out the form in order to sign in");
        System.out.println("First Name : ");
        this.First_name = scanner.nextLine();
        System.out.println("Last Name : ");
        this.Last_name= scanner.nextLine();
        System.out.println("Phone Number : ");
        this.Phone_number = scanner.nextInt();
        this.Client_id = generate_id();

        scanner.close();
    }
    public void get_information_for_connexion()
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Fill out the form in order to log in");
        System.out.println("Client ID : ");
        this.Client_id = scanner.nextInt();
        System.out.println("Phone Number : ");
        this.Phone_number = scanner.nextInt();

        scanner.close();
    }
}