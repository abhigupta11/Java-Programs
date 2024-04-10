import java.util.Scanner;

class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int n1 = sc.nextInt();
        int res = n1;
        int sum = 0;

        while (n1 != 0) {
            int rem = n1 % 10;
            sum += factorial(rem);
            n1 /= 10;
        }

        if (res == sum) {
            System.out.println(res + " is a Strong Number");
        } else {
            System.out.println(res + " is not a Strong Number");
        }
    }

    static int factorial(int x) {
        int fac = 1;
        for (int i = 1; i <= x; i++) {
            fac *= i;
        }
        return fac;
    }
}
