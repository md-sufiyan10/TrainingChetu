package java_8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Function_01 {
    static void main() {

        Function<String,Integer> stringLength = s -> s.length();

        System.out.println(stringLength.apply("Hello"));


        List<String> al=new ArrayList<>(Arrays.asList("gautam","amit","aryan","shubham"));
        List<String> list = List.of("sufiyan","khan","shivam","samar");


        al.stream().map(string->string+"abc").forEach(update->System.out.println(update));
        System.out.println("----------------");
        list.stream().map(string->string+"abc").forEach(System.out::println);

    }
}
