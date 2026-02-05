package Day_9;

import java.util.Scanner;

public class EmployeeSalary {
    private int id;
    private String name;
    private double salary;

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void updateSalary(double percent) {
       double hike = salary * percent/ 100;
        salary=salary+hike;
    }
    public void display(){
        System.out.println("Employee Id:"+id);
        System.out.println("Employee Name:"+name);
        System.out.println("Employ Salary:"+salary);
    }

    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Employee Id:");
        int id=scanner.nextInt();
        System.out.println("Enter Employee Name:");
        String name=scanner.next();
        System.out.println("Enter Employee Salary:");
        double salary=scanner.nextDouble();

        EmployeeSalary employee=new EmployeeSalary();
        employee.setId(id);
        employee.setName(name);
        employee.setSalary(salary);
        System.out.println("Before Update Salary:");
        employee.display();
        System.out.println("-------------------------");
        System.out.println("After Update Salary:");
        employee.updateSalary(10);
        employee.display();
    }
}
