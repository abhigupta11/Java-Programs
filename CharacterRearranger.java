public class CharacterRearranger {
    public static String rearrangeString(String input) {
        char[] chars = input.toCharArray();
        
        // Rearrange characters
        for (int i = 0; i < chars.length - 1; i += 2) {
            char temp = chars[i];
            chars[i] = chars[i + 1];
            chars[i + 1] = temp;
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
