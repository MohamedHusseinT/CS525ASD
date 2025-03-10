package Lab04G.main;

public class Application {
    public static void main(String[] args) {

        ProductCatalog catalog = new ProductCatalog();
        Category categoryall = new Category("All Products");
        Category categoryApps = new Category("Apps");
        Category categoryAuto = new Category("Auto");
        Category categoryBooks = new Category("Books");

        Product pOffice365 = new Product("Office 365", 10);
        Product pOffice2025 = new Product("Office 2025", 12);

        Product pAutop1 = new Product("Auto 1 part 1", 100);
        Product pAutop2 = new Product("Auto 1 part 2", 110);

        Product pBook1 = new Product("Book 1", 30);
        Product pBook2 = new Product("Book 2", 40);


        categoryall.addComponent(categoryApps);
        categoryApps.addComponent(pOffice365);
        categoryApps.addComponent(pOffice2025);

        categoryall.addComponent(categoryAuto);
        categoryAuto.addComponent(pAutop1);
        categoryAuto.addComponent(pAutop2);

        categoryall.addComponent(categoryBooks);
        categoryBooks.addComponent(pBook1);
        categoryBooks.addComponent(pBook2);


        categoryall.print();

    }
}
