import java.util.*;
public class recurssion{
    // public static int sum(int n){
    //     if(n==1 || n==0) return 1;
    //     return n + sum(n-1);
    // }

    // public static int fib(int a){
    //     if(a==0) return 0; 
    //     if(a==1) return 1;
    //     return fib(a-1) + fib(a-2);
    // }

    public static int stackHeight(int a, int n) {
    if (n == 0) return 1;       // base case
    if (a == 0) return 0;       // base case

    int half = stackHeight(a, n / 2);

    if (n % 2 == 0) {
        return half * half;     // even exponent
    } else {
        return half * half * a; // odd exponent
    }
}

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(stackHeight(a, n));
        // System.out.println("Fibonacci series upto "+a+" terms: ");
        // for(int i=0; i<=a-1; i++) System.out.print(fib(i)+" ");
        // System.out.println(sum(a));
        sc.close();
    }
}