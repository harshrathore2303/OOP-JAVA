public class Main {
    // public: Accessible from anywhere so the JVM can call it.
    // static: No object of the class is needed to run it.
    // void: Doesn’t return anything.
    // String[] args: An array of String objects containing command-line arguments.
    static public void main(String[] args) {
        // All about command line argument
        // In terminal write following command
        // javac Main.java
        // java Main Hello World
         
        System.out.println("Number of arguments: " + args.length);
        for (String arg : args) {
            System.out.println(arg);
        }
        // Output
        // Number of arguments: 2
        // Hello
        // World

        // Why Use Command-Line Arguments?
        // 1) Pass runtime configurations (e.g., sorting order, file paths, mode selection).
        // 2) Avoid hardcoding values.
        // 3) Increase flexibility without recompiling.
    }

    static public void name(){
        System.out.println("Harshit");
    }
}
