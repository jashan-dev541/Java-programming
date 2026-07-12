// //print total no. of vowels and consonants
// import java.util.Scanner;
// public class String_s {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.nextLine();
//         int cons = 0;
//         int vow = 0;
//         for(int i=0; i<s.length(); i++){
//             char ch = s.charAt(i);
//             if(ch=='a' || ch=='e' || ch=='i' || ch=='o'||ch=='u' || ch=='A'||ch=='E' || ch=='I' || ch=='O' || ch=='U'){
//                 vow++;
//             }
//             else if(s.charAt(i) == ' '){
//                 continue;
//             }
//             else{
//                 cons++;
//             }
//         }
//         System.out.println(cons);
//         System.out.println(vow);
//         sc.close();
//     }
// }


                    //You are given a string s, print yes if 
                    //it is a palindrome and vice versa
// import java.util.Scanner;
// public class String_s {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String s = sc.next();
//         int left = 0;
//         int right = s.length()-1;
//         boolean palin = true;
//         while(left<=right){
//             if(s.charAt(left) == s.charAt(right)){
//                 left++; 
//                 right--;
//             }
//             else{
//                 palin = false;
//                 break;
//             }
//         }
//         if(!palin) System.out.println(" Not Palindrome");
//         else System.out.println("Palindrome");
//         sc.close();
//     }
// }


            //write a method in Java called sumArray(int[] arr) and 
            // demonstrate with an example,the when hyou modify 
            // elements of an array inside the method, those chages 
            // are visible outside the method as well (passed by refrence)
// public class String_s{
//     public static void sumArray(int arr[],int n){
//         for(int i=0; i<n; i++){
//             arr[i] += 38;
//         }
//     }

//     public static void main(String args[]){
//         int arr[] = {2,3,4,5,7};
//         System.out.println("Og Array: ");
//         for(int i=0; i<5; i++){
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println("\nModified Array: ");
//         sumArray(arr,5);

//         for(int i=0; i<5; i++){
//             System.out.print(arr[i] + " ");
//         }
//     }
// }


//string bulider
// import java.util.*;
// public class String_s{
//     public static void main(String args[]){
//         StringBuilder sb = new StringBuilder("Tony");
//         System.out.println(sb);

//         //char at index 0
//         System.out.println(sb.charAt(0));

//         //set char at index 0
//         sb.setCharAt(0,'P' );
//         System.out.println(sb);

//         sb.insert(2,'n');
//     }
// }