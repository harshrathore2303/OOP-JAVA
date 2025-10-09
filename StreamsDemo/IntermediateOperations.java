package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class IntermediateOperations {
    public static void main(String[] args) {
        // Intermediate Operations transform a stream into another stream
        // They are lazy, meaning they don't execute until a terminal operation is invoked.

        // 1. filter
        List<String> list = Arrays.asList("Ram", "Shyam", "Ghanshyam", "Akshit", "Aashu");
        Stream<String> filteredStream = list.stream().filter(x -> x.startsWith("A")); // no filtering at this point, intermediate operation
        long a = list.stream().filter(x -> x.startsWith("A")).count(); //

        // 2. map
        Stream<String> stringStream = list.stream().map(String::toUpperCase);

        // 3. sorted
        Stream<String> sortedStream = list.stream().sorted();
        Stream<String> sortedStreamUsingComparator = list.stream().sorted((x,y) -> x.length() - y.length());

        // 4. distinct
        list.stream().filter(x -> x.startsWith("A")).count();

        // 5. limit
        // 6. skip
    }
}
