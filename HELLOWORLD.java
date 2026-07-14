// File: HelloWorld.java
import java.util.*;
public class HELLOWORLD {
    public static void main(String[] args) {
        System.out.println("Welcome to the world Sardar ji");
        Scanner sc = new Scanner(System.in); 
        int age = sc.nextInt();
        sc.close();
        if(age>=50){
            System.out.println("Your body might start feeling old");
        }
        else System.out.println("You are still young to go!");
    }
}
