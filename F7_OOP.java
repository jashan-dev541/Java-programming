// import java.util.*;
// class Book{
//     String name;
//     int price;
// }
// class Car{
//     String name;
//     int gears;
//     String color;
//     int price;

//     void setData(String n,String c,int g , int p) {
//         name = n;
//         gears = g;
//         color = c;
//         price = p;    
//     }
//     void printData() {
//         System.out.println("Name: "+name+"\nColor: "+color+"\nGears: "+ gears+"\nPrice: "+price);
//     }
// }
// public class F7_OOP {
//     // // represent a book using class with properties like name and price. set and print the name and price
//     // // of the book on the display
//     // public static void main(String[] args) {
//     //     Book b1 = new Book();
//     //     b1.name = "Mathematics";
//     //     b1.price = 150;
//     //     System.out.println("Name and Price of book is: "+ b1.name + " and " + b1.price);
//     // }


//     // represent a class car with properties name, number of years, color, Price. define a method in the class 
//     // to set values in all the properties by taking input from the user. similarly define another method 
//     // to print the above properties.
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String name,color;
//         int gears,price;
//         System.out.print("Enter Name: ");
//         name = sc.next();
//         System.out.print("Enter Color: ");
//         color = sc.next();
//         System.out.print("Enter Gears: ");
//         gears = sc.nextInt();
//         System.out.print("Enter Price: ");
//         price = sc.nextInt();
//         Car c1 = new Car();
//         c1.setData(name, color, gears, price);
//         c1.printData();
//         sc.close();
//     }
// }