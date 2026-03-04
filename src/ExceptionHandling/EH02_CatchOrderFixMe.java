package ExceptionHandling;

public class EH02_CatchOrderFixMe {
    static void main() {

        try {
            int x = 10 / 0;
            System.out.println(x);
        }

      catch (Exception ee){
        System.out.println("Division by Zero");
    }
//        catch (ArithmeticException e){
//            System.out.println("Invalid Input");
//        }
    }
}
