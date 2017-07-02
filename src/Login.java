import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by David on 2017-06-18.
 */
public class Login {
    //    ha kurwa wiedzialem
    //gdzie modyfikator dostepu?  co to za kaszana ma byc
    private Registration registered;
    Scanner in;

    public Login() throws FileNotFoundException {
        this.in = new Scanner(System.in);
        this.registered = new Registration();
        registered.loadCustomersFromFile("BazaKlientow.txt");
    }

        public void logowanie(String login, String password) {

        for (Customer c : registered.getRegisteredCustomers()) {
            if (c.getLogin().equals(login)) {
                if (c.getPassword().equals(password)) {
                    System.out.println("Zalogowano!");
                    break;
                } else {
                    System.out.println("Błędne hasło. Spróbuj jeszcze raz");
                    String passwordAgain = in.nextLine();

                }
            } else {
                System.out.println("Nie ma takiego loginu w bazie");
            }
        }
    }

}
