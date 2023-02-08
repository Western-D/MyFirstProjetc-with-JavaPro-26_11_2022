package homework17;

import java.util.ArrayList;

public class MyIterator {
    private ArrayList<Integer> dates;
    private int iterator = -1;


    public MyIterator(SimpleTree data) {
        dates = new ArrayList<>();
        addDates(data.rootNode);
    }

    private void addDates(Node node) {
        if (node.leftNode != null) {
            addDates(node.leftNode);
        }
        if (node.rightNode != null) {
            addDates(node.rightNode);
        }
        dates.add(node.data);
    }
    public int next(){
        ++iterator;
        if(iterator < dates.size())
            return(dates.get(iterator));
        return -1;
    }
    public boolean hasNext(){
        try {
            int tempIterator = iterator + 1;
            dates.get(tempIterator);
            return true;
        }catch (IndexOutOfBoundsException e){
            return false;
        }
    }
}

