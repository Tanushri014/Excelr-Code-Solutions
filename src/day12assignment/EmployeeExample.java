package day12assignment;

import java.util.*;
import java.util.stream.Collectors;

class Employee{

    int id;
    String name;
    String department;
    double salary;

    Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

public class EmployeeExample {

    public static void main(String[] args) {

        List<Employee> employees = Arrays.asList(
            new Employee(1, "Amit", "IT", 60000),
            new Employee(2, "Rahul", "HR", 45000),
            new Employee(3, "Sneha", "IT", 75000),
            new Employee(4, "Priya", "Sales", 55000),
            new Employee(5, "Raj", "HR", 40000)
        );

        // 1. Employees with salary greater than 50000

        System.out.println("Employees with salary greater than 50000:");

        employees.stream()
                .filter(e -> e.salary > 50000)
                .forEach(System.out::println);


        // 2. Sort employees by salary in descending order

        System.out.println("\nEmployees sorted by salary (Descending):");

        employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .forEach(System.out::println);


        // 3. Count employees in each department

        System.out.println("\nEmployee count in each department:");

        Map<String, Long> result = employees.stream()
                .collect(Collectors.groupingBy(
                        e -> e.department,
                        Collectors.counting()
                ));

        System.out.println(result);
    }
}