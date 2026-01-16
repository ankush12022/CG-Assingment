public class OnlineCourse {
    public static void main(String[] args) {
        Course cc = new Course("Java", "10 Months", 5000);
        cc.display();

        System.out.println("After Updating");
        cc.UpdateName("NIT");
        cc.display();
    }
}

class Course{
    String coursename;
    String duration;
    double fees;
    static String instituteName = "IIT";

    Course(String coursename,String duration,double fees){
        this.coursename = coursename;
        this.duration = duration;
        this.fees = fees;
    }

    public void UpdateName(String name){
        this.instituteName = name;
    }

    public void display(){
        System.out.println("Institute Name = "+instituteName);
        System.out.println("Course Name = "+coursename);
        System.out.println("Course Duration = "+duration);
        System.out.println("Fees of course = "+fees);
    }
}