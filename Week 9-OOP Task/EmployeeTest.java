class Employee {
    void work() {
        System.out.println("Employee is working...");
    }

    double getSalary() {
        return 30000.00;
    }
}

class HRManager extends Employee {
    @Override
    void work() {
        System.out.println("HR Manager is managing recruitment.");
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: Rs. " + hr.getSalary());
    }
}
