package day14assignment;

import java.util.HashSet;
import java.util.Set;

public class DuplicatesInAList {

    public static void main(String[] args) {

        int arr[] = {1, 2, 2, 2, 2, 6, 6, 4};

        Set<Integer> st = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {

            if (!st.add(arr[i])) {
                duplicates.add(arr[i]);
            }

        }

        System.out.println(duplicates);
    }
}