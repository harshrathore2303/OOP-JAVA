package Singleton;

import access.A;

public class Main {
    public static void main(String[] args) {
        //all 3 ref variables are pointing to just one object
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        A a = new A(10, "kunal", null);
        System.out.println(a.num);
    }
}
