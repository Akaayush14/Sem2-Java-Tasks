class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length = 5;
    double width = 4;

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius = 3;

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        Circle circle = new Circle();

        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());
    }
}
