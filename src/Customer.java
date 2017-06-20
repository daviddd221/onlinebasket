/**
 * Created by David on 2017-06-15.
 */
public class Customer {

    private String name;
    private String surname;
    private double wallet;
    private String login;
    private String haslo;

    public Customer(String name, String surname, double wallet) {
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
    }

    public Customer(String login, String haslo) {
        this.login = login;
        this.haslo = haslo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getWallet() {
        return wallet;
    }

    public void setWallet(double wallet) {
        this.wallet = wallet;
    }
}
