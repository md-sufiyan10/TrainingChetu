package java_8;

import java.util.List;
import java.util.Locale;

public class CombineFourPillar {
    static void main() {
        List<String> name= List.of("bro","java","Lambda");

      name.stream().filter(s->s.length()>2)
                      .map(str->str.toUpperCase())
                              .forEach(na->System.out.println(na));

        System.out.println("---------------");

     name.stream()
             .filter(s->s.length()>2)
             .map(String::toUpperCase)
             .forEach(System.out::println);

        }
}
