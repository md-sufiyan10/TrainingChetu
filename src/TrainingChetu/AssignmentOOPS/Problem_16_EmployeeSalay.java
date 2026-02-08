package TrainigChetu.AssignmentOOPS;

 class Employee {
    private final String name;
    private final double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    // Step 1: returns base salary
    public double calculateSalary() {
        return baseSalary;
    }

    @Override
    public String toString() {
        return "Employee{name='" + name + "', baseSalary=" + baseSalary + "}";
    }
}

class Manager extends Employee {
    private final double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public double getBonus() {

        return bonus;
    }

    // Step 2: override to return base + bonus
    @Override
    public double calculateSalary() {
        return getBaseSalary() + bonus;
    }

    @Override
    public String toString() {
        return "Manager{name='" + getName() + "', baseSalary=" + getBaseSalary() + ", bonus=" + bonus + "}";
    }
}

public class Problem_16_EmployeeSalay {
    public static void main(String[] args) {

        // Step 3: polymorphism (Employee reference can hold Manager object)
        Employee[] staff = {
                new Employee("Amit", 30000),
                new Manager("Neha", 50000, 12000)
        };

        for (Employee e : staff) {
            System.out.println(e);
            System.out.println("Final Salary: " + e.calculateSalary());
            System.out.println("-------------------------");
        }
    }
}

