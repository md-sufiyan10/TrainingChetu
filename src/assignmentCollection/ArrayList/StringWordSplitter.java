package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StringWordSplitter {
    public static void main(String[] args) {
        String sentence = "java is awesome programming language";
        ArrayList<String> words = new ArrayList<>();

        // a) Split sentence into words ArrayList
        String[] splitWords = sentence.split(" ");
        for (String word : splitWords) {
            words.add(word);
        }
        System.out.println("After splitting: " + words);

        // b) Count words starting with 'a'
        int count = 0;
        for (String word : words) {
            if (word.startsWith("a")) {
                count++;
            }
        }
        System.out.println("Words starting with 'a': " + count);

        // c) Remove words shorter than 4 chars
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 4) {
                iterator.remove();
            }
        }
        System.out.println("After removal: " + words);

        // d) Print words in reverse order
        System.out.println("Words in reverse order:");
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }
}