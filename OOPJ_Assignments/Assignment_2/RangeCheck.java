/*:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement  . */

import java.util.Scanner;

public class RangeCheck {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.println((number >= 20 && number <= 50) ? "Number is within the range" : "Number is out of the range");
     }
 }