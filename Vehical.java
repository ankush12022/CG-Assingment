public class Vehical {
    public static void main(String[] args) {
        vehicalregistrstion vc = new vehicalregistrstion("Ankush", "SUV");
        vc.display();
        System.out.println("Changing the registration fees");
        vc.updateRegistrationFee(50000);
        vc.display();
    }
}
class vehicalregistrstion{
    String ownerName;
    String vehicaltype;
    static double registrationfees = 0.0;

    public vehicalregistrstion(String ownerName, String vehicaltype) {
        this.ownerName=ownerName;
        this.vehicaltype = vehicaltype;
    }
    public void display(){
        System.out.println("Owner Name = "+ownerName);
        System.out.println("Vehical Type = "+vehicaltype);
        System.out.println("Registration fees for vehical = " +registrationfees);
    }
    public void updateRegistrationFee(double fees){
        this.registrationfees = fees;
    }
}