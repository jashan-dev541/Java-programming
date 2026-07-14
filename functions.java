import java.util.Scanner;
// public class functions {
//     // public static int factorial(int a){
//     //  int fact = 1;
//     //  for(int i=1; i<=a; i++){
//     //     fact *= i;
//     //  }
//     //  return fact;
//     // }

//     public static int gcd(int a, int b){
//         while(b!=0){
//             int temp = b;
//             b = a%b;
//             a = temp;
//         }
//         return a;
//     }

//     public static int lcm(int a, int b){
//         int LCM = (a*b)/gcd(a,b);
//         return LCM;
//     }

//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt(); 
//         int b = sc.nextInt();
//         sc.close();
//         // System.out.println(factorial(a)); 
//         System.out.printf("GCD: %d\nLCM: %d",gcd(a,b),lcm(a,b));
//     }
// }


//write a function to check if a number is prime or not

//there are 2 users, one is trying to calculate the area of a rectangle
// as he have the length and breadth of rectangle and another one is trying to calculate area of cicle
// as he has the radius. Write a program to help them in calculating the area of rectangle and circle
//seperately
//both the areas must be in integer
import java.util.*;
public class functions{
    // public static void Prime(int a){
    // //     boolean prime = false;
    // //     if(a==0 || a==1) System.out.println("Not Prime");
    // //     for(int i=2; i<=(a)/2; i++){
    // //         if(a%i==0){
    // //             prime = true;
    // //         }
    // //    }
    // //    if(prime == false) System.out.println("Prime");
    // //    else System.out.println("Not Prime");
    // }

    public static int area(int a, int b){
        return a*b;
    }
    public static int area(int radius){
        return (int)3.14*radius*radius;
    }

    public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            // Prime(a);
            System.out.println("Area of rectangle: " + area(a,b));
            System.out.printf("Area of circle: %d",(area(a)));
            sc.close();
    }
}
