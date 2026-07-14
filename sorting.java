public class sorting {

    public static void pritarr(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int n = 5;
        int arr[] = {7,8,3,1,2};

        //Bubble Sort
        // for(int i=0; i<arr.length-1; i++){
        //     for(int j=0; j<arr.length-i-1; j++){
        //         if(arr[j]>arr[j+1]){
        //             //swap
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // pritarr(arr);


        //Insertion sort
        // for(int i=1; i<=n-1; i++){
        //     int key = arr[i];
        //     int j=i-1;
        //     while(j>=0 && arr[j]>key){
        //         arr[j+1] = arr[j];
        //         j -= 1;
        //         }
        //         arr[j+1] = key;
        //     }


        //Selection sort
        for(int i=0; i<n-1; i++){
            int minIndex = i;
            for(int j=i+1; j<n; j++){
                if(arr[j]<arr[minIndex]){
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
            pritarr(arr);
        }
    }

