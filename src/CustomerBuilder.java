/**
 * Created by David on 2017-06-25.
 */
public class CustomerBuilder {

    private final Customer customer;

    public CustomerBuilder() {
        this.customer = new Customer();
    }

    public CustomerBuilder withName(String name) {
        customer.setName(name);
        return this;
    }

    public CustomerBuilder withSurname(String surname) {
        customer.setSurname(surname);
        return this;
    }

    public CustomerBuilder withWallet(double wallet) {
        customer.setWallet(wallet);
        return this;
    }

    public CustomerBuilder withLogin(String login) {
        customer.setLogin(login);
        return this;
    }

    public CustomerBuilder withPassword(String password) {
        customer.setPassword(password);
        return this;
    }

    public Customer build() {
        return customer;
    }
}
