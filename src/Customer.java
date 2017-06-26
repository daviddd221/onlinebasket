/**
 * Created by David on 2017-06-15.
 */
public class Customer {

    private String name;
    private String surname;
    private double wallet;
    private String login;
    private String password;

    public Customer(String name, String surname, double wallet, String login, String password) {
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
        this.login = login;
        this.password = password;
    }

    public Customer() {

    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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
