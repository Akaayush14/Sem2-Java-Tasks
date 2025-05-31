class EncapEmployee {
    private String name;
    private String employeeId;
    private double salary;
    public EncapEmployee(String name, String employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid  salary. Setting salary to 0.");
            this.salary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public double getSalary() {
        return salary;
    }

    public void adjustSalary(double amount) {
        if (salary + amount >= 0) {
            salary += amount;
            System.out.println("Salary Adjust Successfully. New salary: " + salary);
        } else {
            System.out.println("Error: Salary cannot be negative. Adjustment Canceled.");
        }
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        EncapEmployee emp = new EncapEmployee("Aayush Kharel", "E98383", 150000.0);

        emp.displayEmployeeInfo();

        emp.setName("Aayush Kharrel");
        emp.setEmployeeId("E98383");

        emp.adjustSalary(15000);   
        emp.adjustSalary(-6000); 

        System.out.println("\n... Updated Employee Information ...");
        emp.displayEmployeeInfo();
    }
}
