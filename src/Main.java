import java.io.FileNotFoundException;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException {

        // zapisz produkty do pliku tekstowego, bedzie na razie sluzyc nam za bazde danych
        //odczytuj produktu rowniez z pliku tekstowego :)
        // good luck!



        Basket basket = new Basket();
        ProductCatolog catalog = new ProductCatolog();
        Product puzzle = new Product("Puzzle", 3, 2, "Toy");
        Product car = new Product("Car", 6, 10,"Toy");
        Product bear = new Product("Bear", 1, 8, "Toy");

        Product hp1 = new Product("Harry Potter i Kamień Filozoficzny", 1, 49, "Book");


        catalog.addToCatalog(puzzle);
        catalog.addToCatalog(car);
        catalog.addToCatalog(bear);

        basket.addToBasket(car, 2);



//        System.out.println(catalog.findProduct("car"));

       // hp1.createProduct();
//        catalog.saveToFile("BazaDanych.txt");
//
//        catalog.loadFromFile("BazaDanych.txt");
//        catalog.displayCatalog();

        Payment payment = new Payment();

        payment.purchase(basket.valueOfBasket());


    }

}
