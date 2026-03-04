package multithreading.practice;

import java.util.Scanner;

public class Task_05 {
    static void main() {

        Scanner sc=new Scanner(System.in);
        try {
            System.out.println("Enter a first Number:");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("Enter a second Number:");
            int num2 = Integer.parseInt(sc.nextLine());

            int result = num1 / num2;
            System.out.println("Result:" + result);

//           } catch (Exception e){
//                System.out.println("Error : "+e.getMessage());
//            }

        }catch(ArithmeticException  e){
            System.out.println("Cannot divide by zero");
        }
        catch (NumberFormatException e){
            System.out.println("Please enter valid numbers only ");
        }
        // optional generic exception handling
        catch (Exception e){
            System.out.println("Error : "+e.getMessage());
        }
        finally {
            System.out.println("Finally Block");
        }
    }
}
