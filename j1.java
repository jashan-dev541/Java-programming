import java.util.Scanner;

// class Student{
//     String name;
//     int age;
//     Student(String name, int age){
//         this.name = name;
//         this.age = age;
//     }
//     Student(Student s){
//         this.name = s.name;
//         this.age = s.age;
//     }
//     void printData(){
//         System.out.println("Name & age of the student is: " + name + " & " + age);
//     }
// }


class Student{
    // private String name;
    // private int rollNumber;
    // int rollNumber;             //no specifier = default access

    // private void showSecretCode(){
    //     System.out.println("Secret internal method");
    // }
}
public class j1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter name and age: ");
        // String name = sc.next();
        // int age = sc.nextInt();
        // Student s1 = new Student(name,age);
        // s1.printData();
        // Student s2 = new Student(s1);
        // s2.printData();

        // Student s1 = new Student();
        //s1.name = "Ravi"          //Error: name id private, can't access
        //s1.showSecretCode();      //Error: method is private too
        sc.close();
    }
}