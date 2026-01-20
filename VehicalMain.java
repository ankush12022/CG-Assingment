public class VehicalMain {
    public static void main(String[] args) {
        Vehical vv = new Car(5);
        Vehical vv1 = new Truck(100, 10);
        Vehical vv2 = new Motorcycle(150, "Kawasaki", 2);

        vv.display();
        vv1.display();
        vv2.display();
    }
}

class Vehical {
    double maxSpeed;
    String fueltype;

    public Vehical(double maxSpeed, String fueltype) {
        this.maxSpeed = maxSpeed;
        this.fueltype = fueltype;
    }

    void display() {
        System.out.println("Vehicle details");
    }
}

class Car extends Vehical {
    int seatingcap;

    public Car(int seatingcap) {
        super(180.00, "Diesel");
        this.seatingcap = seatingcap;
    }

    void display() {
        super.display();
        System.out.println(
            "Type of the vehicle is " + fueltype +
            ", maximum speed is " + maxSpeed +
            ", seating capacity " + seatingcap
        );
    }
}   

class Truck extends Vehical {
    int seatingcap;

    Truck(double maxSpeed, int seatingcap) {
        super(maxSpeed, "JCB");
        this.seatingcap = seatingcap;
    }

    void display() {
        System.out.println(
            "Type of the vehicle is " + fueltype +
            ", maximum speed is " + maxSpeed +
            ", seating capacity " + seatingcap
        );
    }
}

class Motorcycle extends Vehical {
    int seatingcap;

    Motorcycle(double maxSpeed, String fueltype, int seatingcap) {
        super(maxSpeed, fueltype);
        this.seatingcap = seatingcap;
    }

    void display() {
        System.out.println(
            "Type of the vehicle is " + fueltype +
            ", maximum speed is " + maxSpeed +
            ", seating capacity " + seatingcap
        );
    }
}
