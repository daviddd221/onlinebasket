import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by David on 2017-06-18.
 */
public class ProductCatolog {
    //pomysl tutaj tez nad walidacja
    //w ktorej bede zawarte wszystkie dostepne produkty
    // bedzie miala metode, ktora wyswietli wszystkie produkty
    //bedzie posiadac metode ktora bedzie zwracala wybrany produkt

    private List<Product> listOfProducts = new ArrayList<>();

    public void addToCatalog(Product product) {
        listOfProducts.add(product);
        System.out.println("Dodano");
    }

    public void displayCatalog() {
        for (Product p : listOfProducts) {
            System.out.println(p.getId()+"."+"Nazwa " + p.getNameProduct() + " ilosc " + p.getQuantity() + " cena " +p.getPrice());
        }
    }

    public Product findByName(String product) {
        for (Product p : listOfProducts) {
            if (p.getNameProduct().equalsIgnoreCase(product)) {
                return p;
            }
        }
        return null;
    }

    public Product findById(int id) {
        for (Product i : listOfProducts) {
            if (i.getId() == id) {
                return i;
            }
        }
        return null;
    }

    public void saveToFile(String path) throws FileNotFoundException {

        PrintWriter save = new PrintWriter(path);
        for (Product p : listOfProducts) {
            save.println(p.getNameProduct() + " " + p.getQuantity() + " " + p.getPrice() + " " + p.getCategory());
        }
        save.close();
    }

    public void loadFromFile(String path) throws FileNotFoundException {
        File file = new File(path);
        Scanner in = new Scanner(file);

        while (in.hasNextLine()) {
            String line = in.nextLine();
            String tab[] = line.split(" ");

            addToCatalog(new Product(tab[0], Integer.parseInt(tab[1]), Double.parseDouble(tab[2]), tab[3], Integer.parseInt(tab[4])));
        }
    }

}
