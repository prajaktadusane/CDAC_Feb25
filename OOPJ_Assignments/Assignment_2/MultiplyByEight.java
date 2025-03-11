  /*Write a Java program to  multiply a number by 8  without using  *  or  /  operators. 
Hint  : Use bitwise left shift (  <<  )*/

import java.util.Scanner;

public class MultiplyByEight {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        int result = number << 3;  

       
        System.out.println("The result of multiplying " + number + " by 8 is: " + result);
		
		}
	}