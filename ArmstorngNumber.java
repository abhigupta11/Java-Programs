import java.util.Scanner;


class ArmstorngNumber
{
         public static void main(String[] args)
         {
              Scanner sc = new Scanner(System.in);
              
              System.out.println("Enter the Number");
              int n1 = sc.nextInt();
              int res = n1;
              int sum = 0;

              while(n1!=0)
              {
                 int rem = n1%10;
                 sum = sum+rem*rem*rem; 
                 n1 = n1/10;
              
              }
              if(res==sum)
              {
                 System.out.println(res + " is a Armstrong Number");
              }
              else
              {
                System.out.println(res + " is not a Armstrong Number");
              } 
}
}
