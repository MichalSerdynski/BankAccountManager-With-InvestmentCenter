import java.util.Scanner;

public class Account {

    protected String login;
    protected String password;
    public static String clientLastName;
    public String clientFirstName;
    protected int accountNumber;
    protected boolean isCredit;

    Account(String login, String password, String clientLastName, String clientFirstName, int accountNumber, boolean isCredit){
        this.clientLastName = clientLastName;
        this.clientFirstName = clientFirstName;
        this.accountNumber = accountNumber;
        this.isCredit = isCredit;
    }



    public static void main(String[] args) {


        LoginPage loginPage = new LoginPage();
        loginPage.Login();

        Account sampleAccount = new Account("login", "password", "Skywalker", "Anakin", 1399132345, true);

        MainMenu mainMenu = new MainMenu();
        mainMenu.OptionsDisplay();




        }




    }
