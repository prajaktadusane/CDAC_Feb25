/* Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? :  ) */

import java.util.Scanner;

public class LargestTernaryDemo{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number");
		int a=sc.nextInt();
		
		System.out.println("Enter second number:");
		int b= sc.nextInt();
		
		System.out.println("Enter third number:");
		int c = sc.nextInt();

       int largest = (a>=b && a>=c)? a :((b>=a && b>=c)? b:c);
	   
	   System.out.println("The largest number is: " +largest);
        	   
		
	}
} 