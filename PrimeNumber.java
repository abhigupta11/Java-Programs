import java.util.Scanner;


class PrimeNumber
{
         public static void main(String[] args)
         {
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter the Number");
              int n1 = sc.nextInt();
              int n2 = 2;
              int rest = 0;

              for(int i=1; i<=n1; i++)
              {
                  if(n1%i==0)
                  { 
                     rest++;
                  }
              }
              if(n2==rest)
              {
                     System.out.println(n1 + " is an prime Number");
              }
              else
              {
                     System.out.println(n1 + " is not Prime Number");
              }
              
         }
}