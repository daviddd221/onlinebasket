import java.util.ArrayList;
import java.util.List;

/**
 * Created by David on 2017-06-18.
 */
public class ProductCatolog {

    //w ktorej bede zawarte wszystkie dostepne produkty
    // bedzie miala metode, ktora wyswietli wszystkie produkty
    //bedzie posiadac metode ktora bedzie zwracala wybrany produkt

    private List<Product> listOfProducts = new ArrayList<>();

    public void addToCatalog(Product product) {
        listOfProducts.add(product);
    }

    public void displayCatalog() {
        for (Product p : listOfProducts) {
            System.out.println("Nazwa " + p.getNameProduct() + " ilosc " + p.getQuantity() + " cena " +p.getPrice());
        }
    }

    public Product findProduct(String product) {
        for (Product p : listOfProducts) {
            if (p.getNameProduct().equalsIgnoreCase(product)) {
                return p;
            }
        }
        return null;
    }

}
