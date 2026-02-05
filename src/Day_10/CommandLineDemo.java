package Day_10;

import java.util.Scanner;

class StudentMark{
    private int a, b,c,d,e;
    int max;

    public void setNumber(int a,int b,int c,int d,int e){
        this.a=a;
        this.b=b;
        this.c=c;
        this.d=d;
        this.e=e;
    }

    public int getMax(){
        return max;
    }
public void calculateLogic(){
        if (a>b && a>c && a>d && a>e)
            max=a;
        else if(b>c && b>d && b>e)
            max=b;
        else if(c>d && c>e)
            max=c;
        else if(d>e)
            max=d;
        else
            max=e;
}
   public void show(){
       System.out.println("Largest Number"+max);
   }
}

public class CommandLineDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first Number:");
        int a=scanner.nextInt();
        System.out.println("Enter Second Number:");
        int b=scanner.nextInt();
        System.out.println("Enter third Number:");
        int c=scanner.nextInt();
        System.out.println("Enter fourth Number:");
        int d=scanner.nextInt();
        System.out.println("Enter fifth Number:");
        int e=scanner.nextInt();

        StudentMark stu=new StudentMark();
        stu.setNumber(a,b,c,d,e);
        stu.calculateLogic();
        int result=stu.getMax();
        stu.show();

    }
    
}
