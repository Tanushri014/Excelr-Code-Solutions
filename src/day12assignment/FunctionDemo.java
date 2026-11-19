
package day12assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FunctionDemo {

    public static void main(String[] args) {

        List<Integer> li = new ArrayList<>(
            Arrays.asList(10, 20, 29, 37, 34, 20, 10)
        );

        // 1. sorted() - Ascending order
        System.out.println("Ascending order:");
        li.stream()
          .sorted()
          .forEach(System.out::println);


        // 2. sorted() - Descending order
        System.out.println("Descending order:");
        li.stream()
          .sorted((a, b) -> b - a)
          .forEach(System.out::println);


        // 3. distinct() - Removes duplicate elements
        System.out.println("Distinct elements:");
        li.stream()
          .distinct()
          .forEach(System.out::println);


        // 4. limit() - Displays first 3 elements
        System.out.println("Limit:");
        li.stream()
          .limit(3)
          .forEach(System.out::println);


        // 5. skip() - Skips first 2 elements
        System.out.println("Skip:");
        li.stream()
          .skip(2)
          .forEach(System.out::println);
    }
}
