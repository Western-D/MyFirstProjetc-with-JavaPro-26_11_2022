package homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main <T> {
    public static void main(String[] args) {
        Box<Apple> appleBox = new Box<>();
        Box<Apple> appleBox1 = new Box<>();
        Box<Orange> orangeBox = new Box<>();
        Box<Orange> orangeBox1 = new Box<>();
        Apple[] appples = new Apple[11];
        Orange[] oranges = new Orange[11];
        for (int i = 0; i < 11; i++) {
            appples[i] = new Apple();
            oranges[i] = new Orange();
        }
        for (int i = 0; i < 15; i++) {
            appleBox.addFruit(new Apple());
        }
        for (int i = 0; i < 10; i++) {
            orangeBox.addFruit(new Orange());
        }
        appleBox1.addFruit(appples);
        orangeBox1.addFruit(oranges);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(appleBox.compareTo(orangeBox));
        System.out.println(appleBox1.compareTo(orangeBox1));
    }

    public List<T> toList(T [] array){
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
