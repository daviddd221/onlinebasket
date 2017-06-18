
public class Main  {
    public static void main(String[] args) {



        Basket basket = new Basket();
        ProductCatolog catalog = new ProductCatolog();
        Product puzzle = new Product("Toy", 3, 2, "Toy");
        Product car = new Product("Car", 6, 10,"Toy");
        Product bear = new Product("Bear", 1, 8, "Toy");

        Product hp1 = new Product("Harry Potter i Kamień Filozoficzny", 1, 49, "Book");


        catalog.addToCatalog(puzzle);
        catalog.addToCatalog(car);
        catalog.addToCatalog(bear);

        catalog.displayCatalog();

        System.out.println(catalog.findProduct("car"));

        hp1.createProduct();
    }

}
