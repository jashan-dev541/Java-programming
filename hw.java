// hw.java
// Solutions to the given Java exercises

class Book {
    String title;
    String author;
    double price;

    // Parameterized constructor
    Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
    }
}

class Circle {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }

    double circumference() {
        return 2 * Math.PI * radius;
    }
}

class BankAccount {
    int accountNumber;
    double balance;

    // No-argument constructor calling parameterized constructor
    BankAccount() {
        this(0, 0.0); // calls parameterized constructor
    }

    // Parameterized constructor
    BankAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void showBalance() {
        System.out.println("Account " + accountNumber + " Balance: " + balance);
    }
}

class Demo {
    int x = 10;

    Demo() {
        int x = 20; // local variable shadows instance variable
        System.out.println("Local x: " + x);
        System.out.println("Instance x: " + this.x);
    }
}

public class hw {
    public static void main(String[] args) {
        // Q1: Book objects
        Book b1 = new Book("Java Basics", "James Gosling", 499.99);
        Book b2 = new Book("Effective Java", "Joshua Bloch", 799.50);
        b1.displayDetails();
        b2.displayDetails();

        // Q2: Circle
        Circle c = new Circle(5);
        System.out.println("Circle area: " + c.area());
        System.out.println("Circle circumference: " + c.circumference());

        // Q3: Constructor without 'this'
        class WrongBook {
            String title;
            WrongBook(String title) {
                // title = title; // assigns parameter to itself, instance variable stays null
            }
            void show() {
                System.out.println("Title: " + title);
            }
        }
        WrongBook wb = new WrongBook("Oops");
        wb.show(); // Output will be null

        // Q4 & Q5: BankAccount
        BankAccount acc1 = new BankAccount();
        acc1.deposit(1000);
        acc1.showBalance();

        BankAccount acc2 = new BankAccount(12345, 5000);
        acc2.deposit(2000);
        acc2.showBalance();

    }
}
