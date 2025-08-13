package problems;

public class TypeConversion {
    public static void main(String[] args) {
        // Automative type conversion can happen from small to large primitive datatypes
        // byte → short → int → long → float → double

        int small = 6;
        double large = small; // same for float and long also
        System.out.println(large);
        
        // No automatic conversions for wrapper classes
        Integer s = 7;
        Double d = s; // this will give compile time error


        // lossy convertion if from large to small 
        short x = 10;
        x =  x * 5; // cannot convert from int to short (large to small)
        System.out.print(x);
    }
}