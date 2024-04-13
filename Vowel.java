import java.util.*;

public class Vowel {
    
    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    
    public static String rearrangeString(String input) {
        char[] chars = input.toCharArray();
        
        List<Character> vowels = new ArrayList<>();
        List<Character> consonants = new ArrayList<>();
        
        // Separate vowels and consonants
        for (char ch : chars) {
            if (Character.isLetter(ch)) {
                if (isVowel(ch))
                    vowels.add(ch);
                else
                    consonants.add(ch);
            }
        }
        
        // Rearrange characters
        int i = 0, j = 0, k = 0;
        while (i < chars.length) {
            if (j < vowels.size()) {
                chars[i++] = vowels.get(j++);
            }
            if (k < consonants.size()) {
                chars[i++] = consonants.get(k++);
            }
        }
        
        return new String(chars);
    }
    
    public static void main(String[] args) {
        String input = "Hello";
        String rearrangedString = rearrangeString(input);
        System.out.println("Original String: " + input);
        System.out.println("Rearranged String: " + rearrangedString);
    }
}
