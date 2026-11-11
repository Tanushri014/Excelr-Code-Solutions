package day11assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountExample {
    public static void main(String[] args) {

        int target = 8;

        List<Integer> li = new ArrayList<>(Arrays.asList(2, 7, 29, 37, 34));

        long ans = li.stream()
                     .filter(n -> n > target)
                     .count();

        System.out.println("Count of elements greater than " + target + " is: " + ans);
    }
}