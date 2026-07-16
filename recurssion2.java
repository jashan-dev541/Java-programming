public class recurssion2{
    // public static void towerOfHanoi(int n, String s, String h, String d ){
    //     if(n==1){
    //         System.out.println("transfer disk " + n + " from " + s + " to " + d);
    //         return;
    //     }
    //    towerOfHanoi(n-1,s,d,h);
    //    System.out.println("transfer disk " + n + " from " + s + " to " + d); 
    //    towerOfHanoi(n-1, h, s, d);
    // }


    // public static void reverse(String s, int idx){
    //     if(idx == 0){
    //         System.out.print(s.charAt(idx));
    //         return;
    //     }
    //     System.out.print(s.charAt(idx));
    //     reverse(s,idx-1);
    // }

    // static int first=-1 , last = -1;
    // public static void getIndices(String s, char el, int idx){
    //     if(idx == s.length()){
    //         return;
    //     }
    //     if(s.charAt(idx) == el){
    //         if(first == -1){
    //             first = idx;
    //         }
    //         else{
    //             last = idx;
    //         }
    //     }
    //     getIndices(s, el, idx + 1);
    // }


    // public static int sortedArr(int arr[], int n){
    //     int sorted = 1;
    //     for(int i=0; i<n-1; i++){
    //         if(arr[i]>arr[i+1]){
    //             sorted = 0;
    //             break;
    //         }
    //     }
    //     if(sorted == 0) System.out.println("The array isn't sorted");
    //     else System.out.println("The array is sorted");
    //     return sorted;
    // }


    
    public static void main(String args[]){
        // int n=3;
        // towerOfHanoi(n, "S", "H", "D");

        // String s = "Namoona";
        // reverse(s,s.length() - 1);

        // getIndices("Awesome", 'e', 0);
        // System.out.println("First Occourance: " + first);
        // System.out.println("Last Occurance: " + last);

        // int arr[] = {1,2,3,4,5};
        // sortedArr(arr, 5);
    }
}
