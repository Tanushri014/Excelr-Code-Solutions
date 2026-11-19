package day12assignment;

import java.util.Optional;

class Student {

    String email;

    Student(String email) {
        this.email = email;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
}

public class OptionalExample {

    public static void main(String[] args) {

        Student s1 = new Student("student@gmail.com");
        Student s2 = new Student(null);

        System.out.println("Student 1 Email: "
                + s1.getEmail().orElse("Email Not Available"));

        System.out.println("Student 2 Email: "
                + s2.getEmail().orElse("Email Not Available"));
    }
}