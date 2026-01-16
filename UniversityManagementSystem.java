public class UniversityManagementSystem {

    public static void main(String[] args) {

        Student s1 = new Student(101, "Ankush", 8.4);
        System.out.println("Roll Number = " + s1.rollNumber);
        s1.setCGPA(9.0);

        s1.displayStudentDetails();
        System.out.println("Final CGPA = " + s1.getCGPA());
    }
}

class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }
    public double getCGPA() {
        return CGPA;
    }
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
    public void displayStudentDetails() {
        System.out.println("Name = " + name);
        System.out.println("CGPA = " + CGPA);
    }
}
