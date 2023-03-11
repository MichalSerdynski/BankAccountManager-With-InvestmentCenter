import java.util.Scanner;

public class MainMenu {
    Scanner scan = new Scanner(System.in);
    public MainMenu() {

    }

    public void creditEligibility() {
        if (Account.isCredit) {
            System.out.println("Your account is Credit");
        } else {
            System.out.println("Your account is NOT Credit");

        }

        if (!Account.isCredit) {
            System.out.println("Change to credit ? (type 'yes' / 'no')");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("yes")) {
                if (Account.balance > 0) {
                    System.out.println("Your account is now credit!\n");
                    Account.isCredit = true;
                } else {
                    System.out.println("You do not have enough funds to be eligible for credit account.\n");
                }
            } else {

            }
        } else {
            System.out.println("Turn off credit ? (type 'yes' / 'no')");
            String choice = scan.next();
            if (choice.equalsIgnoreCase("yes")) {
                if (Account.balance > 0) {
                    Account.isCredit = false;
                    System.out.println("Your account is not credit anymore.");
                } else {

                    System.out.println("You need to pay your credit back first...");
                }
            } else {

            }


        }
    }

    public void depositMoney(double deposit){
        Account.balance += deposit;
        System.out.println("Current balance: " + Account.balance + " USD" + "\n");

    }

    public void withdrawMoney(double withdraw) {
        if(withdraw > Account.balance) {
            if (Account.isCredit == true) {
                Account.balance -= withdraw;
                System.out.println("Current balance: " + Account.balance + " USD" + "\n");

            }
            else{
                System.out.println("Sorry, You do not have enough funds for this transaction and Your account is not a credit category. You can apply for credit account in the menu\n");
            }
        }
        else{
            Account.balance -= withdraw;
            System.out.println("Current balance: " + Account.balance + " USD" + "\n");
        }
    }
    public void OptionsDisplay() {
        int option = 0;
        boolean menuOpen = true;
        System.out.println("Welcome Mr." + Account.clientLastName + "\n");
        while (menuOpen && option!=7) {
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

            option = scan.nextInt();


                switch (option) {
                    case 1:
                        System.out.println("Your balance is: " + Account.balance + " USD");
                        break;
                    case 2:
                        System.out.println("Enter the amount you wish to deposit: ");
                        double deposit = scan.nextDouble();
                        depositMoney(deposit);
                        break;
                    case 3:
                        System.out.println("Enter the amount you wish to withdraw: ");
                        double withdraw = scan.nextDouble();
                        withdrawMoney(withdraw);
                        break;
                    case 4:
                        System.out.println("Investment Center\n");
                        System.out.println("Current Investment Budget: " + Account.availableFunds + "\n");
                        InvestmentCenter investmentCenter = new InvestmentCenter();
                        System.out.println(investmentCenter);


                        break;
                    case 5:

                       creditEligibility();

                        break;
                    case 6:
                        break;
                    case 7:
                        System.out.println("Thank You, see You soon!");
                        break;
                    default:
                        break;






            }


        }

    }
}




