package TrainigChetu.src.assignmentPDFQeus;

class Employees {
    private static int empId=1;

    private final int id;
    private String name;
    private final double salary;

    Employees(String name, double salary) {
        this.id = empId++;
        this.name = name;
        this.salary = salary;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getSalary() {
        return salary;
    }
}
class Manager extends Employees {
    private double bonus;
    Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public double getBonus() {
        return bonus;
    }
}
public class EmployeeHierarchyDemo {
    static void main(String[] args) {
        Employees emp1 = new Employees("John", 10000);
        Employees emp2 = new Manager("Mary", 20000, 5000);

        Employees[] staff = {emp1, emp2};
        for (Employees e : staff) {
            double totalSalary = e.getSalary(); // base salary

            if (e instanceof Manager m) {
                totalSalary += m.getBonus();
            }
            System.out.println(
                            "ID: " + e.getId() +
                            ", Name: " + e.getName() +
                            ", Salary: " + totalSalary);
         }

      }
    }
