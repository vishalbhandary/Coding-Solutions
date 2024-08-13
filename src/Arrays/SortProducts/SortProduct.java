package Arrays.SortProducts;

import java.util.Arrays;
import java.util.List;

//Given a list of products,sort them by price in descending order
// and then retrieve the top 3 most expensive products

public class SortProduct {
    private final String name;
    private final double price;

    public SortProduct(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    @Override
    public String toString() {
        return "SortProduct{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
    public static void main(String[] args) {
        List<SortProduct> products = Arrays.asList(
                new SortProduct("Laptop", 120000.00),
                new SortProduct("Tablet", 40000.00),
                new SortProduct("Headphones", 3000.00),
                new SortProduct("Smartwatch", 9000.00)
        );
        List<SortProduct> top3Expensive = products.stream()
                .sorted((p1, p2) -> Double.compare(p2.getPrice(),p1.getPrice()))
                .limit(3).toList();
        top3Expensive.forEach(System.out::println);
    }
}
