package Generics;

import java.util.ArrayList;
import java.util.Arrays;

public class WildCards<T extends Number> {
    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public WildCards() {
        this.data = new Object[DEFAULT_SIZE];
    }

    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object[] temp = new Object[data.length * 2];
        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove() {
        T removed = (T)data[--size];
        return removed;
    }

    public T get(int index) {
        return (T)data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
//        ArrayList listtt = new ArrayList();
//        listtt.add("svds");
//        listtt.add(45);
//        System.out.println(listtt);

        WildCards list = new WildCards();
        list.add(4);
        list.add(5);
        list.add(6);
        for (int i = 0; i < 20; i++) {
            list.add(i);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add("sfd"); //cannot be added because of generics

        //in place of generics only classes like Long, Integer, String can be added not primitives like int, float, long
//        ArrayList<GENERICS> list = new ArrayList<>();

        WildCards<Integer> list3 = new WildCards<>();
        for (int i = 0; i < 20; i++) {
            list3.add(i * 2);
        }
        System.out.println(list3);
    }
}
