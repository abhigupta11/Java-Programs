import java.util.Scanner;
class ReverseString
{
    public static void main(String[] args )
    {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter the String");
         
        String input = sc.nextLine();



        for(int i=input.length()-1; i>=0; i--)
       {
          System.out.println(input.charAt(i));
       }

     }

} 