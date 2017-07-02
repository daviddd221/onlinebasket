import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by David on 2017-07-02.
 */
public class CustomerModify {

    Scanner in;
    private Login login;

    public CustomerModify() throws FileNotFoundException {
        this.in = new Scanner(System.in);
        this.login = new Login();
    }
    public void modifyCustomer(Customer customer){

        System.out.println("Co chcesz zmienic");
        System.out.println("1. Imie");
        System.out.println("2. Nazwisko");
        System.out.println("3. Porfel");
        System.out.println("4. Login");
        System.out.println("5. Hasło");
        int wybor = in.nextInt();

        switch (wybor) {
            case 1:
                System.out.println("Podaj imie");
                String name = in.nextLine();
                customer.setName(name);
                break;
            case 2:
                System.out.println("Podaj nazwisko");
                String surname = in.nextLine();
                customer.setSurname(surname);
                break;

            case 3:
                System.out.println("Dodaj pieniądze");
                double wallet = in.nextDouble();
                customer.setWallet(wallet);
                break;

            case 4:
                System.out.println("Podaj login");
                String login = in.nextLine();
                customer.setLogin(login);
                break;

            case 5:
                System.out.println("Podaj hasło");
                String password = in.nextLine();
                customer.setPassword(password);
                break;

            default:
                System.out.println("Coś nie tak");
        }
    }
}
