package day6assignment;

class Rectangle extends Shape {

    double length;
    double breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    void calculateArea() {
        double area = length * breadth;
        System.out.println("Area of Rectangle is: " + area);
    }
}