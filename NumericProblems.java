import java.util.Scanner;

public class NumericProblems {

    public static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int CountZero(int n) {
        int i, count = 0;
        for (i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;
    }

    public static void fibonacci(int num) {
        int first = 0, second = 1;

        System.out.print(first + " ");
        System.out.print(second + " ");
        for (int i = 2; i < num; i++) {
            int result = first + second;
            first = second;
            second = result;
            System.out.print(result + " ");
        }
    }

    public static void ModularExpo(double a,double b,double c)
    {
      double power=Math.pow(a, b);
      double result=power%c;
      System.out.println("output is :"+result);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num;
        // prime
        boolean prime = true;
        int sum = 0;
        System.out.println("Enter A Number:");
        num = sc.nextInt();
        int i;
        // for (i = 2; i <= num; i++) {
        // if(isPrime(i))
        // {
        // sum+=i;
        // }
        // }
        // if(prime)
        // {
        // System.out.println("Prime");
        // }else{
        // System.out.println("Not prime");
        // }
        // System.out.println("sum of prime=" + sum);

        // **Count trailing zeroes in factorial of a number */

        int result = CountZero(num);
        System.out.println("Total zero in a number :" + result);

        // calculate sum of digit until it become single digit

        // while (num > 9) {
        // int rem = num % 10;
        // System.out.println(rem);
        // sum += rem;
        // num /= 10;
        // }
        // System.out.println("Sum of digit is :" + sum);

        // find all prime factors of a number
        // for( i=2;i<num;i++)
        // {
        // if(isPrime(i))
        // {
        // if(num%i==0)
        // {
        // System.out.print(i+" ,");
        // }
        // }
        // }

        // check armstrong number
        // int temp=num;
        // while(num>0)
        // {
        // int rem=num%10;

        // sum+=(Math.pow(rem,3));

        // num/=10;
        // }

        // if(temp==sum)
        // {
        // System.out.println("Armstrong Number:");
        // }else{

        // System.out.println("Not Armstrong Number:");
        // }

        // print first n perfect numbers

        // for(i=1;i<num;i++)
        // {
        // for(int j=1;j<=i-1;j++)
        // {
        // if(i%j==0)
        // {
        // sum=sum+j;
        // }

        // }
        // if(sum==i)
        // {
        // System.out.println(sum);
        // }
        // sum=0;
        // }

        // check palindrome
        // int result=0;
        // int temp=num;
        // while(num>0)
        // {
        // int rem=num%10;

        // result=+(result*10)+rem;   

        // num/=10;
        // }
        // if(temp==result)
        // {
        // System.out.println("Palindrome");
        // }else{
        // System.out.println("Not Palindrome");
        // }

        // ** compute nth fibonacci number */
        // fibonacci(num);
        ModularExpo(2,5,13);
    }

}
