
import java.util.Scanner;

class ElectricityBill {
    // Instance variables
    String customerName;
    double unitsConsumed;
    double billAmount;

    // Parameterized constructor to initialize customerName and unitsConsumed
    public ElectricityBill(String customerName, double unitsConsumed) {
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0;
    }

    // Method to calculate the bill amount based on units consumed
    void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5; // Rs. 5 per unit for first 100 units
        } else if (unitsConsumed <= 300) {
            billAmount = 100 * 5 + (unitsConsumed - 100) * 7; // Rs. 5 for first 100 units, Rs. 7 for next 200 units
        } else {
            billAmount = 100 * 5 + 200 * 7 + (unitsConsumed - 300) * 10; // Rs. 5 for first 100 units, Rs. 7 for next 200 units, Rs. 10 for remaining units
        }
    }

    // Method to display the bill details
    void displayBillDetails() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Bill Amount: Rs. " + billAmount);
    }
}

public class ElectricityBillCalculation {
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);

        // Taking input for customer name and units consumed
        System.out.print("Enter Customer Name: ");
        String customerName = scanner.nextLine();
        
        System.out.print("Enter Units Consumed: ");
        double unitsConsumed = scanner.nextDouble();

        // Creating an object of ElectricityBill class
        ElectricityBill bill = new ElectricityBill(customerName, unitsConsumed);

        // Calculate the bill amount
        bill.calculateBillAmount();

        // Display the bill details
        bill.displayBillDetails();

        // Close the scanner
        scanner.close();
    }
}
/*F:\OOPJ\Assignment4>java ElectricityBillCalculation
Enter Customer Name: Alice
Enter Units Consumed: 400
Customer Name: Alice
Units Consumed: 400.0
Bill Amount: Rs. 2900.0
*/