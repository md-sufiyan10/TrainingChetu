package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ShoppingCart_01 {
    static void main() {

        // Given Cart data
        ArrayList<String> cart=new ArrayList<>();
        cart.add("Laptop");
        cart.add("Mouse");
        cart.add("Keyboard");
        cart.add("Mouse");   // Duplicate element

        // a ) Print all items with index:

        System.out.println(" a ) Items with index :");

        for (int i=0; i<cart.size(); i++) {
            System.out.println( i + " -> "+cart.get(i));
        }
        // b) Remove "Mouse" ("all occurrence)
        System.out.println("\n b) Removing all occurrences of \"Mouse\" :");
        cart.removeIf(item->item.equals("Mouse"));
        System.out.println( "After removing Mouse :"+cart);

        // c ) Add "Monitor " at index  1 :

        System.out.println(" \nc) Adding \"Monitor\" at index 1  :");
        cart.add(1,"Monitor");

        System.out.println("Added Monitor at index 1 :"+cart);

        // d ) Sort cart alphabetically

        System.out.println("\n d) Sorting cart alphabetically :");
//        cart.sort(String::compareTo);
//        for (String item : cart) {
//            System.out.println(item);
//        }
        Collections.sort(cart);
        for (String item : cart) {
            System.out.println(item);
        }

        // e ) Print final cart
        System.out.println("\n e) Final Cart Size:"+cart.size());
        System.out.println("Final Cart Items :"+cart);

    }
}
