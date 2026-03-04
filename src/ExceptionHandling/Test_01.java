package ExceptionHandling;

public class Test_01 {
    static void main() {
//       try{
//           String [] s={"A","2"};
//           int num=Integer.parseInt(s[4]);
//       }catch (ArrayIndexOutOfBoundsException e){
//           System.out.println("Bad Index.."+e.getMessage());
//       } catch (NumberFormatException e) {
//           System.out.println("Bad Format.."+e.getMessage());
//       }

        try {
            String s = null;
            System.out.println(s.length());
        } catch (NullPointerException e)
        {
            System.out.println("Null Error:"+e.getMessage());
        }
    }
}
