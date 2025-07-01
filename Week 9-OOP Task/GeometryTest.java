class Shape {
    double calculateArea() {
        return 0.0;
    }
}

class Rectangle extends Shape {
    double length = 4;
    double width = 5;

    double calculateArea() {
        return length * width;
    }
}

class Square extends Rectangle {
    double side = 6;

    double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    double radius = 3;

    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class GeometryTest {
    public static void main(String[] args) {
        Square square = new Square();
        Circle circle = new Circle();

        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle (from parent): " + new Rectangle().calculateArea());
    }
}
