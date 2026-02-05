package TrainigChetu.Day_5;

public class MargeArrays {
    static void main()
    {
        int arr1[] = {11, 12, 13, 14, 15};
        int arr2[] = {10, 20, 30, 40, 50};

        // output : {11,10,12,20,13,30,14,40,15,50};

        int merge[] = new int[arr1.length + arr2.length];
        int index = 0;
        for (int i = 0; i < arr1.length; i++) {
            merge[index++] = arr1[i];
            merge[index++] = arr2[i];
        }
        System.out.print("Merge Array:{");
        for (int i=0 ;i<merge.length;i++){
            System.out.print(merge[i]);
            if (i<merge.length-1)
                System.out.print(",");
        }
        System.out.println("}");
    }
    }

