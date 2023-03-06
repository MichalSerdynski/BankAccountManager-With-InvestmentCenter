import java.util.Scanner;

public class MainMenu {

    public MainMenu() {

    }

    public void depositMoney(int deposit){
        Account.balance += deposit;
        System.out.println("Current balance: " + Account.balance + "\n");
    }

    public void withdrawMoney(int withdraw) {
        if (Account.isCredit == true) {
            Account.balance -= withdraw;
            System.out.println("Current balance: " + Account.balance + "\n");

        }
        else{
            System.out.println("Sorry, You do not have enough funds for this transaction and Your account is not a credit category. You can apply for credit account in the menu\n");
        }
    }
    public void OptionsDisplay() {
        boolean menuOpen = true;
        System.out.println("Welcome Mr." + Account.clientLastName + "\n");
        while (menuOpen) {
            System.out.println("Main Menu");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Access your investment account");
            System.out.println("5. Change Credit status of the account");
            System.out.println("6. Download a file with this sessions account activities");
            System.out.println("7. Exit");
            System.out.println("\n");
            System.out.println("Type the number of chosen option to access it");
            Scanner scan = new Scanner(System.in);
            int option = scan.nextInt();

            if (option != 7) {
                switch (option) {
                    case 1:
                        System.out.println("Your balance is: " + Account.balance);
                        break;
                    case 2:
                        System.out.println("Enter the amount you wish to deposit: ");
                        int deposit = scan.nextInt();
                        depositMoney(deposit);
                        break;
                    case 3:
                        System.out.println("Enter the amount you wish to withdraw: ");
                        int withdraw = scan.nextInt();
                        withdrawMoney(withdraw);
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

