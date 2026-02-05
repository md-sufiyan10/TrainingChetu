package TrainigChetu.BillCalculate;

import java.util.Scanner;

public class StorageSpaces {
    private  int account ;
    private  int space;
    private  double bill;
    private  boolean isCalculated;

    public StorageSpaces(int account , int space){
        setAccount(account);
        setSpace(space);
        this.bill=0.0;
        this.isCalculated=false; // calculation not done yet
    }
    //Setter
    public void setAccount(int account){
        if (account>0)
            this.account=account;
        else {
            System.out.println("Invalid Account Number: Default is 1.");
            this.account = 1;
        }
    }
    public void setSpace(int space){
        if (space >0 && space<=500)
            this.space=space;
        else {
            System.out.println("Invalid Space ! Default set to 10 GB.");
            this.space = 10;
        }
    }
    // Getter
    public int getAccount(){
        return account;
    }
    public int getSpace(){
        return space;
    }
    public double getBill(){
        return bill;
    }
     public void calculateBill(){
        if (space <= 15)
            bill = space * 15; // 15GB ==> Rs.15 per GB
        else if (space<=30)
            bill=(15*15) +((space-15)*12); //between >15 and =30 GB then Price : => Rs. 12 per GB
        else
            bill=(15*15)+(15*12) +((space-30)*10); // above >=30 GB then price => RS.10 per GB

         isCalculated=true; // Important point
    }
    public void display(){
         if (!isCalculated) {
             System.err.println("Plz Calculate the Bill Before displaying Details..");
             return;
         }

        System.out.println("User Account Number:"+ account);
        System.out.println("Storage Space : " +space + " GB ");
        System.out.println("Total Bill Amount :"+ bill +" Rs. ");

    }
}

