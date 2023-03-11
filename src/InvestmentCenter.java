import java.util.*;

public class InvestmentCenter {
    public static double stockPrice;
    public static Hashtable<String, Double> stocks = new Hashtable<>();
    static Scanner scan = new Scanner(System.in);

    public static double totalPrice(double numberOfStocks, double stockPrice) {
        double price = numberOfStocks * stockPrice;
        return price;
    }

    public static void marketSituation() {
        double t = Math.random() * 100;
        double n = Math.random() * 100;
        double a = Math.random() * 100;
        double m = Math.random() * 100;
        double am = Math.random() * 100;

        stocks.put("TSLA", t);
        stocks.put("NVDA", n);
        stocks.put("AAPL", a);
        stocks.put("MSFT", m);
        stocks.put("AMZN", am);

        for (Map.Entry<String, Double> e : stocks.entrySet()) {
            System.out.println(" | " + e.getKey() + " | " + e.getValue() + " | ");
        }

        System.out.println("\n");
        System.out.println("To invest in: \n" +
                "TSLA - 1\n" +
                "NVDA - 2\n" +
                "AAPL - 3\n" +
                "MSFT - 4\n" +
                "AMZN - 5");
        System.out.println("To exit type - 6");
        int choice = scan.nextInt();
        boolean open = true;
        while (open) {
            switch (choice) {
                case 1:
                    System.out.println("Number of stocks to buy: ");
                    int number = scan.nextInt();
                    double price = totalPrice(t, number);
                    System.out.println("Price: " + price + " USD" + "\n");
                    System.out.println("Accept the transaction ? \n");
                    System.out.println("Type 'yes' to proceed, and any other key to cancel");
                    String accept = scan.next();
                    if (accept.equalsIgnoreCase("yes")) {
                        if (Account.availableFunds >= price) {
                            Account.availableFunds -= price;
                            System.out.println("Transaction Successful");
                        } else {
                            System.out.println("Not enough funds");
                            break;
                        }
                        open = false;
                    }
                    break;
                case 2:
                    System.out.println("Number of stocks to buy: ");
                    int numberNVDA = scan.nextInt();
                    double priceNVDA = totalPrice(n, numberNVDA);
                    System.out.println("Price: " + priceNVDA + " USD" + "\n");
                    System.out.println("Accept the transaction ? \n");
                    System.out.println("Type 'yes' to proceed, and any other key to cancel");
                    String acceptNVDA = scan.next();
                    if (acceptNVDA.equalsIgnoreCase("yes")) {
                        if (Account.availableFunds >= priceNVDA) {
                            Account.availableFunds -= priceNVDA;
                            System.out.println("Transaction Successful");
                        } else {
                            System.out.println("Not enough funds");
                        }
                        open = false;
                    }
                    break;

                case 3:
                    System.out.println("Number of stocks to buy: ");
                    int numberAAPL = scan.nextInt();
                    double priceAAPL = totalPrice(a, numberAAPL);
                    System.out.println("Price: " + priceAAPL + " USD" + "\n");
                    System.out.println("Accept the transaction ? \n");
                    System.out.println("Type 'yes' to proceed, and any other key to cancel");
                    String acceptAAPL = scan.next();
                    if (acceptAAPL.equalsIgnoreCase("yes")) {
                        if (Account.availableFunds >= priceAAPL) {
                            Account.availableFunds -= priceAAPL;
                            System.out.println("Transaction Successful");
                        } else {
                            System.out.println("Not enough funds");
                        }
                        open = false;
                    }
                    break;

                case 4:
                    System.out.println("Number of stocks to buy: ");
                    int numberMSFT = scan.nextInt();
                    double priceMSFT = totalPrice(m, numberMSFT);
                    System.out.println("Price: " + priceMSFT + " USD" + "\n");
                    System.out.println("Accept the transaction ? \n");
                    System.out.println("Type 'yes' to proceed, and any other key to cancel");
                    String acceptMSFT = scan.next();
                    if (acceptMSFT.equalsIgnoreCase("yes")) {
                        if (Account.availableFunds >= priceMSFT) {
                            Account.availableFunds -= priceMSFT;
                            System.out.println("Transaction Successful");
                        } else {
                            System.out.println("Not enough funds");
                        }
                        open = false;
                    }
                    break;

                case 5:
                    System.out.println("Number of stocks to buy: ");
                    int numberAMZN = scan.nextInt();
                    double priceAMZN = totalPrice(am, numberAMZN);
                    System.out.println("Price: " + priceAMZN + " USD" + "\n");
                    System.out.println("Accept the transaction ? \n");
                    System.out.println("Type 'yes' to proceed, and any other key to cancel");
                    String acceptAMZN = scan.next();
                    if (acceptAMZN.equalsIgnoreCase("yes")) {
                        if (Account.availableFunds >= priceAMZN) {
                            Account.availableFunds -= priceAMZN;
                            System.out.println("Transaction Successful");
                        } else {
                            System.out.println("Not enough funds");
                        }
                        open = false;
                    }
                    break;

                case 6:
                    open = false;
                    break;
                default:
                    break;
            }
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

    public static void withdrawFunds(double fundsToWithdraw) {
        if (fundsToWithdraw <= Account.availableFunds) {
            Account.availableFunds -= fundsToWithdraw;
            Account.balance += fundsToWithdraw;
        } else {
            System.out.println("Not enough funds");
        }
    }

    public static void InvestmentCenter(){
        int option = 0;
        boolean menuOpen = true;
        System.out.println("Investment Center Menu" + "\n");
        while (menuOpen && option!=5) {
            System.out.println("Current Investment Budget: " + Account.availableFunds + " USD" + "\n");
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
