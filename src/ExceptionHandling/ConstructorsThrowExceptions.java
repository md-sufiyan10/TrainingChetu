package ExceptionHandling;

class User{
    private String name;

    public  User(String name) throws Exception {
        if(name==null || name.isEmpty()){
            throw new Exception("Name can not empty");
        }
        this.name=name;
    }
}
public class ConstructorsThrowExceptions {
    static void main() {
   try{
       User u=new User("");
   }catch (Exception e){
       System.out.println("Error:"+e.getMessage());
   }
    }
}
