import java.util.Scanner;
// Class to represent a Room
class Room {
    // Data members for height, width, and breadth of the room
    private double height;
    private double width;
    private double breadth;

    // Constructor to initialize the dimensions of the room
    public Room(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate and return the volume of the room
    public double volume() {
        return height * width * breadth;  // Volume = height * width * breadth
    }
}

// Class to demonstrate the Room class and take user input
public class RoomDemo {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Taking input for room dimensions
        System.out.print("Enter the height of the room: ");
        double height = scanner.nextDouble();
        
        System.out.print("Enter the width of the room: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter the breadth of the room: ");
        double breadth = scanner.nextDouble();

        // Create a Room object with the user-provided dimensions
        Room room = new Room(height, width, breadth);

        // Display the volume of the room
        System.out.println("The volume of the room is: " + room.volume() + " cubic units.");
        
        // Close the scanner object to prevent resource leak
        scanner.close();
    }
}

/*
F:\OOPJ\Assignment4>javac RoomDemo.java

F:\OOPJ\Assignment4>java RoomDemo
Enter the height of the room: 45
Enter the width of the room: 56
Enter the breadth of the room: 21
The volume of the room is: 52920.0 cubic units.

F:\OOPJ\Assignment4>
*/
