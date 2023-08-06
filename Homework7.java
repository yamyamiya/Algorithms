package lesson8.Homework7;

import java.util.HashMap;
import java.util.Map;

public class Homework7 {
    public static void main(String[] args) {
        String text = "Hello world this is us!";
        Map<Character, Integer> letterFrequency = calculateLetterFrequency(text);
        for (Map.Entry<Character, Integer> entry : letterFrequency.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static Map<Character, Integer> calculateLetterFrequency(String text) {
        Map<Character, Integer> letterFrequency = new HashMap<>();
        String loverCaseText = text.toLowerCase();
        for (int i = 0; i < loverCaseText.length(); i++) {
            char c = loverCaseText.charAt(i);
            if (Character.isLetter(c)) {
                letterFrequency.put(c, letterFrequency.getOrDefault(c, 0) + 1);
            }
        }
        return letterFrequency;
    }
}
