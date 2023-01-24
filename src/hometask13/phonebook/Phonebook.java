package hometask13.phonebook;

import java.util.ArrayList;
import java.util.List;

public class Phonebook {
    public List<Subscriber> phonebook = new ArrayList<>();

    public void addSubscriber (String name, String phoneNumber){
        phonebook.add(new Subscriber(name,phoneNumber));
    }



    public Subscriber find (String name){

        for (Subscriber sub :
                phonebook) {
            if (sub.getName().equals(name))
                return sub;
        }
        return null;
    }

    public ArrayList<Subscriber> findAll(String name){
        ArrayList<Subscriber> list = new ArrayList<>();
        for (Subscriber sub :
                phonebook) {
            if (sub.getName().equals(name))
                list.add(sub);
        }
        if (list.isEmpty())
            return null;

        return list;
    }
}
