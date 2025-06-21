/*//QN.1
abstract class ShapeSize {
    abstract double computeArea();
    abstract void showInfo();
}

class RoundShape extends ShapeSize {
    double radius;
    RoundShape(double r) {
        radius = r;
    }
    double computeArea() {
        return Math.PI * radius * radius;
    }
    void showInfo() {
        System.out.println("Circle Area: " + computeArea());
    }
}

class BoxShape extends ShapeSize {
    double width, height;

    BoxShape(double w, double h) {
        width = w;
        height = h;
    }
    double computeArea() {
        return width * height;
    }
    void showInfo() {
        System.out.println("Rectangle Area: " + computeArea());
    }
}

class TriShape extends ShapeSize {
    double base, height;
    TriShape(double b, double h) {
        base = b;
        height = h;
    }
    double computeArea() {
        return 0.5 * base * height;
    }
    void showInfo() {
        System.out.println("Triangle Area: " + computeArea());
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        ShapeSize[] shapeList = {
            new RoundShape(5),
            new BoxShape(4, 6),
            new TriShape(3, 7)
        };

        for (ShapeSize gs : shapeList) {
            gs.showInfo();
        }
    }
}
*/
/*//QN2
abstract class PaymentMode {
    abstract void validateDetails();
    abstract void processTransaction();
}
class CreditCardMethod extends PaymentMode {
    void validateDetails() {
        System.out.println("Validating credit card...");
    }

    void processTransaction() {
        System.out.println("Processing credit card transaction.");
    }
}
class PayPalMethod extends PaymentMode {
    void validateDetails() {
        System.out.println("Verifying PayPal credentials");
    }

    void processTransaction() {
        System.out.println("Executing PayPal transaction.");
    }
}
class BankTransferMethod extends PaymentMode {
    void validateDetails() {
        System.out.println("Authenticating bank transfer");
    }

    void processTransaction() {
        System.out.println("Completing bank transfer.");
    }
}
public class PaymentApp {
    public static void main(String[] args) {
        PaymentMode[] modes = {
            new CreditCardMethod(),
            new PayPalMethod(),
            new BankTransferMethod()
        };

        for (PaymentMode p : modes) {
            p.validateDetails();
            p.processTransaction();
            System.out.println();
        }
    }
}
/* //QN3.
abstract class RentalVehicle {
    abstract double calculateRental(int days);
}
class CarType extends RentalVehicle {
    double calculateRental(int days) {
        return days * 50;
    }
}
class BikeType extends RentalVehicle {
    double calculateRental(int days) {
        return days * 20;
    }
}
class CycleType extends RentalVehicle {
    double calculateRental(int days) {
        return days * 10;
    }
}
public class RentalSystem {
    public static void main(String[] args) {
        RentalVehicle[] vehicles = {
            new CarType(),
            new BikeType(),
            new CycleType()
        };
        int rentalDays = 3;
        for (RentalVehicle v : vehicles) {
            System.out.println("Rental Cost: $" + v.calculateRental(rentalDays));
        }
    }
}
*/
/*//Qn4
abstract class MenuProduct {
    abstract void prepare();
    abstract void serve();
}

class Starter extends MenuProduct {
    void prepare() {
        System.out.println("Preparing appetizer...");
    }

    void serve() {
        System.out.println("Serving appetizer.");
    }
}

class MainDish extends MenuProduct {
    void prepare() {
        System.out.println("Cooking main course");
    }

    void serve() {
        System.out.println("Serving main course.");
    }
}

class DrinkItem extends MenuProduct {
    void prepare() {
        System.out.println("Pouring beverage");
    }

    void serve() {
        System.out.println("Serving beverage.");
    }
}

public class RestaurantApp {
    public static void main(String[] args) {
        MenuProduct[] order = {
            new Starter(),
            new MainDish(),
            new DrinkItem()
        };

        for (MenuProduct m : order) {
            m.prepare();
            m.serve();
            System.out.println();
        }
    }
}
*/
/*//QN5
abstract class TransformShape {
    abstract void resize(double factor);
    abstract void rotate(int angle);
}

class CircleShape extends TransformShape {
    double radius = 4;

    void resize(double factor) {
        radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }

    void rotate(int angle) {
        System.out.println("Circle rotated by " + angle + " degrees.");
    }
}

class SquareShape extends TransformShape {
    double side = 5;

    void resize(double factor) {
        side *= factor;
        System.out.println("Square resized. New side: " + side);
    }

    void rotate(int angle) {
        System.out.println("Square rotated by " + angle + " degrees.");
    }
}

class TriangleShape extends TransformShape {
    void resize(double factor) {
        System.out.println("Triangle resized by factor: " + factor);
    }

    void rotate(int angle) {
        System.out.println("Triangle rotated by " + angle + " degrees.");
    }
}

public class ShapeTransformApp {
    public static void main(String[] args) {
        TransformShape[] shapes = {
            new CircleShape(),
            new SquareShape(),
            new TriangleShape()
        };

        for (TransformShape s : shapes) {
            s.resize(1.5);
            s.rotate(45);
            System.out.println();
        }
    }
}
*/
/*//QN6
class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        System.out.println("Add int: " + calc.add(5, 7));
        System.out.println("Add double: " + calc.add(2.3, 4.1));
        System.out.println("Add three int: " + calc.add(1, 2, 3));
    }
}
*/
/*//QN7
class Geometry {
    double calculateArea(double rad) {
        return Math.PI * rad * rad;
    }

    double calculateArea(double len, double wid) {
        return len * wid;
    }

    double calculateArea(double base, double ht, boolean isTriangle) {
        if (isTriangle) {
            return 0.5 * base * ht;
        }
        return -1;
    }
}

public class GeometryApp {
    public static void main(String[] args) {
        Geometry geo = new Geometry();
        System.out.println("Circle: " + geo.calculateArea(3.0));
        System.out.println("Rectangle: " + geo.calculateArea(4.0, 6.0));
        System.out.println("Triangle: " + geo.calculateArea(5.0, 7.0, true));
    }
}
*/
/*//QN8
class Employee {
    double baseSalary = 40000;

    double calculateSalary() {
        return baseSalary;
    }
}

class Manager extends Employee {
    double performanceBonus = 10000;

    @Override
    double calculateSalary() {
        return baseSalary + performanceBonus;
    }
}

public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Manager mgr = new Manager();

        System.out.println("Employee Salary: " + emp.calculateSalary());
        System.out.println("Manager Salary: " + mgr.calculateSalary());
    }
}
*/
/*//QN9
class Account {
    double balance;

    Account(double bal) {
        balance = bal;
    }

    double calculateInterest() {
        return balance * 0.03; // 3%
    }
}

class SavingsAccount extends Account {
    SavingsAccount(double bal) {
        super(bal);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04;
    }
}

class FixedDepositAccount extends Account {
    FixedDepositAccount(double bal) {
        super(bal);
    }

    @Override
    double calculateInterest() {
        return balance * 0.06;
    }
}

public class BankingApp {
    public static void main(String[] args) {
        Account regular = new Account(10000);
        SavingsAccount saving = new SavingsAccount(10000);
        FixedDepositAccount fixed = new FixedDepositAccount(10000);

        System.out.println("Regular Interest: " + regular.calculateInterest());
        System.out.println("Savings Interest: " + saving.calculateInterest());
        System.out.println("Fixed Interest: " + fixed.calculateInterest());
    }
}
*/
/*//QN10
class GameChar {
    void attack() {
        System.out.println("Character attacks with basic punch.");
    }
}

class Warrior extends GameChar {
    void attack() {
        System.out.println("Warrior swings sword!");
    }
}

class Mage extends GameChar {
    void attack() {
        System.out.println("Mage casts fireball!");
    }
}

public class GameWorld {
    public static void main(String[] args) {
        GameChar c1 = new Warrior();
        GameChar c2 = new Mage();

        c1.attack();
        c2.attack();
    }
}
*/
/*//QN11
abstract class Instrument {
    abstract void playSound();
}

class Piano extends Instrument {
    void playSound() {
        System.out.println("Piano: Plink plonk melody.");
    }
}

class Guitar extends Instrument {
    void playSound() {
        System.out.println("Guitar: Strumming strings.");
    }
}

class Violin extends Instrument {
    void playSound() {
        System.out.println("Violin: Smooth bow sound.");
    }
}

public class MusicStudio {
    public static void main(String[] args) {
        Instrument[] band = {
            new Piano(),
            new Guitar(),
            new Violin()
        };

        for (Instrument i : band) {
            i.playSound();
        }
    }
}
*/