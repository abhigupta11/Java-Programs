import java.util.Scanner;

public class FindTheVowel
{
    
     public static void main(String[] args)
     {

           Scanner sc = new Scanner(System.in);
           System.out.println("Enter the String");
    
           String input = sc.nextLine();

           
          for(int i=0; i<input.length(); i++)
          {
              if(input.chatAt(i)=='a' || input.chatAt(i)=='e' || input.chatAt(i)=='i' || input.chatAt(i)=='u' || input.chatAt(i)=='o' ||  
                 input.chatAt(i)=='A' || input.chatAt(i)=='E' || input.chatAt(i)=='I' || input.chatAt(i)=='U' || input.chatAt(i)=='O' )
                 {  
                       System.out.print(input.charAt(i));
                 }
          }
     }
}