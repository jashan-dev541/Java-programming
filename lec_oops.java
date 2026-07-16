class Car {
    // Member variables (properties)
    String name;
    int gears;
    String color;
    int price;

    // Constructor to initialize all member variables
    Car(String n, int g, String c, int p) {
        name = n;
        gears = g;
        color = c;
        price = p;
    }

    // Method to print all member variables
    void printData() {
        System.out.println("Name: " + name);
        System.out.println("Gears: " + gears);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
    }
}

public class lec_oops {
    public static void main(String args[]) {
        // Creating Car object using constructor
        Car c1 = new Car("Honda City", 5, "Red", 1200000);

        // Printing details of the car
        c1.printData();
    }
}
