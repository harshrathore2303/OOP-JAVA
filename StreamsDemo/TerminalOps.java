package StreamsDemo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOps {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4, 5);

        // 1. collect
        numbers.stream().skip(1).collect(Collectors.toList());

        // 2. forEach
        numbers.stream().forEach(x -> System.out.println(x));

        // 3. reduce: Combines elements to produce a single result
        Optional<Integer> reduce = numbers.stream().reduce((a, b) -> a + b);
        System.out.println(reduce.get());

        // 4. count

        // 5. anyMatch, allMatch, noneMatch
        boolean b = numbers.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(b);
        boolean b1 = numbers.stream().allMatch(x -> x > 0);// return true if all elements satify the condition
        System.out.println(b1);
        boolean b2 = numbers.stream().noneMatch(x -> x < 0);
        System.out.println(b2);

        // 6. findFirst, findAny
        System.out.println(numbers.stream().findFirst().get());
        System.out.println(numbers.stream().findAny().get());

        // Example: Summing Values
        System.out.println(numbers.stream().reduce(Integer::sum).get());

        // Example: Counting Occurences of a character
        String sentence = "Hello World";
        System.out.println(sentence.chars().filter(x -> x == 'l').count());

        // stateful & stateless
    }
}
