package assignmentCollection.HashMap;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    static void main() {
        String text = "java java python python c++ java spring boot";

        HashMap<String, Integer> wordCount = new HashMap<>();

        // TASKS:
        // a) Count frequency of each word
        for (String word : text.split(" ")) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        for(Map.Entry<String, Integer> entry : wordCount.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        System.out.println("---------------------");

        // b) Print words with count > 1
        wordCount.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));

        // c) Find most frequent word
        String mostFrequentWord = wordCount.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(null);
        System.out.println("Most frequent word: " + mostFrequentWord);

        // d) Replace "java" count with 100
        wordCount.put("java", 100);
        System.out.println("Updated word count: " + wordCount);


    }
}
