import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by David on 2017-07-02.
 */
public class ShopOnline {

    private Basket basket;
    private Customer customer;
    private ProductCatolog productCatolog;
    private Product product;
    private Registration register;
    private Login login;
    private CustomerModify modify;
    private Scanner in;

    public ShopOnline() throws FileNotFoundException {

        this.basket = new Basket();
        this.productCatolog = new ProductCatolog();
        this.product = new Product();
        this.register = new Registration();
        this.login = new Login();
        this.modify = new CustomerModify();
        this.in = new Scanner(System.in);

        productCatolog.addToCatalog(new Product("Puzzle", 3, 2, "Toy", 1));
        productCatolog.addToCatalog(new Product("Car", 6, 10, "Toy", 2));
        productCatolog.addToCatalog(new Product("Bear", 1, 8, "Toy", 3));
    }

    public Basket getBasket() {
        return basket;
    }

    public Customer getCustomer() {
        return customer;
    }

    public ProductCatolog getProductCatolog() {
        return productCatolog;
    }

    public Product getProduct() {
        return product;
    }

    public Registration getRegister() {
        return register;
    }

    public Login getLogin() {
        return login;
    }

    public CustomerModify getModify() {
        return modify;
    }

    public Scanner getIn() {
        return in;
    }
}
