package java_8;

import java.util.function.Supplier;

public class Supplier_01 {
    static void main() {
        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());
    }
}
