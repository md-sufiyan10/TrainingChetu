package TrainigChetu.SampleSectionB;

public class BinarySearch {
    static void main() {
        int arr[]= {20,30,40,50,60,70};
        int element=50;
        int li=0; int hi=arr.length-1;
        boolean found=false;

        while (li<=hi){
            int mid=(li+hi)/2;
            if (arr[mid]==element){
                System.out.println(element +" => Element is found at index:"+mid);
                found=true;
                break;
            }
            if (element > arr[mid])
                li=mid+1;
            else
                hi=mid-1;
        }
        if (!found)
            System.out.println("Element is Not found:");

    }
}
