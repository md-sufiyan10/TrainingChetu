package java_8;

import java.util.function.Consumer;

public class Consumer_01 {
    static void main() {

        Consumer<String> consumer = s -> System.out.println(s);
        consumer.accept("Hello World");

        Consumer<String> consumer_01 = System.out::println;
        consumer_01.accept("Hello World Welcome");

        Consumer<String> consumer_02 = s -> System.out.println(s.toUpperCase());
        consumer_02.accept("Hello World Welcome Sufi");
    }
}
