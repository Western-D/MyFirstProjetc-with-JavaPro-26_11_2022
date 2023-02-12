package homework18;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Box<T extends Fruits>{
    List<T> box = new ArrayList<>();

    public void addFruit(T fruit){
        box.add(fruit);
    }
    public void addFruit(T[] fruit){
        Collections.addAll(box, fruit);
    }
    public float getWeight (){
        return box.size()*box.get(0).weight;
    }
    public boolean compareTo(Box box){
        return this.getWeight() == box.getWeight();
    }
    public void merge(Box<T> box){
        this.box.addAll(box.box);
    }
}
