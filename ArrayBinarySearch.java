// import java.util.*;

// public class ArrayBinarySearch {
//     public static void binarySearch(int a[], int n, int key) {
//         int left = 0, right = n - 1;
//         boolean found = false;

//         while(left <= right) {
//             int mid = (left + right) / 2;

//             if(a[mid] == key) {
//                 System.out.println("Element found at position " + (mid + 1));
//                 found = true;
//                 break;
//             }
//             else if(a[mid] > key) {
//                 right = mid - 1;
//             }
//             else {
//                 left = mid + 1;
//             }
//         }

//         if(!found) {
//             System.out.println("Element not found.");
//         }
//     }

//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of array: ");
//         int n = sc.nextInt();
//         int arr[] = new int[n];

//         System.out.println("Enter " + n + " sorted elements: ");
//         for(int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the number you want to search: ");
//         int key = sc.nextInt();

//         binarySearch(arr, n, key);

//         sc.close();
//     }
// }

