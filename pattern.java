import java.util.Scanner;
public class pattern{
    public static void main(String[] args){
        
        //Butterfly

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        // for (int i = 1; i <= a; i++) {

        //     // Left wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Spaces between wings
        //     for (int j = 1; j <= 2*(a-i); j++) {
        //         System.out.print(" ");
        //     }

        //     // Right wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // Lower half
        // for (int i = a; i >= 1; i--) {

        //     // Left wing
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print("*");
        //     }

        //     // Spaces between wings
        //     // for (int j = 1; j <= 2*(a-i); j++) {
        //     //     System.out.print(" ");
        //     // }

        //     // Right wing
        //     // for (int j = 1; j <= i; j++) {
        //     //     System.out.print("*");
        //     // }
        //     // System.out.println();
        // }

                //Rhombus
                // for(int i=1;i<=a; i++){

                //     for(int j=a-i; j>=0; j--){
                //         System.out.print(" ");
                //     }

                //     for(int j=1; j<=a; j++){
                //         System.out.print("*");
                //     }

                //     for(int j=i-1; j>=0; j--){
                //         System.out.print(" ");
                //     }
                //     System.out.println();
                // }


                //Number triangle
                // int num = 1;
                // for(int i=1; i<=a; i++){
                //     for(int j=a-i; j>=0; j--){
                //         System.out.print(" ");
                //     }
                //     for(int j=1; j<=i; j++){
                //         System.out.print(num+ " ");
                //     }
                //     for(int j=a-i; j>=0; j--){
                //         System.out.print(" ");
                //     }
                //      num++;
                //     System.out.println();
                // }   


                //Alternate number triangle
                // for(int i=1; i<=a; i++){
                //     for(int j=a-i; j>=0; j--){
                //         System.out.print(" ");
                //     }
                //     for(int j=i; j>=1; j--){
                //         System.out.print(j);
                //     }
                //     for(int j=2; j<=i; j++){
                //         System.out.print(j);
                //     }
                //     for(int j=a-i; j>=0; j--){
                //         System.out.print(" ");
                //     }
                //     System.out.println();
                // }


                //Diamond

                //upward
                for(int i=1; i<=a; i++){
                    for(int j=a-i; j>=0; j--){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                     for(int j=2; j<=i; j++){
                        System.out.print("*");
                    }
                    for(int j=a-i; j>=0; j--){
                        System.out.print(" ");
                    }
                    System.out.println();
                }

                //downward part
                 for(int i=a; i>0; i--){
                    for(int j=a-i; j>=0; j--){
                        System.out.print(" ");
                    }
                    for(int j=1; j<=i; j++){
                        System.out.print("*");
                    }
                     for(int j=2; j<=i; j++){
                        System.out.print("*");
                    }
                    for(int j=a-i; j>=0; j--){
                        System.out.print(" ");
                    }
                    System.out.println();
                }
    }
}