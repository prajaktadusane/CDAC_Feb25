/* Write a program to check whether a given number is  even or odd  using only  bitwise 
operators  . 
Use  n & 1  to check*/

import java.util.Scanner;

public class EvenOddBitwise{
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number...");
		
		int n=sc.nextInt();
		
		if((n & 1)== 0)
		{
			System.out.println( n + "Number is even");
			
		}
		else
		{
			System.out.println(n + "Number is odd");
			
		}
		sc.close();
	}
}