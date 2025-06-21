
interface Employee {
    void work();
    double getSalary();
}

class Chef implements Employee {
    public void work() { System.out.println("Chef is cooking."); }
    public double getSalary() { return 50000; }
}

class Waiter implements Employee {
    public void work() { System.out.println("Waiter is serving."); }
    public double getSalary() { return 25000; }
}

public class RestaurantDemo {
    public static void main(String[] args) {
        Employee chef = new Chef();
        Employee waiter = new Waiter();
        chef.work();
        System.out.println("Chef Salary: " + chef.getSalary());
        waiter.work();
        System.out.println("Waiter Salary: " + waiter.getSalary());
    }
}