public class main {

//  1. Vehicle and Car (Single Inheritance)
    static class Vehicle {
        void drive() {
            System.out.println("Vehicle is driving");
        }
    }

    static class Car extends Vehicle {
        void display() {
            System.out.println("Car details: Tesla , Model 4098");
        }
    }

// 2. Employee and HRManager (Method Overriding)
    static class Employee {
        void work() {
            System.out.println("Employee is working");
        }

        double getSalary() {
            return 50000.0;
        }
    }

    static class HRManager extends Employee {
        @Override
        void work() {
            System.out.println("HR Manager is managing  employee relations post");
        }
    }

// 3. Geometry Calculator (Multilevel Inheritance)
    static class Shape {
        void area() {
            System.out.println("Calculating area...");
        }
    }

    static class Rectangle extends Shape {
        double length = 10, width = 40;

        @Override
        void area() {
            System.out.println("Rectangle area: " + (length * width));
        }
    }

    static class Square extends Rectangle {
        double side = 12;

        void areaSquare() {
            System.out.println("Square area: " + (side * side));
        }
    }

    static class Circle extends Shape {
        double radius = 8;

        @Override
        void area() {
            System.out.println("Circle area: " + (Math.PI * radius * radius));
        }
    }

 // 4. Vehicle Hierarchy (Hierarchical Inheritance)
    static class BaseVehicle {
        void startEngine() {
            System.out.println("Engine Started");
        }

        void stopEngine() {
            System.out.println("Engine Stopped");
        }
    }

    static class Car2 extends BaseVehicle {
        void drive() {
            System.out.println("Car is driving");
        }
    }

    static class Motorcycle extends BaseVehicle {
        void ride() {
            System.out.println("Motorcycle is riding");
        }
    }

// 5. Shape Hierarchy with Area & Perimeter
    static class GeneralShape {
        void calculateArea() {
            System.out.println("Area calculation...");
        }
    }

    static class Rect extends GeneralShape {
        double length = 50, width = 33;

        @Override
        void calculateArea() {
            System.out.println("Rectangle area: " + (length * width));
        }

        void calculatePerimeter() {
            System.out.println("Rectangle perimeter: " + 2 * (length + width));
        }
    }

    static class Circle2 extends GeneralShape {
        double radius = 4;

        @Override
        void calculateArea() {
            System.out.println("Circle area: " + (Math.PI * radius * radius));
        }

        void calculateCircumference() {
            System.out.println("Circle circumference: " + (2 * Math.PI * radius));
        }
    }

// 6. Book Inheritance Example
    static class Book {
        String title, author;

        Book(String title, String author) {
            this.title = title;
            this.author = author;
        }

        void displayDetails() {
            System.out.println("Title: " + title + ", Author: " + author);
        }
    }

    static class FictionBook extends Book {
        FictionBook(String title, String author) {
            super(title, author);
        }
    }

    static class NonFictionBook extends Book {
        NonFictionBook(String title, String author) {
            super(title, author);
        }
    }

    static class TechnicalBook extends Book {
        TechnicalBook(String title, String author) {
            super(title, author);
        }
    }

    public static void main(String[] args) {
        System.out.println("1. Single Inheritance:");
        Car car = new Car();
        car.drive();
        car.display();

        System.out.println("\n2. Method Overriding:");
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());

        System.out.println("\n3. Multilevel Inheritance:");
        Square sq = new Square();
        sq.area();
        sq.areaSquare();
        Circle c = new Circle();
        c.area();

        System.out.println("\n4. Hierarchical Inheritance (Vehicle):");
        Car2 car2 = new Car2();
        car2.startEngine();
        car2.drive();
        car2.stopEngine();
        Motorcycle moto = new Motorcycle();
        moto.startEngine();
        moto.ride();
        moto.stopEngine();

        System.out.println("\n5. Hierarchical Inheritance (Shape):");
        Rect rect = new Rect();
        rect.calculateArea();
        rect.calculatePerimeter();
        Circle2 circle2 = new Circle2();
        circle2.calculateArea();
        circle2.calculateCircumference();

        System.out.println("\n6. Book Inheritance:");
        FictionBook fb = new FictionBook("Atomic Habits", "James Clear");
        NonFictionBook nfb = new NonFictionBook("Physiology", "Dr Ambika Kumari");
        TechnicalBook tb = new TechnicalBook("Anatomy", "BD chaurasiya");
        fb.displayDetails();
        nfb.displayDetails();
        tb.displayDetails();
    }
}
