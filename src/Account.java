import java.util.Scanner;

public class Account {

    protected String login;
    protected String password;
    public static String clientLastName;
    public String clientFirstName;
    protected int accountNumber;
    public static boolean isCredit;
    public static double balance;
    public static double investedFunds;
    public static double availableFunds;

    Account(String login, String password, String clientLastName, String clientFirstName, int accountNumber, boolean isCredit, double balance, double availableFunds, double investedFunds ){
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.accountNumber = accountNumber;
        this.isCredit = isCredit;
        this.balance = balance;
        this.availableFunds = availableFunds;
        this.investedFunds = investedFunds;
    }



    public static void main(String[] args) {


        LoginPage loginPage = new LoginPage();
        loginPage.Login();

        Account sampleAccount = new Account("login", "password", "Skywalker", "Anakin", 1399132345, false, 1000, 0, 0);


        MainMenu mainMenu = new MainMenu();
        mainMenu.OptionsDisplay();




        }




    }
