import java.util.Scanner;

public class FindTheVowel1 {
    
     public static void main(String[] args) {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
    
           String input = sc.nextLine();

           
          for(int i = 0; i < input.length(); i++) {
              char ch = input.charAt(i);
              if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'u' || ch == 'o' ||  
                 ch == 'A' || ch == 'E' || ch == 'I' || ch == 'U' || ch == 'O') {
                       System.out.print(ch);
                 }
          }
     }
}
