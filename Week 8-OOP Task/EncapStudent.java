class EncapStudent {
    private String name;
    private String idNumber;
    private double gpa;  

    public EncapStudent(String name, String idNumber, double gpa) {
        this.name = name;
        this.idNumber = idNumber;
        this.gpa = gpa;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {
        return gpa;
    }

    public void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("ID Number: " + idNumber);
        System.out.println("GPA: " + gpa);
    }

    public static void main(String[] args) {
        EncapStudent student = new EncapStudent("Aayush Kharel", "240289", 4.00);

        student.displayStudentInfo();

        
        student.setName("Aayush Kharel");
        student.setIdNumber("240266");
        
        System.out.println("\n... Updated Information ...");
        student.displayStudentInfo();

    
    }
}
