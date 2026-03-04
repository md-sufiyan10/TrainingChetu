package ExceptionHandling;

public class UncheckedCustomExceptionDemo {

    static class InvalidAgeException extends Exception{

        public InvalidAgeException(String msg){
            super(msg);
        }
    }
    static void registerForVoting(int age) throws InvalidAgeException {
        if (age<18){
            throw new InvalidAgeException("Age Must be 18+ for vote :"+age);
        }
        System.out.println("Registration Successful"+age);
    }

    static void main() {
        try{
            registerForVoting(17);
        }catch(InvalidAgeException e) {
            System.out.println("Validation Failed :" +e.getMessage());
        }
    }
}
