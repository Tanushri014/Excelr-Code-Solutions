package day12assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo2 {

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>(
            Arrays.asList(10, 20, 29, 37, 34)
        );

        // Intermediate operation without terminal operation
        // filter() returns a new Stream.
        // No output because the stream is not executed.

        li.stream().filter(n -> n % 2 == 0);

        // Intermediate + Terminal operation
        // filter() filters even numbers.
        // forEach() executes the stream and prints the result.

        li.stream()
          .filter(n -> n % 2 == 0)
          .forEach(System.out::println);
        
    }
}