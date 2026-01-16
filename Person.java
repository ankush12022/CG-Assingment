public class Person {
    public static void main(String[] args) {
        Attributes att = new Attributes("Ankush", 22, 6);
        att.display();
        Attributes att1 = new Attributes(att);
        att1.display();
    }
}
class Attributes{
    String name;
    int age;
    double height;

    public Attributes(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }
    public Attributes(Attributes a){
        this.name = a.name;
        this.age = a.age;
        this.height = a.height;
    }

    public void display(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
        System.out.println("Height = "+height);
    }
}