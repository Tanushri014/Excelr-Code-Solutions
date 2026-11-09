package day7assignment;

import java.util.Scanner;

public class Circle implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public void area() {

        System.out.println("Enter radius:");
        int r = sc.nextInt();

        double area_ans = Math.PI * r * r;

        System.out.println("Area of Circle: " + area_ans);
    }
}