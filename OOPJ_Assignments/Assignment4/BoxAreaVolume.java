import java.util.Scanner;

class Box {
    // Member variables
    double height;
    double width;
    double breadth;

    // Constructor to initialize height, width, and breadth
    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    // Method to calculate and return the volume of the box
    public double getVolume() {
        return height * width * breadth;
    }

    // Method to calculate and return the surface area of the box
    public double getArea() {
        return 2 * (height * width + width * breadth + height * breadth);
    }
}

public class BoxAreaVolume {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input for the first box
        System.out.println("Enter dimensions for Box 1:");
        System.out.print("Height: ");
        double height1 = scanner.nextDouble();
        System.out.print("Width: ");
        double width1 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth1 = scanner.nextDouble();
        
        // Create the first Box instance
        Box box1 = new Box(height1, width1, breadth1);

        // Input for the second box
        System.out.println("\nEnter dimensions for Box 2:");
        System.out.print("Height: ");
        double height2 = scanner.nextDouble();
        System.out.print("Width: ");
        double width2 = scanner.nextDouble();
        System.out.print("Breadth: ");
        double breadth2 = scanner.nextDouble();

        // Create the second Box instance
        Box box2 = new Box(height2, width2, breadth2);

        // Display volumes and areas for both boxes
        System.out.println("\nBox 1:");
        System.out.println("Volume: " + box1.getVolume());
        System.out.println("Surface Area: " + box1.getArea());

        System.out.println("\nBox 2:");
        System.out.println("Volume: " + box2.getVolume());
        System.out.println("Surface Area: " + box2.getArea());

        scanner.close();
    }
}
/*
F:\OOPJ\Assignment4>javac BoxAreaVolume.java

F:\OOPJ\Assignment4>java BoxAreaVolume
Enter dimensions for Box 1:
Height: 21
Width: 12
Breadth: 10

Enter dimensions for Box 2:
Height: 45
Width: 23
Breadth: 10

Box 1:
Volume: 2520.0
Surface Area: 1164.0

Box 2:
Volume: 10350.0
Surface Area: 3430.0

F:\OOPJ\Assignment4>
*/
