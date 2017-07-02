/**
 * Created by David on 2017-06-18.
 */
public class Payment {

    //rozbuduj ta klase
    public void purchase(double basket, Customer customer) {
        if (customer.getWallet() > basket) {
            customer.setWallet(customer.getWallet() - basket);
            System.out.println("Wartosc Twojego portfela wynosi " + customer.getWallet());
        }
        else {
            System.out.println("Nie masz tylu piniedzy");
        }
    }
}
