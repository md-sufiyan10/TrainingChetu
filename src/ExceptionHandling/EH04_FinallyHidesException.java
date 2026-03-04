package ExceptionHandling;

public class EH04_FinallyHidesException {
    static void main(String[] args) {
       try{
           f();
       }catch (Exception e){
           System.out.println("Caught Exception"+e);
           System.out.println("Cause :"+e.getCause());
       }
    }
    static void f(){
        try{
            throw new IllegalArgumentException("From Try");
        }finally{
           throw new IllegalStateException("From Finally");
        }
    }
}
