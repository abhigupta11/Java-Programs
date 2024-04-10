import java.util.Scanner;


class EvenOdd
{
         public static void main(String[] args)
         {
              Scanner sc = new Scanner(System.in);
              
              System.out.println("enter the Number");
              int n1 = sc.nextInt();
              

              if(n1%2==0)
              { 
              System.out.println(n1 + " is an Even Number");
              }
              else 
              {
              
              System.out.println(n1 + " is an Odd Number");
              }
           
         }
}