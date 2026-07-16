//                 Sum of each element of matrix

// import java.util.*;
// public class td_arrays {
//     public static void main(String args[]){
//         int n,m;
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the no. of rows and columns respectively: ");
//         n = sc.nextInt();
//         m = sc.nextInt();
//         int arr[][] = new int[n][m], sum = 0;
//         System.out.println("Enter " + n*m +" elements: ");
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//                 sum += arr[i][j];
//             }
//         }
//         System.out.println("The 2d array entered is: ");
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }
//         System.out.println("The sum of the elements of this array is: " + sum);
//         sc.close();
//     }
// }


//                 Sum of the elements row-wise for each row
// import java.util.*;
// public class td_arrays{
//     public static void main(String args[]){
//         int n,m;
//         System.out.println("No. of rows and columns: ");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         m = sc.nextInt();
//         int arr[][] = new int[n][m];

//         System.out.println("Enter elements of array: ");
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Row wise sum: ");
//         for(int i=0; i<n; i++){
//             int rowSum = 0;
//             for(int j=0; j<m; j++){
//                 rowSum += arr[i][j];
//             }
//             System.out.println("Row " + (i+1) + " sum: " + rowSum);
//         }
//         System.out.println("Column wise sum: ");
//         for(int i=0; i<m; i++){
//             int colSum = 0;
//             for(int j=0; j<n; j++){
//                 colSum += arr[j][i];
//             }
//             System.out.println("Column " + (i+1) + " sum: " + colSum);
//         }
//         sc.close();
//     }
// }


//                 Transpose of matrix
// import java.util.Scanner;
// public class td_arrays{
//     public static void main(String args[]){
//          int n,m;
//         System.out.println("No. of rows and columns: ");
//         Scanner sc = new Scanner(System.in);
//         n = sc.nextInt();
//         m = sc.nextInt();
//         int arr[][] = new int[n][m];

//         System.out.println("Enter elements of array: ");
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Transpose of this matrix: ");
//         int transpose[][] = new int[m][n];
//           for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                transpose[j][i] = arr[i][j];
//             }
//         }
//           for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//               System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//         sc.close();
//     }
// }


