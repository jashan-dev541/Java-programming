// import java.util.*;
// public class array {
//     public static void main(String args[]){
//         int n, even=0, odd=0;
//         System.out.println("Enter no. of elements: ");
//         Scanner sf = new Scanner(System.in);
//         n = sf.nextInt();

//         System.out.println("Enter the elements: ");
//         int arr[] = new int[n];
//         for(int i=0; i<n; i++){
//             arr[i] = sf.nextInt();
//         }

//         //calculate no. of even and odd elements in array
//         for(int i=0; i<n; i++){
//             if(arr[i] %2 ==0) even++;
//             else odd++;
//         }
//         System.out.println("Even elements: " + even + "\nOdd elements: " + odd);
//         sf.close();
//     }
// }

//Q. You have an array of size n. 
//   Swap and print all the elements of the array (array reverse)


//Answer 1.
// import java.util.Scanner;
// public class array{
//     public static void main(String args[]){
//         int n;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter " + n + " elements: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }

//         for(int i=0,j=n-1; i<j; i++,j--){
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }

//         System.out.println("Reverse of this array: ");
//         for(int i=0; i<n; i++){
//             System.out.print(arr[i] + " ");
//         }
//         sc.close();
//     }
// }



//Q. You have an array of size n, and a target value t.
// Check if the array contains a possible pair of the elements
// such that their sum is equal to t. Print yes if it has
// else print not.


//Answer 2.
// import java.util.*;
// public class array{
//     public static void main(String args[]){
//         int n,t;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of array: ");
//         n= sc.nextInt();
//         System.out.println("Enter the target value");
//         t = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter "+n+" elements: ");
//         for(int i=0; i<n; i++){
//             arr[i] = sc.nextInt();
//         }   
//         boolean found = false; int count = 0;
//         for(int i=0; i<arr.length; i++){
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[i] + arr[j] == t){
//                     System.out.println("Yes, sum of "+ arr[i] + " and "+ arr[j] + " is equal to " + t);
//                     found = true;
//                     count++;
//                     break;
//                 }
//                }
//         }
//         if(!found){
//             System.out.println("No, any such pair doesn't exist whose sum equals "+ t + " in given array.");
//         }
//         else{
//             System.out.println("Total no. of pairs whose sum equals "+ t+ " is/are: " + count);
//         }
//     }
// }