import java.util.*;

class School {
    String name;
    List<Student> students = new ArrayList<>();

    School(String name) {
        this.name = name;
    }

    void addStudent(Student s) {
        students.add(s);
    }
}

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enroll(Course c) {
        courses.add(c);
        c.students.add(this);
    }

    void viewCourses() {
        for (Course c : courses)
            System.out.println(c.name);
    }
}

class Course {
    String name;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void viewStudents() {
        for (Student s : students)
            System.out.println(s.name);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        School school = new School("ABC School");
        Student s1 = new Student("Ankush");
        Course c1 = new Course("Math");
        Course c2 = new Course("Science");

        school.addStudent(s1);
        s1.enroll(c1);
        s1.enroll(c2);

        s1.viewCourses();
        c1.viewStudents();
    }
}
