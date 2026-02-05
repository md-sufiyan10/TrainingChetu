package TrainigChetu.Day_6;

import java.util.Scanner;

class Customer{
    private String name;
    private int age;
    private double purchaseAmount;
    private double discount;

    public Customer(String name, int age, double purchaseAmount) {
        this.name = name;
        this.age = age;
        this.purchaseAmount = purchaseAmount;
    }
    Customer(){}

    // discount calculation
   void calculationAmount(){
        if (purchaseAmount>=10000)
            discount=purchaseAmount*0.20;
        else if(purchaseAmount>=5000)
            discount=purchaseAmount*0.10;
        else
            discount=purchaseAmount*0.5;
    }

    public void display(){
        System.out.println("===Customer Details====");
        System.out.println("Customer Name:"+name);
        System.out.println("Customer Age:"+age);
        System.out.println("Purchase Amount:"+purchaseAmount);
        System.out.println("Discount Getting:"+discount);
        System.out.println("Final Amount :"+(purchaseAmount-discount));
    }
}
public class CustomerInformation {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Customer Name:");
        String name = scanner.next();

        System.out.print("Enter Customer Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Purchase Amount: ");
        double amount = scanner.nextDouble();
    Customer cus=new Customer(name,age,amount);
    cus.calculationAmount();
    cus.display();
    }
}
