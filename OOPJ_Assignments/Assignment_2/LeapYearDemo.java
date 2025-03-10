  /*Implement a Java program that checks whether a given year is a  leap year or not  using 
logical (  &&  ,  ||  ) operators */

import java.util.Scanner;

public class LeapYearDemo{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a year");
		
	    int year = sc.nextInt();
		
		boolean isLeapYear = (year % 4 == 0 && year %100 !=0)||(year %400 ==0);
		
		if (isLeapYear){
			
			System.out.println(year+ "is a Leap year.... ");
			
		}
		else
		{
			System.out.println(year+ "is not a  Leap year....");
			
		}
	}
}