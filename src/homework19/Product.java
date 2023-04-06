package homework19;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

public class Product {
    private String productName;
    private int productIdentification;
    private float price;
    private boolean discount;
    private LocalDateTime dateTime;

    public Product(String products, float price, boolean discount) {
        this.productName = products;
        this.price = price;
        this.discount = discount;
        productIdentification = hashCode();
        dateTime = LocalDateTime.now();
    }


    public String getProductName() {
        return productName;
    }

    public int getProductIdentification() {
        return productIdentification;
    }

    public float getPrice() {
        return price;
    }

    public boolean isDiscount() {
        return discount;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public static List filter(List<Product> list, String filterName){
        float filterPrice = 250f;
        return list.stream().filter(s -> s.productName.equalsIgnoreCase(filterName)&& s.price > filterPrice).toList();
    }
    public static List getDiscount10Percent(List<Product> list){
        float discount = 10f;

        return list.stream().filter(s-> {
            if (s.discount)
                s.price *= 1 - discount / 100;
            return true;
        }).toList();
    }

    public static List getDiscount(List<Product> list, float discount){

        return list.stream().filter(s-> {
            if (s.discount)
                s.price *= 1 - discount / 100;
            return true;
        }).toList();
    }

    public static Product getLowerPrice(List<Product> list, String productName){
        try {
            return list.stream().filter(s -> s.productName.equalsIgnoreCase(productName))
                    .toList().stream().sorted(Comparator.comparing(product ->  product.price)).limit(1).findFirst().get();
        }catch (NoSuchElementException e){
            System.out.println("Продукт в категории: '" + productName + "' не найден");
        }
            return null;

    }

    public static List getNewest3Products(List<Product> productList) {

            List<Product> collect = productList.stream()
                    .sorted(Comparator.comparing(product -> product.dateTime))
                    .collect(Collectors.toList());
            Collections.reverse(collect);
            return collect.stream().limit(3).collect(Collectors.toList());
    }

    public static double sumAllBookThatLowerThen75InThisYear(List<Product> products){
            return products.stream().filter(product -> product.productName.equalsIgnoreCase("book")
                    && product.price < 75 && product.dateTime.getYear() == LocalDateTime.now().getYear())
                    .mapToDouble(product -> product.price).sum();
    }

    public static Map getSortInGroup(List<Product> products){
        return products.stream()
                .collect(Collectors.groupingBy(Product::getProductName));
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, price, discount);
    }
    @Override
    public String toString() {
        return "Product{" + "\n" +
                "productName: " + productName + '\'' +
                ", price: " + price +
                ", dateTime: " + dateTime +
                '}';
    }

}

