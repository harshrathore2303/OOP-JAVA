public class StringA {
    public static void main(String[] args) {
        String str = "Hello";
        
        if (str == new String("Hello")){
            System.out.println("True");
        }

        // Runtime runtime = Runtime.getRuntime();

        // long totalMemory = runtime.totalMemory(); // Total heap memory allocated
        // long freeMemory = runtime.freeMemory();   // Free heap memory
        // long usedMemory = totalMemory - freeMemory; // Memory currently in use

        // System.out.println("Total Heap Memory: " + totalMemory + " bytes");
        // System.out.println("Free Heap Memory: " + freeMemory + " bytes");
        // System.out.println("Used Heap Memory: " + usedMemory + " bytes");
    }
}
