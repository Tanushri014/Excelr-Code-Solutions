package day7assignment;

import java.util.Scanner;

public class Rectangle implements Shape {

    Scanner sc = new Scanner(System.in);

    @Override
    public void area() {

        System.out.println("Enter length:");
        int l = sc.nextInt();

        System.out.println("Enter width:");
        int w = sc.nextInt();

        double area_ans = l * w;

        System.out.println("Area of Rectangle: " + area_ans);
    }
}