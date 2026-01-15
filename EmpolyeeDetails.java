class EmpolyeeDetails{
    static class employee{
        String name;
        int id;
        double salary;
    
    employee(String name, int id ,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display(){
        System.out.println(name);
        System.out.println(id);
        System.out.println(salary);
    }

    }
    public static void main(String[] args) {
        employee ee = new employee("WWW",101,231098);
        ee.display();
    }

    
}