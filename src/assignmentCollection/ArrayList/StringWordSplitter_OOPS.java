package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class StringWordSplitter_OOPS {
    public static void main(String[] args) {
        String sentence = "java is awesome programming language";
        ArrayList<String> words = splitSentence(sentence);
        System.out.println("After splitting: " + words);

        int count = countWordsStartingWithA(words);
        System.out.println("Words starting with 'a': " + count);

        removeShortWords(words);
        System.out.println("After removal: " + words);

        System.out.println("Words in reverse order:");
        printWordsInReverse(words);

        // Calling additional related methods
        convertToUppercase(words);
        System.out.println("After converting to uppercase: " + words);

        String longestWord = findLongestWord(words);
        System.out.println("Longest word: " + longestWord);

        int vowelCount = countVowelsInWords(words);
        System.out.println("Total vowels in all words: " + vowelCount);
    }

    // a) Split sentence into words ArrayList
    private static ArrayList<String> splitSentence(String sentence) {
        ArrayList<String> words = new ArrayList<>();
        String[] splitWords = sentence.split(" ");
        for (String word : splitWords) {
            words.add(word);
        }
        return words;
    }

    // b) Count words starting with 'a'
    private static int countWordsStartingWithA(ArrayList<String> words) {
        int count = 0;
        for (String word : words) {
            if (word.startsWith("a")) {
                count++;
            }
        }
        return count;
    }

    // c) Remove words shorter than 4 chars
    private static void removeShortWords(ArrayList<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (word.length() < 4) {
                iterator.remove();
            }
        }
    }

    // d) Print words in reverse order
    private static void printWordsInReverse(ArrayList<String> words) {
        for (int i = words.size() - 1; i >= 0; i--) {
            System.out.println(words.get(i));
        }
    }

    // Additional method: Convert all words to uppercase (modifies the list)
    private static void convertToUppercase(ArrayList<String> words) {
        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).toUpperCase());
        }
    }

    // Additional method: Find the longest word
    private static String findLongestWord(ArrayList<String> words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Additional method: Count total vowels in all words (a, e, i, o, u - case insensitive)
    private static int countVowelsInWords(ArrayList<String> words) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (String word : words) {
            for (char c : word.toCharArray()) {
                if (vowels.indexOf(c) != -1) {
                    count++;
                }
            }
        }
        return count;
    }
}

