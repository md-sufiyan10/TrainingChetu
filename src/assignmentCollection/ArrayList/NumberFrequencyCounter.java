package assignmentCollection.ArrayList;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;

public class NumberFrequencyCounter {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        // Add 20 random numbers between 1 and 10
        for (int i = 0; i < 20; i++) {
            numbers.add(random.nextInt(10) + 1);
        }
        System.out.println("Generated numbers: " + numbers);

        // a) Count frequency of each number (manual loop)
        int[] frequencies = countFrequencies(numbers);
        System.out.println("Frequencies:");
        for (int i = 1; i <= 10; i++) {
            if (frequencies[i] > 0) {
                System.out.println(i + ": " + frequencies[i]);
            }
        }

        // b) Find most frequent number
        int mostFrequent = findMostFrequent(frequencies);
        System.out.println("Most frequent number: " + mostFrequent);

        // c) Replace all 7s with 0s
        replaceSevensWithZeros(numbers);
        System.out.println("After replacing 7s with 0s: " + numbers);

        // d) Print unique numbers only
        System.out.println("Unique numbers:");
        printUniqueNumbers(numbers);
    }

    // a) Count frequency of each number (manual loop, using array for 1-10)
    private static int[] countFrequencies(ArrayList<Integer> numbers) {
        int[] freq = new int[11]; // Index 1 to 10
        for (int num : numbers) {
            if (num >= 1 && num <= 10) {
                freq[num]++;
            }
        }
        return freq;
    }

    // b) Find most frequent number
    private static int findMostFrequent(int[] frequencies) {
        int maxFreq = 0;
        int mostFrequent = -1;
        for (int i = 1; i <= 10; i++) {
            if (frequencies[i] > maxFreq) {
                maxFreq = frequencies[i];
                mostFrequent = i;
            }
        }
        return mostFrequent;
    }

    // c) Replace all 7s with 0s
    private static void replaceSevensWithZeros(ArrayList<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) == 7) {
                numbers.set(i, 0);
            }
        }
    }

    // d) Print unique numbers only
    private static void printUniqueNumbers(ArrayList<Integer> numbers) {
        HashSet<Integer> unique = new HashSet<>(numbers);
        for (int num : unique) {
            System.out.println(num);
        }
    }
}