package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.List;

class ShoppingCart{
    private final List<String> cart;

    ShoppingCart() {
        this.cart = new ArrayList<>();
    }
    // Add item into cart
    public void addItem(String item){
        cart.add(item);
    }
    // a Print all items with index:
    public void printItemsWithIndex(){
        System.out.println("a ) Print all items with index:");
        for(int i=0;i<cart.size();i++){
            System.out.println(i+" -> "+cart.get(i));
        }
    }
    // b Remove all occurrence of an item "Mouse" from cart
    public void removeAllOccurrence(String items){
        cart.removeIf(item->item.equals("Mouse"));
        System.out.println("After removing Mouse :"+cart);
    }

    // c Add Item ("Headphone") at specific  index :
    public void addItemAtIndex(int index,String item){
       if(index<0 || index>cart.size()){
           throw new IndexOutOfBoundsException("Index out of bound"+cart.size());
       }
       cart.add(index,item);
       System.out.println("Added Headphone at index 1 :"+cart);
    }

    // d Sort cart alphabetically
    public void sortAlphabetically(){
        cart.sort(String::compareTo);
        for (String item : cart) {
            System.out.println(item);
        }
    }
    // e Print final cart
    public void printFinalCart(){
        System.out.println("e) Final Cart Size:"+cart.size());
        System.out.println("Final Cart Items :"+cart);
    }
}

public class ShoppingCart_02 {

    public static void main(String[] args) {
        ShoppingCart cart=new ShoppingCart();
        // Giving data:
        cart.addItem("Mouse");
        cart.addItem("Keyboard");
        cart.addItem("Monitor");
        cart.addItem("Mouse");  // duplicate

        // a) Print all items with index
        cart.printItemsWithIndex();

        // b) Remove "Mouse" (all occurrences)
        cart.removeAllOccurrence("Mouse");

        // c) Add "Headphone" at index 1
        cart.addItemAtIndex(1,"Headphone");

        // d) Sort cart alphabetically
        cart.sortAlphabetically();

        // e) Print final cart size and contents
        cart.printFinalCart();
    }
}
