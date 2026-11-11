package day11assignment;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args) {

        Map<Integer, String> emp = new LinkedHashMap<>();

        // 1. Insert operation
        emp.put(1, "Tanushri");
        emp.put(2, "Naina");
        emp.put(3, "Madhuri");
        emp.put(4, "Zoya");

        System.out.println("Employee Records: " + emp);

       
    }
}