package TrainigChetu.Day_6;

import java.util.Scanner;

class Employee{
    private int id;
    private String name;
    private double salary;
    private String designation;


   public void accept() {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter Employee Id:");
       this.id = scanner.nextInt();
       System.out.println("Enter Employee Name:");
       this.name = scanner.next();
       System.out.println("Enter Employee Salary:");
       this.salary = scanner.nextDouble();
    }
       public void calculationDesignation(){
           if (salary>=50000) designation="Manager";
           else if (salary>=30000) designation="Developer";
           else designation="Trainig";
       }

       public void display(){
           System.out.println("===Employes Details===");
           System.out.println("Employee Id:"+id);
           System.out.println("Employee Name:"+name);
           System.out.println("Employee Salary:"+salary);
           System.out.println("Employee Designation:"+designation);
       }
   }


public class EmployeeDetails {
    static void main() {
     Employee emp=new Employee();
     emp.accept();
     emp.calculationDesignation();
     emp.display();
    }
}
