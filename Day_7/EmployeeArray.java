package TrainigChetu.Day_7;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;

    Employee(){

    }
    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class EmployeeArray {
    static void main() {

        Employee[] empl=new Employee[3];
        Scanner scanner=new Scanner(System.in);


        for (int i=0; i<3 ;i++){
            System.out.println("Enter Employee Id "+(i+1)+" : ");
            int idTemp=scanner.nextInt();

            System.out.println("Employee Name:");
            String nameTemp= scanner.next();

            empl[i]= new Employee(idTemp, nameTemp);
        }
        System.out.println("=====Employee Details=====");
        for (Employee e: empl){
            System.out.println("Employee Name:"+e.getName()+" ,Id :"+e.getId());
        }


    }
}
