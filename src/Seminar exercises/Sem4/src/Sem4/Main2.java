package Sem4;
import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.Arrays;

class Product {
    private String name;
    private double price;
    private String category;
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
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    @Override
    public String toString() {
        return "Product: " + name + " " + "Price: " + price + " " + "Category: " + category;
    }
}
public class Main2 {
    public static List<Product> getProductsByCategory(List<Product> products, String category) {
        return products.stream().filter(p -> p.getCategory().equals(category)).sorted(Comparator.comparing(Product::getPrice)).toList();
    }
    public static List<Product> getExpensiveProducts(List<Product> products, double minPrice) {
        return products.stream().filter(p -> p.getPrice() > minPrice).sorted(Comparator.comparing(Product::getPrice).reversed()).toList();
    }
    public static void main(String[] args) {
        List<Product> products = Arrays.asList(
                new Product("Laptop", 1200, "Electronics"),
                new Product("Mouse", 25, "Electronics"),
                new Product("Desk", 200, "Furniture"),
                new Product("Chair", 150, "Furniture"),
                new Product("Phone", 900, "Electronics")
        );
        List<Product> electronics = getProductsByCategory(products, "Electronics");
        System.out.println(electronics);
        List<Product> expensive = getExpensiveProducts(products, 300);
        System.out.println(expensive);
    }
}
