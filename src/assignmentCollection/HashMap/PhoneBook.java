package assignmentCollection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    static void main() {

        HashMap<String, String> phoneBook = new HashMap<>();
        phoneBook.put("Ram", "123-456-7890");
        phoneBook.put("Shyam", "987-654-3210");

        // TASKS:
        // a) Add 5 more contacts
        phoneBook.put("Ravi", "555-123-4567");
        phoneBook.put("Sita", "555-987-6543");
        phoneBook.put("Gita", "555-456-7890");
        phoneBook.put("Hari", "555-789-0123");
        phoneBook.put("Laxmi", "555-321-6547");

        for(String name : phoneBook.keySet()) {
            System.out.println(name + " : " + phoneBook.get(name));
        }
        // b) Search for "Ram" phone
        String ramPhone = phoneBook.get("Ram");
        if(ramPhone != null) {
            System.out.println("Ram's phone number is: " + ramPhone);
        } else {
            System.out.println("Ram's phone number not found in the phone book.");
        }

        // c) Update Shyam's number
        phoneBook.put("Shyam", "987-654-3211");
        System.out.println("Updated Shyam's phone number: " + phoneBook.get("Shyam"));

        // d) Remove "Geeta" if exists
        phoneBook.remove("Geeta");
        if(phoneBook.containsKey("Geeta")) {
            System.out.println("Geeta was not found in the phone book.");
        } else {
            System.out.println("Removed Geeta from phone book.");
        }

        // e) Print all contacts sorted by name
              phoneBook.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
    }
}
