/**
 * Created by David on 2017-06-18.
 */
public class Payment {

    Customer tadek = new Customer("Tadek", "Kowalski", 300);


    public void purchase(double basket) {
        if (tadek.getWallet() > basket) {
            tadek.setWallet(tadek.getWallet() - basket);
            System.out.println("Kupiles przedmiot, nastepnym razem kup 3 razy tyle !!");
            System.out.println("Wartosc Twojego portfela wynosi " + tadek.getWallet());
        }
        else {
            System.out.println("Nie masz piniedzy wypierdalaj ze sklepu chamie");
        }
    }
}
