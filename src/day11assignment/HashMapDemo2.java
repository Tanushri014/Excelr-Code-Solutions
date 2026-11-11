package day11assignment;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();

        // 1. Insert operation
        map.put(1, "Tanushri");
        map.put(2, "Naina");
        map.put(3, "Madhuri");
        map.put(4, "Zoya");

        System.out.println("Student Records: " + map);

        // 2. Update operation
        map.put(2, "Ananya");

        System.out.println("After Updating: " + map);

        // 3. Search operation
        int rollNo = 3;

        if (map.containsKey(rollNo)) {
            System.out.println("Student Found: " + map.get(rollNo));
        } else {
            System.out.println("Student Not Found");
        }

        // 4. Delete operation
        map.remove(4);

        System.out.println("After Deletion: " + map);
    }
}