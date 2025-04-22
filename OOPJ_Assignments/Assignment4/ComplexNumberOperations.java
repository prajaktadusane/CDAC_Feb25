import java.util.Scanner;

class ComplexNumber {
    // Member variables for real and imaginary parts
    private double real;
    private double imaginary;

    // Default constructor that initializes both real and imaginary to 0
    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    // Constructor that initializes the real part, and imaginary part is set to 0
    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    // Constructor that initializes both real and imaginary parts
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double realPart = this.real + other.real;
        double imaginaryPart = this.imaginary + other.imaginary;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to multiply two complex numbers
    public ComplexNumber multiply(ComplexNumber other) {
        double realPart = this.real * other.real - this.imaginary * other.imaginary;
        double imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
        return new ComplexNumber(realPart, imaginaryPart);
    }

    // Method to display the complex number in the form "a + bi"
    public void display() {
        if (imaginary >= 0) {
            System.out.println(real + " + " + imaginary + "i");
        } else {
            System.out.println(real + " - " + (-imaginary) + "i");
        }
    }

    // Getter and Setter methods for real and imaginary parts
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
}

public class ComplexNumberOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the first complex number
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        System.out.print("Real part: ");
        double real1 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary1 = scanner.nextDouble();

        // Creating the first complex number using the constructor with two parameters
        ComplexNumber complex1 = new ComplexNumber(real1, imaginary1);

        // Taking input for the second complex number
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        System.out.print("Real part: ");
        double real2 = scanner.nextDouble();
        System.out.print("Imaginary part: ");
        double imaginary2 = scanner.nextDouble();

        // Creating the second complex number using the constructor with two parameters
        ComplexNumber complex2 = new ComplexNumber(real2, imaginary2);

        // Display the two complex numbers
        System.out.print("\nComplex Number 1: ");
        complex1.display();
        System.out.print("Complex Number 2: ");
        complex2.display();

        // Add the two complex numbers
        ComplexNumber sum = complex1.add(complex2);
        System.out.print("\nSum of Complex Numbers: ");
        sum.display();

        // Multiply the two complex numbers
        ComplexNumber product = complex1.multiply(complex2);
        System.out.print("\nProduct of Complex Numbers: ");
        product.display();

        scanner.close();
    }
}

/*
F:\OOPJ\Assignment4>javac ComplexNumberOperations.java

F:\OOPJ\Assignment4>java ComplexNumberOperations
Enter the real and imaginary parts of the first complex number:
Real part: 3
Imaginary part: 2
Enter the real and imaginary parts of the second complex number:
Real part: 4
Imaginary part: -2

Complex Number 1: 3.0 + 2.0i
Complex Number 2: 4.0 - 2.0i

Sum of Complex Numbers: 7.0 + 0.0i

Product of Complex Numbers: 16.0 + 2.0i

F:\OOPJ\Assignment4>
*/