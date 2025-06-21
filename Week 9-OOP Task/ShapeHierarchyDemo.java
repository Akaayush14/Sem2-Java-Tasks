
abstract class Shape {
    abstract double calculateArea();
    abstract double calculatePerimeter();
}

class Circle extends Shape {
    double radius;
    Circle(double radius) { this.radius = radius; }

    double calculateArea() { return Math.PI * radius * radius; }
    double calculatePerimeter() { return 2 * Math.PI * radius; }
}

class Rectangle extends Shape {
    double length, width;
    Rectangle(double l, double w) { length = l; width = w; }

    double calculateArea() { return length * width; }
    double calculatePerimeter() { return 2 * (length + width); }
}

class Triangle extends Shape {
    double a, b, c;
    Triangle(double a, double b, double c) { this.a = a; this.b = b; this.c = c; }

    double calculateArea() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    double calculatePerimeter() { return a + b + c; }
}

public class ShapeHierarchyDemo {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 4, 5);
        System.out.println("Circle area: " + circle.calculateArea() + ", perimeter: " + circle.calculatePerimeter());
        System.out.println("Rectangle area: " + rectangle.calculateArea() + ", perimeter: " + rectangle.calculatePerimeter());
        System.out.println("Triangle area: " + triangle.calculateArea() + ", perimeter: " + triangle.calculatePerimeter());
    }
}
