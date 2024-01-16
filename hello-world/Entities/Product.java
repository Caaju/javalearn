package Entities;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public void addProduct(int quantity) {
        this.quantity += quantity;
    }

    public void removeProduct(int quantity) {
        this.quantity -= quantity;
    }

    @Override
    public String toString() {
        return String.format("Product name %s, price %.2f, quantity in stock %d, Total price in stock %.2f%n", this.name,this.price,this.quantity, this.price*this.quantity);
    }
}
