class Animalhierarchy {
    String name;
    int age;

    void makesound(){
        }
        void display(){
            System.out.print("Name = "+name);
        }
}

class dog extends Animalhierarchy{

    public dog(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void makesound(){
        display();
        System.out.println(" says Whoff");
    }
}

class Cat extends Animalhierarchy{

    public Cat(String name,int age) {
        this.name = name;
        this.age = age;
    }
    void makesound(){
        System.out.println("Meow");
    }
}
class Birds extends Animalhierarchy{
    public Birds(String name, int age){
        this.name = name;
        this.age = age;
    }
    void makesound(){
        System.out.println("Chirp");
    }
} 

class Animal{
    public static void main(String[] args) {
        Animalhierarchy ah = new dog("Tommy",2);
        Animalhierarchy ah1 = new Cat("Billi",1);
        Animalhierarchy ah2 = new Birds("Chidi",1);

        ah.makesound();
        ah1.makesound();
        ah2.makesound();
    }
}