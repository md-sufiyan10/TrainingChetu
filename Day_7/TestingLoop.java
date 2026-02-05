package TrainigChetu.Day_7;

public class TestingLoop {
    static void main() {

        // for loop print 1-10 and break and continue usd
//        System.out.println("---for loop--");
//        for (int i=1 ; i<=10; i++){
//            if (i==5)break;
//            System.out.print(i+" ");
//        }
//        System.out.println();

        System.out.println("-----while loop---");
//        int i=1;
//        while (i<=10){
//            if (i==5)continue;
//            System.out.print(i+" ");
//            i++;
//        }
//        System.out.println();
        int i=1;
        while (i<=10){
            if(i==5){
               i++;
               continue;
            }
            System.out.print(i+" ");
            i++;
        }
        System.out.println("\n==========k =======");
        int k = 0;
        while (k < 10) {
            k++;  // Increment at start
            if (k == 5) continue;
            System.out.print(k + " ");
        }

       System.out.println("\n---------do-while loop----");
//
//      int j=1;
//      do{
//          if (j==5)continue;
//          System.out.print(j+" ");
//          j++;
//      }while(j<=10);
//        System.out.println();


        int j=1;
        do{
            if (j==5) {
                j++;
                continue;
            }
            System.out.print(j+" ");
            j++;
        }while (j<=10);

    }
/*  ---for loop--
1 2 3 4 6 7 8 9 10
---------do-while loop----
1 2 3 4   */

}
