import java.util.Scanner;


class Result
{
         public static void main(String[] args)
         {
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter the Number");
              int n1 = sc.nextInt();
              

              if(n1>=0 && n1<=30)
              { 
              System.out.println("You are Fail");
              }
              else if(n1>=31 && n1<=50)
              {
     
              System.out.println("You are Pass only");
              }
              
              else if(n1>=51 && n1<=70)
              {
               System.out.println("You are Second Division");
              }
              
              else if(n1>=71 && n1<=100)
              {
     
              System.out.println("You are First Division");
              }
              
              else
              {
     
              System.out.println("This Number is not Valid");
              }
              
         }
}