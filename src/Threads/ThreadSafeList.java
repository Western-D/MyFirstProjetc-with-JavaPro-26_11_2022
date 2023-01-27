package Threads;

import hometask12.MyRunnableObject;

import java.util.ArrayList;
import java.util.List;

public class ThreadSafeList extends Thread{
    private List<Thread> threadList = new ArrayList<>();


    public ThreadSafeList(int maxThread, MyRunnableObject object) {
        for (int i = 0; i < maxThread; i++) {
            add(new Thread(object, Integer.toString(i+1)));
        }
    }

    private void add (Thread thread){
            threadList.add(thread);
    }

    public void remove (MyRunnableObject thread){
        threadList.remove(thread);
    }

    public List<Thread> get (){
        return threadList;
    }

    public static void sleep(int sleepSecond){
        try {
            Thread.currentThread().sleep(sleepSecond*1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
