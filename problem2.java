import java.util.*;

class University {
    String name;
    List<Department> departments = new ArrayList<>();
    List<Faculty> faculties = new ArrayList<>();

    University(String name) {
        this.name = name;
    }

    void addDepartment(String name) {
        departments.add(new Department(name));
    }

    void addFaculty(Faculty f) {
        faculties.add(f);
    }

    void deleteUniversity() {
        departments.clear();
    }
}

class Department {
    String name;

    Department(String name) {
        this.name = name;
    }
}

class Faculty {
    String name;

    Faculty(String name) {
        this.name = name;
    }
}

public class problem2 {
    public static void main(String[] args) {
        University u = new University("XYZ University");
        u.addDepartment("CSE");
        u.addDepartment("ECE");

        Faculty f1 = new Faculty("Dr. Sharma");
        u.addFaculty(f1);

        u.deleteUniversity();
        System.out.println(u.departments.size());
    }
}
