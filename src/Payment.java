/**
 * Created by David on 2017-06-18.
 */
public class Payment {

    Customer tadek = new Customer("Tadek", "Kowalski", 300);


    public void purchase(double basket, Customer customer) {
        if (customer.getWallet() > basket) {
            customer.setWallet(customer.getWallet() - basket);
            System.out.println("Kupiles przedmiot, nastepnym razem kup 3 razy tyle !!");
            System.out.println("Wartosc Twojego portfela wynosi " + customer.getWallet());
        }
        else {
            System.out.println("Nie masz piniedzy wypierdalaj ze sklepu chamie");
        }
    }
}
