import java.util.Scanner;

class LoginPage {


        LoginPage() {

        }

        //Login
        public void Login() {
                boolean open = true;
                while (open == true) {

                        System.out.println("Please Log in to Your account");
                        System.out.println("For sample purposes uses login: login and password: password\n");
                        Scanner scan = new Scanner(System.in);
                        System.out.println("Login: ");
                        String login = scan.next();


                //Password
                        System.out.println("Password: ");
                        String password = scan.next();



                        if (login.equalsIgnoreCase("login") && password.equalsIgnoreCase("password")) {
                                System.out.println("Loading your account...");
                                System.out.println("...");
                                System.out.println("...");
                                System.out.println("...");
                                System.out.println("\n");
                                open = false;
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
