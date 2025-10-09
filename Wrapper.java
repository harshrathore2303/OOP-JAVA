public class Wrapper {
    public static void main(String[] args) {
        int a = 10;
        int b = 20; 
        //everything is pass by value in primitives. value is passed not reference
        swap(a, b);

        System.out.println(a + " " + b);

        Integer num1 = 45;
        Integer num2 = 55;
        //the reason that values are not swapped is because Integer is final class
        swap(num1, num2);
        System.out.println(num1 + " " + num2);


        //final: prevent the content to be modified. Final variable is always capital
        //final variables are initialized during declaration. They cannot be initialized after declaration. Reason:Because we cannot modify them.
        final int INCREASE = 1;
        //connot be modified
        // INCREASE = 4;

        //final in case of reference variables:
        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "Kunal Kushwaha"; //Now the value can be changed but reference cannot be changed.
        // kunal = new A("New object"); //this is not possible if a object is declared final.

        //garbage collection
        //java destroy the unused objects mannually
        //i cannot destroy objects mannualy in java but i can tell java what to do when an object is destroyed by java.
        //by using finalize

        //package: contains boxes of classes
        //package is just a folder and cannot hold more than one file with same name
        //package can have packages in them
        //first package is called root.
        A obj = new A("Object");
        System.out.println(obj);
        //may be a used for garbage collection
        System.gc();
    }

    static void swap(Integer a, Integer b){
        int temp = a;
        a = b;
        b = temp;
    }
}


class A {
    final int num = 9;
    String name;

    public A(String name){
        this.name = name;
    }

    // The finalize() method is called by the garbage collector when it determines that there are no more references to an object. The intention was to provide a last chance for the object to clean up resources (like closing files or releasing network connections) before it's removed from memory.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}