package TrainingChetu.AssignmentOOPS;

class Animals{

    Animals(){
        System.out.println("Animal constructor called");
    }
}
class Dogs extends Animals{
    Dogs()
    {
        System.out.println("Dog Constructor Called...");
        super();
    }
}
public class Problem_02_ConstructorMagic {

    static void main() {
        Animals a=new Dogs();
        System.out.println("--------------");
        Dogs d=new Dogs();
    }
}
