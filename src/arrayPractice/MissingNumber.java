package arrayPractice;

public class MissingNumber {
    static void main() {
        int arr[]={1,2,3,4,6,7,8,9};
        int n=arr.length+1;
        int totalSum=n*(n+1)/2;
        int arraySum=0;
        for(int num:arr){
            arraySum+=num;
        }
        System.out.println("Total Sum is:"+totalSum);
        System.out.println("Array Sum is:"+arraySum);
        System.out.println("Missing Number is :"+(totalSum-arraySum));
    }
}
