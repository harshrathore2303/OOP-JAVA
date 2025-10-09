package StreamsDemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Streams
        // java 8 -> minimal code, functional programming,
        // java 8 -> Lambda expressions, streams, Date & Time API

        // lambda expression
        // lambda expression is an anonymous function ( no name, no return type, no access modifier ).
        //
        // Runnable is a functional interfaces. Functional interfaces has only one abstract method without body.
        Thread t1 = new Thread(() -> {
            System.out.println("Hello");
        });

//        System.out.println(new SumOperation());
        MathOperation sum = (a, b) -> a + b;

        int a = sum.operate(6, 4);
        System.out.println(a);

        // Predicate --> Function interface(Boolean valued function)

        Predicate<Integer> isEven = x -> x % 2 == 0;
//        System.out.println(isEven.test(4));

        // Function is a functional interface which is introduced in java 8
        Function<Integer, Integer> doubleIt = x -> 2 * x;
        Function<Integer, Integer> halfIt = x -> x / 2;
        System.out.println(doubleIt.apply(4));
        System.out.println(doubleIt.andThen(halfIt).apply(4));

        // Consumer
        Consumer<Integer> print = x -> System.out.println(x);
        print.accept(4);
        List<Integer> list = Arrays.asList(1,2,4);
        Consumer<List<Integer>> printList = x -> {
            for (int i : x){
                System.out.println(i);
            }
        };
        printList.accept(list);

        // Supplier
        Supplier<String> giveHelloWorld = () -> "Hello World";
        System.out.println(giveHelloWorld.get());

        // combined example
        Predicate<Integer> predicate = x -> x % 2 == 0;
        Function<Integer, Integer> function = x -> x * x;
        Consumer<Integer> consumer = x -> System.out.println(x);
        Supplier<Integer> supplier = () -> 100;

        if (predicate.test(supplier.get())){
            consumer.accept(function.apply(supplier.get()));
        }

        // UnaryOperator, BinaryOperator
        UnaryOperator<Integer> unaryOperator = x -> 2 * x;
        BinaryOperator<Integer> binaryOperator = (x, y) -> x + y;

        // Method references --> use method without invoking & in place of lambda expression
        List<String> students = Arrays.asList("Ram", "Shyam", "Ghanshyam");
        students.forEach(x -> System.out.println(x));
        students.forEach(System.out::println); // inside system then go inside out and get reference of println method

        // Constructor reference
        List<String> names = Arrays.asList("A", "B", "C");
        List<MobilePhones> mobilePhonesList = names.stream().map(MobilePhones::new).collect(Collectors.toList());

        // Streams: Introduced in Java 8
        // process collections of data in a functional and declarative manner.
        // Simplify data processing
        // Embrace functional programming
        // Improve Readabilty and Maintainability
        // Enable easy parallelism

        // What is stream?
        // a sequence of elements supporting functional and declarative programming

        // How to use Stream?
        // source, intermediate operations & terminal operations

        List<Integer> numbers = Arrays.asList(1,2,3,4, 5);
        // find even numbers using streams
        System.out.println(numbers.stream().filter(x -> x % 2 == 0).count());

        // Creating Streams
        // 1. From Collections
        List<Integer> nums = Arrays.asList(1,2,3,4, 5);
        Stream<Integer> stream = list.stream();
        // 2. From Arrays
        String[] array = {"a", "b", "c"};
        Stream<String> stream1 = Arrays.stream(array);
        // 3. Using Stream.of()
        Stream<Object> objectStream = Stream.of("a", "b");
        // 4. Infinite streams
        Stream<Integer> generate = Stream.generate(() -> 1);
        List<Integer> collect = Stream.iterate(1, x -> x + 1).limit(100).collect(Collectors.toList());
        System.out.println(collect);


    }
}

class MobilePhones{
    String name;

    MobilePhones(String name){
        this.name = name;
    }
}


@FunctionalInterface
interface MathOperation{
    int operate(int a, int b);
}

class SumOperation implements MathOperation{
    @Override
    public int operate(int a, int b){
        return a + b;
    }
}
