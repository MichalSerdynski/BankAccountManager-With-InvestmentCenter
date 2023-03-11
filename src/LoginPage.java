import java.util.Scanner;

class LoginPage {

        boolean open = true;
        LoginPage() {

        }

        //Login
        public void Login() {
                Account sampleAccount = new Account("login", "password", "Skywalker", "Anakin", 1399132345, false, 1000, 0, 0);
                while (open == true) {

                        System.out.println("Please Log in to Your account");
                        System.out.println("For sample purposes use login: login and password: password\n");
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Login: ");
                        String loginField = scan.next();


                //Password
                        System.out.println("Password: ");
                        String passwordField = scan.next();




                        if (loginField.equalsIgnoreCase(sampleAccount.login) && passwordField.equalsIgnoreCase(sampleAccount.password)) {
                                System.out.println("Loading your account...");
                                System.out.println("...");
                                System.out.println("...");
                                System.out.println("...");
                                System.out.println("\n");
                                open = false;
                                MainMenu mainMenu = new MainMenu();
                                mainMenu.OptionsDisplay();
                        } else {
                                System.out.println("Wrong Login or Password");
                                System.out.println("Try again");
                                System.out.println("If You wish to exit, type 'exit' ");
                                System.out.println("If You wish to try again, type any key ");
                                if (scan.next().equalsIgnoreCase("exit")){
                                        open = false;
                                }
                                else{
                                        open = true;
                                }

                        }



                }

        }
}
