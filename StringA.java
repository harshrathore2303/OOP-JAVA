public class StringA {
    public static void main(String[] args) {
        // String: In Java, String is the type of object that can store the sequence of characters enclosed by double quotes and every character is stored in 16 bits i.e using UTF 16-bit encoding.
        String str = "Hello"; // string literals
        
        String obj = "Hey!"; // string object

        // These strings are created in heap memory.
        if (str == new String("Hello")){
            System.out.println("True");
        }

        String str1 = "Namaste";
        String str2 = "Namaste";
        if (str1 == str2){
            System.out.println("This is called as string pooling. Actually, \"Namaste\" gets stored in string pool. It happens during runtime. This is done for performance, security and efficiency reasons. str1 and str2 both pointing to same \"Namaste\"");
        }

        /**String Pool
         * String pool is a special area in JVM memory where string literals are stored for reuse.
         * JVM checks the string pool to see if "Namaste" exists.
         * If it doesn’t, it creates the string in the pool.
         * JVM ensures "Namaste" exists only once in that pool.
         * str1 is assigned a reference to "Namaste" in the pool.
         * When str2 is assigned "Namaste", JVM checks the pool, finds it, and points str2 to the same memory location as str1.
         * Both str1 and str2 point to the same object in the pool.
         */

        // String interning is the process of storing only one copy of each distinct string literal in a special memory area called the String Pool (inside the JVM’s Method Area / Metaspace).

        // Runtime runtime = Runtime.getRuntime();

        // long totalMemory = runtime.totalMemory(); // Total heap memory allocated
        // long freeMemory = runtime.freeMemory();   // Free heap memory
        // long usedMemory = totalMemory - freeMemory; // Memory currently in use

        // System.out.println("Total Heap Memory: " + totalMemory + " bytes");
        // System.out.println("Free Heap Memory: " + freeMemory + " bytes");
        // System.out.println("Used Heap Memory: " + usedMemory + " bytes");
    }
}
