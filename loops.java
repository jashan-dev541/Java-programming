import java.util.Scanner;
public class loops {
    public static void main(String[] args){
        //first: print no.s 0 to 199
        // for(int i=0; i<200; i++){
        //     System.out.print(i + " ");
        // }

        // int i=0;
        // while(i<11){
        //     System.out.print(i + " ");
        //     i += 1;
        // }

        //pattern printing
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); 
        // int b = sc.nextInt();

        //pattern 1 : square
        // for(int i=0; i<a; i++){
        //     for(int j=0; j<a; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }
        
        //pattern 2 : right angled triangle left aligned
    //     for(int i=0; i<a; i++){
    //         for(int j=0; j<i+1; j++){
    //             System.out.print("* ");
    //         }
    //         System.out.print("\n");
    // }

        //pattern 3 : inverted right angled triangle
        // for(int i=0; i<a; i++){
        //     for(int j=0; j<a-i; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.print("\n");
        // }

        //pattern 4 : hollow rectangle
        //   for(int i=0; i<=a; i++){
        //     for(int j=0; j<=b; j++){
        //         if(i==0 || i==a || j==0 || j==b) System.out.print("* ");
        //         else System.out.print("  ");
        //     }
        //     System.out.print("\n");
        // }

           //pattern 5 : right angled triangle right alignment
        // for(int i=1; i<=a; i++){

        //     for(int j=1; j<=a-i; j++){
        //         System.out.print(" ");
        //     }

        //     for(int j=1; j<=i; j++){
        //         System.out.print("*");
        //     }
        //     System.out.print("\n");
        // }

        //pattern 6: counting triangle
        // for(int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(" "+j);
        //     }
        //     System.out.print("\n");
        // }

       //pattern 7: triangle invert
        // for(int i=1; i<=a; i++){
        //     for(int j=1; j<=a-i+1; j++){
        //         System.out.print(j + " ");
        //     }
        //     System.out.print("\n");
        // }

        //pattern 8: Floyd's Triangle
        // int num = 1;
        //  for(int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(num+" ");
        //         num++;
        //     }
        //     System.out.print("\n");
        // }

        //pattern 9: 1010
        //  for(int i=1; i<=a; i++){
        //     for(int j=1; j<=i; j++){
        //         if(j%2==0) System.out.print(0);
        //         else System.out.print(1);
        //     }
        //     System.out.println();
        //  }

        //pattern 10: 10 alternate
         for(int i=1; i<=a; i++){
            for(int j=1; j<=i; j++){
                int sum = i+j;
                if(sum%2==0) System.out.print(1);
                else System.out.print(0);
            }
            System.out.println();
         }
    }
}