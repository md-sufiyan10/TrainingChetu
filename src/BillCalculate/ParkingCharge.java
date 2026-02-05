package BillCalculate;

public class ParkingCharge {
    private final String vehicleNumber;
    private final int hours;
    private double totalCharge;

    public ParkingCharge(String vehicleNumber, int hours) {
        this.vehicleNumber = vehicleNumber;
        this.hours = hours;
        calculationCharge();
    }

    public void calculationCharge(){
       if (hours<=2)
           totalCharge=hours*20;
       else if(hours<=5)
           totalCharge=(2*20)+(hours-2)*15;
       else
           totalCharge=(2*20)+(3*15)+(hours-5)*10;
    }

    // display
    public void display(){
        System.out.println("====Parking Charge====");
        System.out.println("Vehicle Number:"+vehicleNumber);
        System.out.println("parking Hours:"+hours);
        System.out.println("Total Charge :"+totalCharge);

    }
}

