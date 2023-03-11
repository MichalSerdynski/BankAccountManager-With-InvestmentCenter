import java.util.*;

public class InvestmentCenter {
public static double stockPrice;
public static Hashtable<String, Double> stocks = new Hashtable<>();
                        //("TSLA", "NVDA", "AAPL", "MSFT", "AMZN"));
static Scanner scan = new Scanner(System.in);




public static void marketSituation(){

    stocks.put("TSLA", Math.random()*100);
    stocks.put("NVDA", Math.random()*100);
    stocks.put("AAPL", Math.random()*100);
    stocks.put("MSFT", Math.random()*100);
    stocks.put("AMZN", Math.random()*100);

    for(Map.Entry<String, Double> e : stocks.entrySet()){
        System.out.println(" | " + e.getKey() + " | " + e.getValue() + " | ");
    }
    }



public static void transferFunds(double fundsToTransfer) {
    if (fundsToTransfer <= Account.balance) {
        Account.availableFunds += fundsToTransfer;
        Account.balance -= fundsToTransfer;

    } else {
        System.out.println("Not enough funds");
    }
}

public static void withdrawFunds(double fundstoWithdraw) {
    if (fundstoWithdraw <= Account.availableFunds) {
        Account.availableFunds -= fundstoWithdraw;
        Account.balance += fundstoWithdraw;
    } else {
        System.out.println("Not enough funds");
    }
}
    public InvestmentCenter(){


    }

    public static void InvestmentCenter(){
        int option = 0;
        boolean menuOpen = true;
        System.out.println("Investment Center Menu" + "\n");
        while (menuOpen && option!=5) {
            System.out.println("Current Investment Budget: " + Account.availableFunds + "\n");
            System.out.println("1. Transfer Funds");
            System.out.println("2. Withdraw Funds");
            System.out.println("3. Invest");
            System.out.println("4. Check Investments");
            System.out.println("5. Exit");
            System.out.println("\n");
            System.out.println("Type the number of chosen option to access it");

            option = scan.nextInt();


            switch (option) {
                case 1:
                    System.out.println("Enter the amount you wish to Transfer to Investment Account: ");
                    double deposit = scan.nextDouble();
                    transferFunds(deposit);
                    break;
                case 2:
                    System.out.println("Enter the amount you wish to Withdraw from Investment Account: ");
                    double withdraw = scan.nextDouble();
                    withdrawFunds(withdraw);
                    break;
                case 3:

                        marketSituation();

                            break;


               // case 4:
                  //  System.out.println("Investment Center\n");
                   // System.out.println("Current Investment Budget: " + Account.availableFunds + "\n");
                   // InvestmentCenter investmentCenter = new InvestmentCenter();
                  //  System.out.println(investmentCenter);


                   // break;


                default:
                    break;






            }


        }
    }


}
