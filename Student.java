public class Student {
    public static void main(String[] args) {
        StudentAttributes sa = new StudentAttributes("Pioneer", 01,90 );
        sa.display();
    }
}

class StudentAttributes{
    String name;
    int rollno;
    double marks;

    public StudentAttributes(String name, int rollno, double marks) {
        this.name = name;
        this.rollno = rollno;
        this.marks = marks;
    }
    public String grade(double marks){
        if(marks>=90 || marks <= 100){
            return "A";
        }else if(marks<90 || marks>=80){
            return "B";
        }else if(marks<80 || marks>=70){
            return "C";
        }else if(marks<70 || marks>=60){
            return "B";
        }else if(marks<60 || marks>=50){
            return "D";
        }else 
            return "F";
    }
    public void display(){
        System.out.println("Name of the student is "+name);
        System.out.println("Roll nunmber "+rollno);
        System.out.println("Marks of the student "+marks);
        System.out.println("Grade according to marks "+grade(marks));
    }
}
