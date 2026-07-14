import java.util.*;

public class area{
    public static void main(String[] args){
        // int len = 5;
        // int brt = 6;
        // int area = len * brt;
        // System.out.println("Area: "+ area);

        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        sc.close();
        System.out.println("Area of circle: " + 3.14*radius*radius);
    }
}