package ExceptionHandling;

public class EH03_ReturnFinally {
    static void main(String[] args) {
        System.out.println(compute());
    }
    static int compute(){
        try{
            return 10;
        }finally{
            throw new RuntimeException("Error");
        }
    }
}
