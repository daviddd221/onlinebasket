import java.util.Scanner;

/**
 * Created by David on 2017-06-15.
 */
public class Product {

    //modifkator, przeformatuj kod klasy
    Scanner in = new Scanner(System.in);

    private String nameProduct;
    private int quantity;
    private double price;
    private String category;
    private int pieces;
    private int id;

    public Product(String nameProduct, int quantity, double price, String category, int id) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
        this.category = category;
        this.id = id;
    }

    public Product() {

    }

    public Product createProduct() {
        System.out.println("Podaj nazwe produktu");
        String name = in.nextLine();
        System.out.println("Podaj ilość sztuk");
        int quantity = in.nextInt();
        checkQuantity(quantity); // <<-----------------------------
        System.out.println("Podaj cenę za sztukę");
        double price = in.nextDouble();
        checkPrice(price); // <<-------------------------------
        System.out.println("Podaj kategorie");
        String category = in.next();
        System.out.println("Podaj id");
        int id = in.nextInt();

        return new Product(name, quantity, price, category, id);
    }

    public void checkQuantity(int quantity) {
        while (quantity <= 0) {
            System.out.println("Podałeś za mało sztuk. Podaj jeszcze raz");
            quantity = in.nextInt();
        }
    }

    public void checkPrice(double price) {
        while (price <= 0) {
            System.out.println("Podałeś za małą cene. Podaj jeszcze raz");
            price = in.nextDouble();
        }
    }



    public String getNameProduct() {
        return nameProduct;
    }

    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Scanner getIn() {
        return in;
    }

    public void setIn(Scanner in) {
        this.in = in;
    }

    public int getPieces() {
        return pieces;
    }

    public void setPieces(int pieces) {
        this.pieces = pieces;
    }

    @Override
    public String toString() {
        return "Product name: " + nameProduct +
                ", Quantity " + quantity +
                ", Price " + price +
                ", Category " + category;
    }
}
