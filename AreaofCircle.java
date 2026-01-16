public class AreaofCircle {
    static class radie{
        double radius;

        radie(double radius){
            this.radius = radius;
        }
        public static double Area(double radius){
            return 3.14*radius*radius;
        }
        public static double circum(double radius){
            return 2*3.14*radius;
        }
        public void display(){
            System.out.println("Area = "+ Area(radius));
            System.out.println("Circumference = "+circum(radius));
        }
    }
    public static void main(String[] args) {
        radie rr = new radie(4.5);
        rr.display();
    }
}
