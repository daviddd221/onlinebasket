import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2017-06-15.
 */
public class Basket {

    private Long id;
    private int capacity;
    private Customer customer;
    private List<Product> basket = new ArrayList<>();

    public void addToBasket(Product product) {
        basket.add(product);
    }

    public void displayBasket() {
        for (Product p : basket) {
            System.out.println(p);
        }
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getBasket() {
        return basket;
    }

    public void setBasket(List<Product> basket) {
        this.basket = basket;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
