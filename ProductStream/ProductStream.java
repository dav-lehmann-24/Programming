import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    String name;
    double price;
    String category;

    public Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

public class ProductStream {
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
            new Product("Smartphone", 1200.00, "Electronics"),
            new Product("Sport shoes", 89.00, "Clothes"),
            new Product("Monitor", 350.00, "Electronics"),
            new Product("Fragrance", 110.00, "Hygiene"),
            new Product("T-Shirt", 55.00, "Clothes"),
            new Product("Soda", 2.25, "Nutrition"),
            new Product("Shower gel", 8.99, "Hygiene"),
            new Product("Chips", 2.00, "Nutrition")
        );

        Map<String, Double> result = products.stream()
        .collect(Collectors.groupingBy(
                Product::getCategory,
                Collectors.summingDouble(Product::getPrice)
            ));
        
        result.forEach((category, sum) ->
            System.out.println(category + ": " + String.format("%.2f", sum) + "€")
        );
    }    
}