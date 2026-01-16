public class Hotel {
    public static void main(String[] args) {
        System.out.println("Default ");
        HotelBooking h1 = new HotelBooking();

        System.out.println("Parameterised");
        HotelBooking h2 = new HotelBooking("Ankit", "Queen bed room", 2);
        h2.display();

        System.out.println("Copy constructor");
        HotelBooking h3 = new HotelBooking(h2);
    }
}
class HotelBooking{
    String guestname;
    String roomtype;
    int nights;

    public HotelBooking(String guestname, String roomtype, int nights) {
        this.guestname = guestname;
        this.roomtype = roomtype;
        this.nights = nights;
    }

    public HotelBooking(HotelBooking hb){
        this.guestname = hb.guestname;
        this.roomtype = hb.roomtype;
        this.nights = hb.nights;
    }
    public HotelBooking(){
        System.out.println("Default constructor");
    }
    public void display(){
        System.out.println("Name = "+guestname);
        System.out.println("Room Type = "+roomtype);
        System.out.println("Nights = "+nights);
    }
}