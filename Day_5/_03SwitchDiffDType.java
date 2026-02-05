package TrainigChetu.Day_5;

/*  ✅ Allowed Data Types
Data Type	Since
------------------------
byte	      Java 1.0
short	      Java 1.0
int	      Java 1.0
char	     Java 1.0
enum	     Java 5
String	     Java 7
Integer	       Java 5
Character	Java 5
 Note: Wrapper classes allowed only if value is compile-time constant
 float, double,long, boolean===> NOT ALLOWED
 Because switch works with constant values and fast jump tables
  */


public class _03SwitchDiffDType {
    enum Day {MON, TUE,WED};
    static void main(String[] args) {
        Day d= Day.TUE;
        switch (d){
            case MON:
                System.out.println("Monday..");
                break;
            case TUE:
                System.out.println("Tuesday");
                break;
            case WED:
                System.out.println("Wednesday..");
                break;
            default:
                System.out.println("Invalid day..");
        }
        int day=3;   // OLD Style
        switch(day){
            case 1:
                System.out.println("Monday..");
                break;
            case 2:
                System.out.println("Tuesday..");
                break;
            case 3 :
                System.out.println("Wednesday..");
                break;
            default:
                System.out.println("Invalid Number..");
        }

        char grade='A';
        switch (grade){
            case 'A':
                System.out.println("Excellent..");
                break;
            case 'B':
                System.out.println("Good..");
                break;
            case 'C':
                System.out.println("Poor...");
                break;
            default:
                System.out.println("Fail..");
        }

        String role="user";
        switch (role){
            case "admin":
                System.out.println("Full Access..");
                break;
            case "user":
                System.out.println("Limited Access.");
                break;
            default:
                System.out.println("Not Access Anything..");
        }
    }
}
