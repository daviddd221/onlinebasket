import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by David on 2017-06-18.
 */
public class Registration {

    Scanner in = new Scanner(System.in);
    private List<Customer> registeredCustomers = new LinkedList<>();

    public Customer registration() {
        CustomerBuilder customerBuilder = new CustomerBuilder();
        System.out.println("Podaj login");
        String login = in.nextLine();
        System.out.println("Podaj haslo");
        String password = in.nextLine();

        return customerBuilder
                .withLogin(login)
                .withPassword(password)
                .build();
    }

    public void addCustomer(Customer customer) {
        registeredCustomers.add(customer);
    }

    public void displayCustomers() {
        for (Customer c : registeredCustomers) {
            System.out.println("Login " +c.getLogin() + " Hasło " + c.getPassword());
        }
    }

}
