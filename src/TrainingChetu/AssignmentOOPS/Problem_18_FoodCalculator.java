package TrainigChetu.AssignmentOOPS;

class Food {
    public double getPrice() {
        return 0;
    }
    public String getName() {  // Added: name for Pizza Burger automatically
        return getClass().getSimpleName();
    }
}
class Burger extends Food {
    public double getPrice() {
        return 100;
    }
}
class Pizza extends Food {
    public double getPrice() {
        return 250.0;
    }
}
public class Problem_18_FoodCalculator {
    static void main() {
    Food[] items={new Burger(),new Pizza(),new Burger()};
    for (Food item : items) {
        System.out.println(item.getName()+"="+item.getPrice()+" ");
    }
    double total=0;
    for(Food item:items) {
        total += item.getPrice();
    }
    System.out.println("Total amount is: "+total+" ");
    }
}
