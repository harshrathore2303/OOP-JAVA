package StaticExample;

public class StaticBlock {
//    Q: What is the use of static blocks in Java?
//    A: To initialize static data before any object is created or before main() is executed.

    //first all static elements will run
    static int a = 4;
    static int b;
    
    //will run only once
    static {
        System.out.println(b);
        System.out.println("I am in static block");
        b = a * 5;
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
        StaticBlock.b += 3;
        
        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
