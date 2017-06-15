import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2017-06-15.
 */
public class Basket {

    Customer customer = new Customer("Dawid", "Cichecki", 1000);

    List<Product> basket = new ArrayList<>();

    public void addToBasket(Product product) {
        basket.add(product);
    }

    public void displayBasket() {
        for (Product p : basket) {
            System.out.println(p);
        }
    }
}
