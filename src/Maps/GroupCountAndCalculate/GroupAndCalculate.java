package Maps.GroupCountAndCalculate;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Given a map where the keys are product names and the values are their prices,
//group the products by price ranges and calculate price in each range.
public class GroupAndCalculate {
    public static void main(String[] args) {
        Map<String, Double> products = new HashMap<>();
        products.put("ProductA", 25.0);
        products.put("ProductB", 12.0);
        products.put("ProductC", 8.0);
        products.put("ProductD", 67.0);
        products.put("ProductE", 19.0);
        products.put("ProductF", 55.0);

        Map<String, Double> priceRanges = products.entrySet().stream()
                .collect(Collectors.groupingBy(entry -> {
                    double price = entry.getValue();
                    if(price <= 20){
                        return "0-20";
                    } else if (price <= 40) {
                        return "21-40";
                    } else if (price <= 60) {
                        return "41-60";
                    } else {
                        return "60+";
                    }
                },Collectors.averagingDouble(Map.Entry::getValue)));
        System.out.println(priceRanges);
    }
}
