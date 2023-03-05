import java.util.Scanner;

public class MainMenu {

    public MainMenu() {

    }

    public void OptionsDisplay() {
        boolean menuOpen = true;
        if (menuOpen) {
            System.out.println("Welcome Mr." + Account.clientLastName + "\n");
            System.out.println("Main Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Access your investment accunt");
            System.out.println("5. Change Credit status of the account");
            System.out.println("6. Download a file with this sessions account activities");
            System.out.println("7. Exit");
            System.out.println("\n");
            System.out.println("Type the number of chosen option to acces it");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            if (option != 7) {
                switch (option) {
                    case 1:
                        System.out.println("Your balance is: " + Account.balance);
                        break;


                }

            }


        }

    }
}





//MainMenu
    //Display Account Number and if credit
    //Check Balance
    //Withdraw
    //Deposit
    //Apply for a credit account
    //Print today's statement
    //Save today's transactions to the file
    //LogOut

