public class App {
    public static void main(String[] args) {
        
        Product product1 = new Product("Soda",0001, 500, 24);
        Product product2 = new Product("Eggs", 0002, 350, 24);
        Product product3 = new Product("Juice", 0003, 1000, 5);
        Product product4 = new Product("Wali Kuku",0004, 2000, 1);

        Inventory stock = new Inventory();

        stock.addProduct(product1);
        stock.addProduct(product2);
        stock.addProduct(product3);
        stock.addProduct(product4);

        stock.showInventory();
    }
}
