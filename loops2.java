// Basic loop exam questions
import java.util.*;
public class loops2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        sc.close();

        //Factorial
        // int fact = 1;
        // for(int i=1; i<=a; i++){
        //     fact *= i;
        // }
        // System.out.println("Factorial of " + a + " is: " + fact);


        //Multiplication
        // for(int i=1; i<=10; i++){
        //     System.out.println(a + " X "+ i + " = "+a*i);
        // }


        //Even numbers
        // for(int i=1; i<=a; i++){
        //     if(i%2==0){
        //         System.out.print(i+" ");
        //     }
        // }


        //sum of first n natural numbers
        // int sum = 0;
        // for(int i=1; i<=a; i++){
        //     sum += i;
        // }
        // System.out.println("Sum from 1 to " + a + " is: " + sum);


        //Reversing a number
        // int temp = a,rev = 0;
        // for(int i=0; i<=temp; i++){
        //     int digit = temp%10;
        //     rev = rev*10 + digit;
        //     temp = temp/10;  
        // }
        // System.out.println(rev);

        //Prime check
        // int prime = 0;
        // if(a==0 || a==1) prime = 1;
        // for(int i=2; i<=a/2; i++){
        //     if(a%i==0){
        //         prime = 1;
        //         break;
        //     }
        // }
        // if(prime == 1) System.out.println("Not Prime");
        // else System.out.println("Prime");


        //Count of digits
        // int temp = a,count=0;
        // while(temp>0){
        //     temp = temp/10;
        //     count++;
        // }
        // System.out.println(count);


        //sum of digits
        // int sum = 0;
        // for(int i=0; i<=a; i++){
        //     int digit = a%10;
        //     sum += digit;
        //     a/=10;
        // }
        // System.out.println(sum);

        
        //Fibonacci
        // int b=0,c=1;
        // for(int i=1; i<=a; i++){
        //     System.out.print(b + " ");
        //     int d = b + c;
        //     b = c;
        //     c = d;
        // }

    }
}