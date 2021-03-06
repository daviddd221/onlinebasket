/**
 * Created by David on 2017-06-15.
 */
public class Customer {

    private String name;
    private String surname;
    private double wallet;
    private String login;
    private String password;
    private int id;

    public Customer(String name, String surname, double wallet, String login, String password, int id) {
        this.name = name;
        this.surname = surname;
        this.wallet = wallet;
        this.login = login;
        this.password = password;
        this.id = id;
    }

//    public void createId() {
//
//    }
//
//    public void findCustomerById(int id) {
//        for (int i )
//    }

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", wallet=" + wallet +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
