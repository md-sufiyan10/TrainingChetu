package TrainigChetu.LogicalProgram_02;

public class SampleTest_02 {
    static void main() {
        // Example Convert -01
        /*System.out.println("Entry loop for..");
         int a; int b;
         for (a=10 , b = 1; a>=1 ; a-=2){
             b+=a;
             b++;
         }
        System.out.println("b values:"+b);
        System.out.println(" Convert exist Controlled Loop do-while");
        a=10; b=1;
        do{
            b=b+a;
            b++;
            a=a-2;
        }while(a>=1);
        System.out.println("b value:"+b);*/

        // Example Convert 02: Sum of 1 to 5
        /*System.out.println("Original for Loop..");
        int sum=0;
        for (int i=0; i<=5; i++){
            sum+=i;
        }
        System.out.println("Sum 1 to 5 is:"+sum);
        System.out.println("Convert exit controlled loop do while");
        int s=0;
        int i=1;
        do{
            s+=i;
            i++;
        }while(i<=5);
        System.out.println("Sum while--"+s);*/

        // Example 3: Print numbers 10 down to 1
       /* System.out.println("Original for loop..");
        for (int i=10; i>=1 ; i--){
            System.out.print(i+" ");
        }
        // convert do-while loop
        System.out.println("\n"+"Convert exit controlled loop..");
        int i=10;
        do{
            System.out.print(i+ " ");
            i--;
        }while (i>=1);*/

        // Example 4: Factorial calculation
//        int fact=1;
//        for (int n=5 ; n>=1 ; n--){
//            fact*=n;
//        }
//        System.out.println("Factorial Number  " +fact);
//        System.out.println("do-while");
//        int fact=1; int n=5;
//        do{
//            fact*=n;
//            n--;
//        }while (n>=1);
//        System.out.println("Factorial do :"+fact);

     /*String s1="Hello";
        System.out.println(s1.length()); // 5
      String s2="";
        System.out.println(s2.length()); // 0 but not negative
    String str="java";
     char c1=str.charAt(0); // j
     char c2=str.charAt(2); //v
        System.out.println(c1);
        System.out.println(c2);*/

        // Question (viii)

        // int a[ ] = {12,10,8,4,6,2,3,5,7};
        // (a) What is the output of System.out.print(a[0]+a[5]);?
        // output a[0]+a[5] ==> a[0]-> 12 , a[5]->2
      //  System.out.println("Sum of 0 index an 5 index values:" + (a[0] + a[5]));

        // (b) What is the index (subscript) of the largest element of the array a[ ]?
//        int a[] = {10, 18, 4, 6, 2, 3, 12, 5, 7};
//        int maxIndex = 0;
//        for (int i = 0; i < a.length; i++) {
//            if (a[i] > a[maxIndex]) {
//                maxIndex = i;
//            }
//        }
//        System.out.println(" Index of largest element = " + maxIndex);

        // question (ix) (a) Write the Java statement to initialise the first 6 odd numbers in a 3 × 2 array.

        // first 6 od number= 1,3,5,7,9,11;
        // 3x2 arrays : 3 rows and 2 column-> total 6 number
//        int[][] x = {{1, 3}, {5, 7}, {9, 11}};
//        System.out.println(" x[0][1] + x[2][1] = " + (x[0][1] + x[2][1]));

       /* int[] arr = {5, 8, 2, 9, 3, 1};
        System.out.println("arr[1] + arr[4] ==> "+ (arr[1] + arr[4]));
       int  minIndex=0;
       for (int i=0 ; i<arr.length;i++){
           if (arr[i] > minIndex)
               minIndex=i;
       }
        System.out.println(" Index of Minimum index element = " + minIndex);*/

//        int b[]={4,7,9,1,4};
//        int sum=0;
//        for (int i=0 ;i <b.length ; i+=2){
//            sum=sum+b[i];
//        }
//        System.out.println("Sum:"+sum);

//        String word = "PROGRAMMING";
//        int c=0;
//        for (int i=0 ; i< word.length();i++){
//            if (word.charAt(i)=='M') c++;
//        }
//        System.out.println(c);

//        String s1 = "JAVA";
//        String s2 = "PROGRAM";
//
//        for (int i=0 ; i<Math.min(s1.length(), s2.length()); i++){
//            System.out.println(s1.charAt(i) + " : "+ s2.charAt(i));
//        }

       // String s = "HELLO";
//        for(int i = 1; i < s.length(); i += 2)
//            System.out.println(s.substring(i));

//        String s = "PROGRAM";
//        System.out.println(s.substring(3,7));  //GRAM

        String ss = "JAVA";
        for(int i=0;i<ss.length();i+=2) {
            System.out.println(ss.substring(i));
        }
    }
}

