import java.io.FileNotFoundException;

public class Main  {
    public static void main(String[] args) throws FileNotFoundException {

        ShopOnline build = new ShopOnline();

        System.out.println("Co chcesz zrobic");
        System.out.println("1. Stwórz produkt");
        System.out.println("2. Wyswietl produkty ");
        System.out.println("3. Dodaj do koszyka");
        System.out.println("4. Wyswietl koszyk");
        System.out.println("5. Stworz klienta");
        System.out.println("6. Pokaz klientow");
        System.out.println("7. Zapisz do pliku");
        System.out.println("8. Wczytaj z pliku");
        System.out.println("9. Zaloguj");


        int wybor = build.getIn().nextInt();
        while (wybor != 0) {
            switch (wybor) {
                case 1:
                    build.getProductCatolog().addToCatalog(build.getProduct().createProduct());
                    break;

                case 2:
                    build.getProductCatolog().displayCatalog();
                    break;

                case 3:
                    System.out.println();
                    System.out.println("Co chcesz dodać?");
                    build.getProductCatolog().displayCatalog();
                    System.out.println();
                    System.out.println("Podaj numer przedmiotu");
                    wybor = build.getIn().nextInt();
                    System.out.println("Podaj ilosc");
                    int ilosc = build.getIn().nextInt();
                    build.getBasket().addToBasket(build.getProductCatolog().findById(wybor), ilosc);
                    break;

                case 4:
                    build.getBasket().displayBasket();
                    break;

                case 5:
                    build.getRegister().addCustomer(build.getRegister().registration());
                    break;

                case 6:
                    build.getRegister().displayCustomers();
                    break;

                case 7:
                    build.getRegister().saveCustomersToFile("BazaKlientow.txt");
                    break;

                case 8:
                    build.getRegister().loadCustomersFromFile("BazaKlientow.txt");
                    break;

                case 9:
                    System.out.println("Podaj login");
                    String login0 = build.getIn().nextLine();
                    System.out.println("Podaj hasło");
                    String password = build.getIn().nextLine();
                    build.getLogin().logowanie(login0, password);
                    break;

//                case 10:
//                    System.out.println("Którego klienta chcesz edytować");
//                    int numer = in.nextInt();
//                    modify.modifyCustomer(numer);

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
            System.out.println("9. Zaloguj");
            wybor = build.getIn().nextInt();
        }
    }

}

