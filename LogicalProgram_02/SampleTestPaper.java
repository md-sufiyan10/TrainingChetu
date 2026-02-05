package TrainigChetu.LogicalProgram_02;

public class SampleTestPaper {
    static void main() {
        int x = 5;
       // System.out.println((x++ + ++x));
//        Character c=new Character('A');  // lang package
//        Integer integer=new Integer(120);   // lang package
       // System  lang package
        //String  lang  package
       // Scanner  java util.package
       // Arryas  java util.package
      // interface  Array: package java.sql;
      // class  Array : java.lang.reflect

      //class   Collections : and interface Collection => java.util
       // QUESTION - 1
       // System.out.println((int)'Z');   // A-65   Z-90
      //  System.out.println((int)'z');     // a-97   z-122
      //   System.out.println('Z'+32); //  90+32 -> 122

        // QUESTION-2
        //   double [] x={2.5, 4.5 , 5.5 , 6.4};  //occupies ----- bytes
        // double = 8 bytes (64 bits) means => 1 byte=8 bits
            //total element is 4 in array : 4*8 =32 bytes => 32*8 = 256 bits
          /*    byte:	1 byte	8 bits
                short:	2 bytes	16 bits
                int:	4 bytes	32 bits
                long:	8 bytes	64 bits
                float:	4 bytes	32 bits
                double:	8 bytes	64 bits
                char:	2 bytes	16 bits
                boolean 1  byte by jvm dependent */

        // QUESTION-3
      //  System.out.println(42 /6 % 2); //

        // Question 8

//        for(int i = 1; i <= 10; i++) {
//            System.out.println(i);
//        }

//        for(int i = 2; i != 0; i -= 3) {
//            System.out.println(i);    // Infinite Loop
//        }

//        for(int i = 1; i >= 1; i++)
//        {
//            System.out.println(i+" ");   // Infinite Loop
//        }

//        while(true) {
//            System.out.println("Hello");   ✅ Infinite? → YES
//        }
       /* for(int i = 1; i <= 5; i++);
        {
            System.out.println("Hello");
        }*/

        String str1 = "HELLO";
        String str2 = "HELL";

        int result = str1.compareTo(str2);

        System.out.println("Result: " + ("apple".compareTo("Banana")));




    }
}
