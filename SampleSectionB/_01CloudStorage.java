package TrainigChetu.SampleSectionB;
import java.util.Scanner;

class CloudStorage{
    private   Long account;
    private int space;
    private double bill=0.0;

    public void accept(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Account Number:");
        account=scanner.nextLong();

        System.out.println("Enter Storage Space Buy (in GB):");
        space=scanner.nextInt();
    }
    public  void calculate(){
        if (space<=15) // 15GB ==> Rs.15 per GB
            bill=space*15;
        else if (space >15 && space <=30)
            bill=(15*15)+ ((space-15)*13);  //between >15 and =30 GB then Price : => Rs. 13 per GB
        else
            bill=(15*15)+(15*13)+((space-30)*11); // above 30 GB : => Rs. 11 per GB
    }
    public void display(){
        System.out.println("\n=====Storage Details Info=======");
        System.out.println("Account Number: "+account);
        System.out.println("Storage Spaces : "+space);
        System.out.println("Total Bill Amount :"+ bill);
        System.out.println("-----------------------------\n");
    }
}
public class _01CloudStorage{
    static void main() {
        CloudStorage cs=new CloudStorage();
        cs.accept();
        cs.calculate();
        cs.display();

    }
}
