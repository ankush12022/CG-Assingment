public class CarRental {
    public static void main(String[] args) {

        Rental r1 = new Rental("Ankush", "Sedan", 5);
        r1.displayDetails();

        System.out.println();

        Rental r2 = new Rental("Rohit", "SUV", 3);
        r2.displayDetails();
    }
}

class Rental {

    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    
    public Rental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    void calculateTotalCost() {
        double costPerDay;

        if (carModel.equalsIgnoreCase("Sedan")) {
            costPerDay = 2000;
        } else if (carModel.equalsIgnoreCase("SUV")) {
            costPerDay = 3000;
        } else {
            costPerDay = 1500; // default
        }

        totalCost = costPerDay * rentalDays;
    }
    void displayDetails() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Car Model     : " + carModel);
        System.out.println("Rental Days   : " + rentalDays);
        System.out.println("Total Cost    : ₹" + totalCost);
    }
}
