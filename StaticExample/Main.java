package StaticExample;

public class Main {
    //runs first and once
    static {
        System.out.println("Great!!!");
    }
    //main() is the entry point of a Java program.
    //It is static so that JVM can call it without creating an object of Main.
    //If it were non-static, the JVM would need to create an instance of Main, which is not possible since there’s no pre-defined constructor call in main().
    public static void main(String[] args) {
        Human kunal = new Human(22, "Kunal", 10000, false);
        Human rahul = new Human(24, "Rahul", 15000, true);

        System.out.println(Human.population); //follow convention

        //why main method is static?
        //because i am able to run this function without creating a instance of main class

        //ClassName.staticMethodName(); //this is how static methods are called
        // eg. ClassName.main(args); // Calling a static method this runs by jvm for execution of any class having main method

        //static method only access static data.

        //Static methods can access only static members directly, because they don’t belong to any object.

        //Like static variables and static blocks, the main() is also tied to class-level execution.

        // main() is static because the JVM needs to call it without creating an instance of the class
        // — it acts as the class-level entry point.
        fun();
        Main m = new Main();
        m.fun2();

        // error because static variables only belongs to class not methods
        // static int a = 5;
    }

    static void fun(){
        //you cannot access non-static stuff without referencing their instances in a static context.
        Main obj = new Main();
        obj.greeting();
    }

    void fun2(){
        greeting();
    }

    void greeting(){
        System.out.println("Greetings from my side");
    }
}
