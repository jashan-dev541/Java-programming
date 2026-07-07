import java.util.Scanner;
public class functions {
    // public static int factorial(int a){
    //  int fact = 1;
    //  for(int i=1; i<=a; i++){
    //     fact *= i;
    //  }
    //  return fact;
    // }

    public static int gcd(int a, int b){
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }

    public static int lcm(int a, int b){
        int LCM = (a*b)/gcd(a,b);
        return LCM;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        int b = sc.nextInt();
        sc.close();
        // System.out.println(factorial(a)); 
        System.out.printf("GCD: %d\nLCM: %d",gcd(a,b),lcm(a,b));
    }
}
