package assignmentCollection.HashMap;

import java.util.HashMap;

public class ShoppingCartwithQuantity {

    static void main() {
        HashMap<String, Integer> cart = new HashMap<>();

        // TASKS:
        cart.put("Laptop", 1);
        cart.put("Mouse", 2);

        // a) Add Mouse quantity +1
        cart.put("Mouse", cart.getOrDefault("Mouse", 0) + 1);
        System.out.println(cart);

        // b) Calculate total items
        int totalItems = cart.values().stream().mapToInt(Integer::intValue).sum();
        System.out.println("Total items in cart: " + totalItems);

        // c) Calculate total price (Laptop=50000, Mouse=500)
        int totalPrice = cart.entrySet().stream()
                .map(entry -> entry.getKey().equals("Laptop") ? entry.getValue() * 50000 : entry.getValue() * 500)
                .reduce(0, Integer::sum);
        System.out.println("Total price in cart: " + totalPrice);

        // d) Remove items with qty=0
        cart.entrySet().removeIf(entry -> entry.getValue() == 0);
        System.out.println("Cart after removing items with qty=0: " + cart);
    }
}
