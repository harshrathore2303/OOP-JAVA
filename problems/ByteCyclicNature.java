package problems;

//All integer primitives in Java use fixed bit sizes.
public class ByteCyclicNature {
    public static void main(String[] args) {
        // byte has 8 bits means 1 byte.
        // therefore its range is from -128 to 127
        // byte, short, int, long and some wrapper classes show a cyclic nature. Let's see
        byte x = 127;
        x++; // this will take x to -128. Not to 128(key point).
        x++; // -127
        System.out.print(x);

        int i = 2147483647;
        i++;
        i++;
        System.out.println(i);

    }
}