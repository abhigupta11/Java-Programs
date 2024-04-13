import java.util.Scanner;

public class VowelThenConsonant{
    
     public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
    
           String input = sc.nextLine();
           String vowels = ""; // Initialize as an empty string to store vowels  
           String consonants = ""; // Initialize as an empty string to store consonants


           
          for(int i = 0; i < input.length(); i++) {
              char ch = input.charAt(i);
              
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' ||  
                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O') {
                          vowels += ch;
                       
                       
                 } 
                 else
                 {   
                      consonants += ch;
                 }
                 
          }
          System.out.println("Vowels " + vowels);
          System.out.println("Consonant " + consonants);
          System.out.println(vowels + consonants);
         
     }
}
