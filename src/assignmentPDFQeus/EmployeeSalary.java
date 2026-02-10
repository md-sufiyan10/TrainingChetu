package TrainigChetu.src.assignmentPDFQeus;

class Employee1 {
    static int counter;
    int id;
    double baseSalary;
    static {
        counter = 1000;
        System.out.println("Employee class Loaded...");
    }
    public Employee1(double baseSalary) {
        this.id = ++counter;
        this.baseSalary = baseSalary;
    }
    double calculateSalary() {
        return baseSalary;
    }
}
class Manger extends Employee1{
      private double bonus;

      public Manger(double baseSalary, double bonus) {
        super(baseSalary);
        this.bonus=bonus;
    }
     double calculateSalary(){
        return baseSalary+bonus;
    }

}
public class EmployeeSalary {
    static void main() {
      Employee1[] emp=new Employee1[3];
      emp[0]=new Employee1(10000);
      emp[1]=new Manger(20000,5000);
      emp[2]=new Employee1(30000);
      for (Employee1 e:emp) {
          System.out.println("" +
                  "ID: " +e.id+
                  ", Salary : "+e.calculateSalary());
      }
    }
}
