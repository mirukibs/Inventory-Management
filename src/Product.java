public class Product {

    private int id;
    private double price;
    private int quantity;

    public Product(int id, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // ========================== METHODS ================================

    public void increasePrice(double price) {
        this.price = this.price + price;
    }

    public void decreasePrice(double price) {
        this.price = this.price - price;
    }

    public void increaseQuantiry(int quantity) {
        this.quantity = this.quantity + quantity;
    }

    public void decreaseQuantity(int quantity) {
        this.quantity = this.quantity - quantity;
    }

    public double getTotalPrice() {
        return this.price * this.quantity;
    }
}