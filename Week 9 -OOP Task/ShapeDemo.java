import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length and width of rectangle: ");
        double l = sc.nextDouble();
        double w = sc.nextDouble();
        Rectangle r = new Rectangle(l, w);
        System.out.println("Area of Rectangle: " + r.calculateArea());

        System.out.print("Enter radius of circle: ");
        double rad = sc.nextDouble();
        Circle c = new Circle(rad);
        System.out.println("Area of Circle: " + c.calculateArea());
    }
}

