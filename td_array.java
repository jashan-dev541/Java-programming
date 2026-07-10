                //Sum of each element of matrix

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


                //Sum of the elements row-wise for each row
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


                //Transpose of matrix
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


                //Matrix multiplication
// import java.util.*;
// public class td_array{
//     public static void main(String args[]){
//         System.out.println("Enter no. of rows for matrix 1: ");
//         int rows;
//         Scanner sc = new Scanner(System.in);
//         rows = sc.nextInt();
//         System.out.println("Enter no. of columns for matrix 1: ");
//         int cols = sc.nextInt();
//         System.out.println("Enter elements for matrix 1: ");
//         int arr[][] = new int[rows][cols];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols; j++){
//                 arr[i][j] = sc.nextInt();
//             }
//         }

//         System.out.println("Enter no. of rows for matrix 2: ");
//         int rows_2;
//         rows_2 = sc.nextInt();
//         System.out.println("Enter no. of columns for matrix 2: ");
//         int cols_2 = sc.nextInt();
//         System.out.println("Enter elements for matrix 2: ");
//         int arr2[][] = new int[rows_2][cols_2];
//         for(int i=0; i<rows_2; i++){
//             for(int j=0; j<cols_2; j++){
//                 arr2[i][j] = sc.nextInt();
//             }
//         }

//     if(cols == rows_2){
//         int sum[][] = new int[rows][cols_2];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols_2; j++){
//                 for(int k=0; k<cols; k++){
//                     sum[i][j] += arr[i][k]*arr2[k][j];
//                 }
//             }
//         }
//         System.out.println("Multiplication of 2 matrices: ");
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<cols_2; j++){
//                 System.out.print(sum[i][j]+ " ");
//             }
//                System.out.println();
//         }
//     }
//     else System.out.println("Multiplication not possible.");
//     }
// }


import java.util.*;

public class td_array {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter no. of columns: ");
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];
        System.out.println("Enter elements of the matrix: ");
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int top = 0, bottom = rows-1, left = 0, right = cols-1;

        System.out.println("Spiral order traversal:");
        while(top <= bottom && left <= right){
            // left → right
            for(int i=left; i<=right; i++)
                System.out.print(arr[top][i] + " ");
            top++;

            // top → bottom
            for(int i=top; i<=bottom; i++)
                System.out.print(arr[i][right] + " ");
            right--;

            // right → left
            if(top <= bottom){
                for(int i=right; i>=left; i--)
                    System.out.print(arr[bottom][i] + " ");
                bottom--;
            }

            // bottom → top
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                    System.out.print(arr[i][left] + " ");
                left++;
            }
        }
        sc.close();
    }
}
