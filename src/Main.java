
public class Main  {
    public static void main(String[] args) {



        Basket basket = new Basket();
        ProductCatolog catalog = new ProductCatolog();
        Product toy = new Product("Toy", 3, 2);
        Product car = new Product("Car", 6, 10);
        Product bear = new Product("Bear", 1, 8);


        catalog.addToCatalog(toy);
        catalog.addToCatalog(car);
        catalog.addToCatalog(bear);

        catalog.displayCatalog();

        System.out.println(catalog.displayProduct("car"));
    }

}
