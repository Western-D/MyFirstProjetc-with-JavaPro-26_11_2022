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
        Apple[] appples = new Apple[15];
        Orange[] oranges = new Orange[15];
        for (int i = 0; i < 15; i++) {
            appples[i] = new Apple();
            oranges[i] = new Orange();
        }
        for (int i = 0; i < 10; i++) {
            appleBox.addFruit(new Apple());
            orangeBox.addFruit(new Orange());
        }

        appleBox1.addFruit(appples);
        orangeBox1.addFruit(oranges);

        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());
        System.out.println(orangeBox.getWeight());
        System.out.println(orangeBox1.getWeight());

        System.out.println(appleBox1.compareTo(orangeBox));
        System.out.println(appleBox1.compareTo(orangeBox1));

        appleBox.merge(appleBox1);
        orangeBox.merge(orangeBox1);

        System.out.println(appleBox.getWeight());
        System.out.println(orangeBox.getWeight());
    }

    public List<T> toList(T [] array){
        List<T> list = new ArrayList<>();
        Collections.addAll(list, array);
        return list;
    }
}
