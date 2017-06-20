import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by David on 2017-06-18.
 */
public class Registration {

    Scanner in = new Scanner(System.in);
    List<Customer> registeredCustomers = new LinkedList<>();

    public Customer registration() {
        System.out.println("Podaj login");
        String login = in.nextLine();
        System.out.println("Podaj haslo");
        String haslo = in.nextLine();

        return new Customer(login, haslo);
    }

    public void addCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

}
