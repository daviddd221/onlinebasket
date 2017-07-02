import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2017-06-15.
 */
//przeformatuj klos w calej klasie
public class Basket {

    private int id;
    private int capacity;
    private Customer customer;
    private List<Product> basket = new ArrayList<>();
    private ProductCatolog catalog = new ProductCatolog();

    public void addToBasket(Product product, int quantity) {
        //tutaj jest za duzo  ifologii, pomysl jak to mozna rozwiazac bardziej jasno

        if(chceckQuantityProducts(product,quantity)){
            changeQuantity(product,quantity);
            if (repeats(product)) {
                changePieces(product, quantity);
            }
            else {
                basket.add(product);
                System.out.println("Dodano!");
                changePieces(product,quantity);
            }
        }
        else {
            System.out.println("Nie udało się dodać produktu");
        }
    }

    //nazwa metoda malo mowi, nie wiem o co chodzi
    public boolean repeats(Product product){
        for (Product p : basket) {
            if (p.getId() == product.getId()) {
                return true;
            }
        }
        return false;
    }

    public boolean chceckQuantityProducts(Product product, int quantity) {
        if(product.getQuantity() >= quantity && quantity != 0 && quantity > 0) {
            return true;
        }
        else if (quantity == 0) {
            System.out.println("Podałeś za mało sztuk towaru");
            return false;
        }
        else {
            System.out.println("Nie ma na stanie tylu sztuk produktu " );
            return false;
        }
    }

    public void changeQuantity(Product product, int quantity) {
        product.setQuantity(product.getQuantity() - quantity);
    }

    public void changePieces(Product product, int quantity) {
            product.setPieces(product.getPieces() + quantity);
    }

    public void displayBasket() {
        for (Product p : basket) {
            System.out.println("1. " + p.getNameProduct() + " ilosc " + p.getPieces() + " cena za sztuke "+ p.getPrice());
        }
    }

    public double valueOfBasket() {
        double amount = 0;
        for (Product p : basket) {
            p.setPrice(0);
            amount = p.getPrice() * p.getPieces();
        }
        return amount;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}