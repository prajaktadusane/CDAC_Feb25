import java.util.Scanner;

// Class definition for BMICalculator
class BMICalculator {
    // Fields for height and weight
    private double height;
    private double weight;

    // Parameterized constructor to initialize height and weight
    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    // Getter and setter methods for height and weight
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Method to calculate BMI
    public double calculateBMI() {
        return weight / (height * height);
    }
}

// Main class with the main method
public class BMICalculatorDemo {
    public static void main(String[] args) {
        // Create a scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter height and weight
        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        // Create an object of the BMICalculator class and use setter methods
        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        // Calculate the BMI using the calculateBMI method
        double bmi = bmiCalculator.calculateBMI();

        // Display the calculated BMI
        System.out.println("Your BMI is: " + bmi);

        // Close the scanner
        scanner.close();
    }
}
/*
F:\OOPJ\Assignment4>javac BMICalculatorDemo.java

F:\OOPJ\Assignment4>java BMICalculatorDemo
Enter your height in meters: 12
Enter your weight in kilograms: 60
Your BMI is: 0.4166666666666667

F:\OOPJ\Assignment4>javac BMICalculatorDemo.java

F:\OOPJ\Assignment4>java BMICalculatorDemo
Enter your height in meters: 154
Enter your weight in kilograms: 57
Your BMI is: 0.002403440715129027

F:\OOPJ\Assignment4>*/


