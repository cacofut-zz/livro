

public class Product{

    private double price;
    private String name;

    public Product(){

    }

    public Product(double price, String name) {
        this.price = price;
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static boolean staticProductPredicade( Product p ){
        return p.getPrice() >= 20;
    }

    public static String staticProductFunction(Product p){
        return p.getName().toUpperCase();
    }

    public String nonStaticProductFunction(){
        return getName().toUpperCase();
    }

    public boolean nonStaticProductPredicate(){
        return getPrice() >= 20;
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }


        
    
}