import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercicio2{

    public static void main(String[] args) {
        

        List<Product> products = new ArrayList<>();

        products.add(new Product(22.00, "controle"));
        products.add(new Product(2.00, "pilha"));
        products.add(new Product(33.00, "costela"));
        products.add(new Product(25.00, "multiuso"));

        products.sort((p1, p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));
    
        System.out.printf("%nLista completa: %n");
        products.forEach( p -> System.out.println(p) );

        //products.removeIf(Product::staticProductPredicade); metodo static reference
        //products.removeIf(Product::nonStaticProductPredicate); // metodo instance reference

        //Predicate<Product> pred = (p) -> p.getPrice() >= 20;
        //products.removeIf(pred);

        //products.removeIf( p -> p.getPrice() >= 20 );
        
        //System.out.printf("%nLista depois de removida: %n");
        //products.forEach( p -> System.out.println(p) );
        System.out.println();

        List<String> names = products.stream()
            .map( Product::staticProductFunction )
            .collect(Collectors.toList());
            
        names.forEach( System.out::println );

        System.out.println();

        names = products.stream()
        .map( Product::nonStaticProductFunction )
        .collect(Collectors.toList());
        
        names.forEach( System.out::println );

        System.out.println();

        names = products.stream()
        .map( p -> p.getName().toUpperCase() )
        .collect(Collectors.toList());
        
        names.forEach( System.out::println );

        System.out.println();

        ProductService productService = new ProductService();

        System.out.println( "Soma dos produtos que começam com a letra \"c\" ");
        double sum = productService.sumProducts(products, p -> p.getName().toUpperCase().charAt(0) == 'C');
        System.out.println( sum );

    }
}