import java.util.*;
public class java{
    public static void main(String[] args){
        System.out.println("Choose numbers 1,2 and 3 for actual laws written\nand choose any other number for dark law written.");
        int op;
        Scanner sc = new Scanner(System.in); sc.close();
        op = sc.nextInt();
        switch(op){
            case 1: System.out.println("Strictly prohibited to write!");break;
            case 2:
            case 3: System.out.println("Strictly prohibited to draw or make marks on table!");break;
            default: System.out.println("We have rules but children disobey them.\nAuthority should take actions if they want students to work in discipline but it won't!\nor maybe it will...");
        }
        sc.close();
    }
}