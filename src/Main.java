import java.io.FileNotFoundException;
import java.util.Scanner;
//JEDEN WIELKI ROZPIERDOL TU JEST
public class Main  {
    public static void main(String[] args) throws FileNotFoundException {

        // zapisz produkty do pliku tekstowego, bedzie na razie sluzyc nam za bazde danych
        //odczytuj produktu rowniez z pliku tekstowego :)
        // good luck!
        Scanner in = new Scanner(System.in);
        Customer tadek = new Customer();
        Basket basket = new Basket();
        ProductCatolog catalog = new ProductCatolog();
        Registration register = new Registration();
        Product puzzle = new Product("Puzzle", 3, 2, "Toy", 1);
        Product car = new Product("Car", 6, 10, "Toy", 2);
        Product bear = new Product("Bear", 1, 8, "Toy", 3);

        Product hp1 = new Product("Harry Potter i Kamień Filozoficzny", 1, 49, "Book", 4);


        catalog.addToCatalog(puzzle);
        catalog.addToCatalog(car);
        catalog.addToCatalog(bear);


//co to kurwa jest ????
//        System.out.println(catalog.findProduct("car"));

        // hp1.createProduct();
//       catalog.saveToFile("BazaPrzedmiotow.txt");
////
//       catalog.loadFromFile("BazaPrzedmiotow.txt");
////        catalog.displayCatalog();

        Payment payment = new Payment();

        payment.purchase(basket.valueOfBasket(), tadek);

        System.out.println("Co chcesz zrobic");
        System.out.println("1. Stwórz produkt");
        System.out.println("2. Wyswietl produkty ");
        System.out.println("3. Dodaj do koszyka");
        System.out.println("4. Wyswietl koszyk");
        System.out.println("5. Stworz klienta");
        System.out.println("6. Pokaz klientow");
        System.out.println("7. Zapisz do pliku");
        System.out.println("8. Wczytaj z pliku");


        int wybor = in.nextInt();
        while (wybor != 0) {
            switch (wybor) {
                case 1:
                    catalog.addToCatalog(puzzle.createProduct());
                    break;

                case 2:
                    catalog.displayCatalog();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Co chcesz dodać?");
                    catalog.displayCatalog();
                    System.out.println();
                    System.out.println("Podaj numer przedmiotu");
                    wybor = in.nextInt();
                    System.out.println("Podaj ilosc");
                    int ilosc = in.nextInt();
                    basket.addToBasket(catalog.findById(wybor), ilosc);
                    break;

                case 4:
                    basket.displayBasket();
                    break;

                case 5:
                    register.addCustomer(register.registration());
                    break;

                case 6:
                    register.displayCustomers();
                    break;

                case 7:
                    register.saveCustomersToFile("BazaKlientow.txt");
                    break;

                case 8:
                    register.loadCustomersFromFile("BazaKlientow.txt");
                    break;

                default:
                    System.out.println("blad");
            }
            System.out.println("-----------------------------------------------------------------------------------");
            System.out.println("Co chcesz zrobic");
            System.out.println("1. Stwórz produkt ");
            System.out.println("2. Wyswietl produkty ");
            System.out.println("3. Dodaj do koszyka");
            System.out.println("4. Wyswietl koszyk");
            System.out.println("5. Stworz klienta");
            System.out.println("6. Pokaz klientow");
            System.out.println("7. Zapisz do pliku");
            System.out.println("8. Wczytaj z pliku");
            wybor = in.nextInt();
        }
    }

}
