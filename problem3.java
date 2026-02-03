import java.util.*;

class Student {
    String name;
    List<Course> courses = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course c) {
        courses.add(c);
        c.students.add(this);
    }
}

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }

    void assignProfessor(Course c) {
        c.professor = this;
    }
}

class Course {
    String name;
    Professor professor;
    List<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }
}

public class problem3 {
    public static void main(String[] args) {
        Student s = new Student("Ankush");
        Professor p = new Professor("Dr. Mehta");
        Course c = new Course("DSA");

        s.enrollCourse(c);
        p.assignProfessor(c);

        System.out.println(c.professor.name);
    }
}
