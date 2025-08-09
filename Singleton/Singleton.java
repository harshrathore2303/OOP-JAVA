package Singleton;
//these classes only have single access point thats why called singleton classes
public class Singleton {
    //no can use it. means this can be only used here
    private Singleton() {

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
