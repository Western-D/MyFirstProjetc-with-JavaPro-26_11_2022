package homework17;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        SimpleTree myTree = new SimpleTree();
        for (int i = 0; i < 25; i++) {
            myTree.add(new Random().nextInt(50));
        }
        MyIterator iterator = myTree.getIterator();

        for (int i = 0; i < myTree.getSize(); i++) {
            if (iterator.hasNext())
                System.out.println(iterator.next());
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(myTree.findNumber(i));
        }
    }
}
