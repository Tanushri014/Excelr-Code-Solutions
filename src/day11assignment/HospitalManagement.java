package day11assignment;

import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalManagement {

    public static void main(String[] args) {

        // Creating PriorityQueue
        PriorityQueue<Integer> patients = new PriorityQueue<>(
            Comparator.reverseOrder()
        );

        // Adding patients based on priority
        patients.add(2);
        patients.add(5);
        patients.add(1);
        patients.add(4);
        patients.add(3);

        System.out.println("Patients based on priority:");

        // Serving patients
        while (!patients.isEmpty()) {
            System.out.println("Serving patient with priority: " + patients.poll());
        }
    }
}