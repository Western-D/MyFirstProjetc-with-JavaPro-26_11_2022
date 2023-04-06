package homework19;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Book", 250, true));
        Sys.sleep(8);
        products.add(new Product("Lime", 300, true));
        Sys.sleep(8);
        products.add(new Product("Book", 70, true));
        Sys.sleep(8);
        products.add(new Product("Banana", 700, true));
        Sys.sleep(8);
        products.add(new Product("Book", 250, false));
        Sys.sleep(8);
        products.add(new Product("Book", 247, true));
        Sys.sleep(8);
        products.add(new Product("Kiwi", 85, true));
        Sys.sleep(8);
        products.add(new Product("Book", 64, true));
        Sys.sleep(8);
        products.add(new Product("Plate", 500, true));
        Sys.sleep(8);
        products.add(new Product("Book", 670, true));
        Sys.sleep(8);

        System.out.println(Product.getLowerPrice(products,"Books") + "\n");
        System.out.println(Product.sumAllBookThatLowerThen75InThisYear(products)+ "\n");
        System.out.println(Product.getNewest3Products(products)+ "\n");
        System.out.println(Product.filter(products, "Lime")+ "\n");
        System.out.println(Product.getSortInGroup(products)+ "\n");
        System.out.println(Product.getDiscount10Percent(products)+ "\n");
    }
}