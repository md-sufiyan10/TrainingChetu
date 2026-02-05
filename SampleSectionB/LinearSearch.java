package TrainigChetu.SampleSectionB;

public class LinearSearch {
    static void main() {
        int arr[]={10,20,40,50,60,80};
        int key=80;
        boolean found=false;

        for (int i=0; i<arr.length;i++){
            if (arr[i]==key){
                System.out.println("Element Found at Index: "+i);
                found=true;
                break;
            }
        }
        if (!found)
            System.out.println("Element not Found:");
    }
}
