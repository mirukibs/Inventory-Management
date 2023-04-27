import java.util.HashMap;
import java.util.Map;

public class Inventory {
    
    private Map<Integer, Product> store;

    public Inventory() {
        this.store = new HashMap<Integer,Product>();
    }

    // ======================= METHODS ============================

    public boolean addProduct(Product myProduct) {
        if (this.store.containsKey(myProduct.getId())) {
            return false;
        }
        this.store.put(myProduct.getId(), myProduct);
        return true;
    }

    public void removeProduct(int id) {
        this.store.remove(id);
    }

    public void increaseProductQuantity(int id, int quantity) {
        this.store.get(id).increaseQuantity(quantity);
    }

    public void decreaseProductQuantity(int id, int quantity) {
        this.store.get(id).decreaseQuantity(quantity);
    }

    public void increaseProductPrice(int id, double price) {
        this.store.get(id).increasePrice(price);
    }

    public void decreaseProductPrice(int id, double price) {
        this.store.get(id).decreasePrice(price);
    }

    public void showInventory() {
        for (Product myProduct: this.store.values()) {
            System.out.println(
                myProduct.getName() + "\n" + 
                "Product ID: " + myProduct.getId() + "\t" +
                "Price: " + myProduct.getPrice() + "\t" +
                "Quantity: " + myProduct.getQuantity() + "\t" +
                "Total Cost: " + myProduct.getTotalPrice()
            );
            System.out.println();
        }
    }
}