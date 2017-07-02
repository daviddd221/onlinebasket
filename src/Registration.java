import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Created by David on 2017-06-18.
 */
public class Registration {

    //nie tworz obiektow w ten sposob, jak juz to w konstruktorze
    private Scanner in = new Scanner(System.in);
    private List<Customer> registeredCustomers = new LinkedList<>();
    private Random rnd = new Random();

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

    public void addCustomer(Customer customer ) {
        registeredCustomers.add(customer);
    }

    public void displayCustomers() {
        for (Customer c : registeredCustomers) {
            System.out.println("Login " +c.getLogin() + " Hasło " + c.getPassword());
        }
    }


    public void saveCustomersToFile(String path) throws FileNotFoundException {
        PrintWriter save = new PrintWriter(path);
        for (Customer c : registeredCustomers) {
            save.println(c.getName() + " " + c.getSurname() + " " + c.getWallet() + " " + c.getLogin() + " " + c.getPassword());
        }
        save.close();
    }

    public void loadCustomersFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {

            String line = scanner.nextLine();
            String tab[] = line.split(" ");

            addCustomer(new Customer(tab[0], tab[1], Double.parseDouble(tab[2]), tab[3], tab[4], Integer.parseInt(tab[5])));
        }
    }

    public List<Customer> getRegisteredCustomers() {
        return registeredCustomers;
    }

    public void setRegisteredCustomers(List<Customer> registeredCustomers) {
        this.registeredCustomers = registeredCustomers;
    }
}
