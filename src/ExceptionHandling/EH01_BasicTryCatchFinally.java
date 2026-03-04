package ExceptionHandling;

public class EH01_BasicTryCatchFinally {
    public static void main(String[] args) {
        String input=args.length>0?args[0]:"";
        try {
            System.out.println("Input:"+input);
            int x=Integer.parseInt(input);
            int result=100/x;
            System.out.println("Result:"+result);
        }catch (NumberFormatException e){
            System.out.println("Invalid Input"+input);

        }
        catch (ArithmeticException e){
            System.out.println("Cannot Divide by Zero");
        }

        finally {
            System.out.println("Finally Block Executed");
        }
    }
}
