/**
 * Created by David on 2017-06-15.
 */
public class Product {

    private String nameProduct;
    private int quantity;
    private double value;

    public Product(String nameProduct, int quantity, double value) {
        this.nameProduct = nameProduct;
        this.quantity = quantity;
        this.value = value;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
