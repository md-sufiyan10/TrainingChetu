package AssignmentOOPS;
interface Swipeable{
    void swipe();
}
interface Flyable {
    void fly();
}
class Duck implements Swipeable, Flyable {
    public void swipe(){
        System.out.println("Duck is swiping...");
    }
    public void fly(){
        System.out.println("Duck is flying...");
    }
}
public class Problem_24_MultipleAbilities {
    static void main() {
        Duck d=new Duck();
        d.swipe();
        d.fly();
        System.out.println("--------------");
        Swipeable s=d;
        s.swipe();
        Flyable f=d;
        f.fly();
    }
}
