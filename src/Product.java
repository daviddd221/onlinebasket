/**
 * Created by David on 2017-06-15.
 */
public class Product {

    private String nameProduct;
    private int quantity;
    private double price;

    public Product(String nameProduct, int quantity, double price) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.price = price;
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

    @Override
    public String toString() {
        return "Product name: " + nameProduct +
                ", quantity " + quantity +
                ", price " + price;
    }
}
