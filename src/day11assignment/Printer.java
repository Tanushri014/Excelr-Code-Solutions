package day11assignment;

import java.util.LinkedList;
import java.util.Queue;

public class Printer {

    public static void main(String[] args) {

        Queue<String> printer = new LinkedList<>();

        // 1. Enqueue operation (Add printer jobs)
        printer.add("Document1.pdf");
        printer.add("Assignment.docx");
        printer.add("Resume.pdf");
        printer.add("ProjectReport.pdf");

        System.out.println("Printer Queue: " + printer);

        // 2. Dequeue operation (Remove and process the first job)
        System.out.println("Printing: " + printer.poll());

        System.out.println("Queue after Dequeue: " + printer);

        // 3. Peek operation (View the next job without removing it)
        System.out.println("Next Job: " + printer.peek());

        System.out.println("Final Printer Queue: " + printer);
    }
}