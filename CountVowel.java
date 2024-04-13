import java.util.Scanner;

public class CountVowel{
    
     public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
    
           String input = sc.nextLine();
           int count = 0;

           
          for(int i = 0; i < input.length(); i++) {
              char ch = input.charAt(i);
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' ||  
                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O') {
                       System.out.print(ch);
                       count++;
                       
                 }
                 
          }
          System.out.println();
          System.out.println("No of Count Vowel in the String " + count);
     }
}
