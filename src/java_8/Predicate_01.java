package java_8;

import java.util.function.Predicate;

public class Predicate_01 {
    static void main() {
        Predicate<Integer> isEven = x -> x %2==0;

        Predicate<StringBuilder> isPalindrome = str->str.reverse().equals(str);

        System.out.println(isEven.test(10));
        System.out.println(isPalindrome.test(new StringBuilder("madam")));
    }

//    @FunctionalInterface
//    public interface Predicate<T>{
//        public  boolean test(T t){
//            return t->t%2==0;
//        }
//    }

}
