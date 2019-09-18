
public class Product implements Comparable<Product> {

    private String name;
    private Double price;

    public Product() {

    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product name(String name) {
        this.name = name;
        return this;
    }

    public Product price(double price) {
        this.price = price;
        return this;
    }

    @Override
    public int compareTo(Product other) {
        return price.compareTo(other.getPrice());
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

    
    
}