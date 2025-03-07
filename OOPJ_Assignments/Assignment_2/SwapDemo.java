/*Q1:  Write a program to swap two numbers  without using a third variable  and without 
using arithmetic operators like  +  or  -  . 
Hint  : Use bitwise XOR  ^  operator.*/

public class SwapDemo{
	public static void main(String args[]){
		int a=10;
		int b=44;
		
		System.out.println("Before Swapping :" + a + " " +b);
		
		a=a^b;
		b=a^b;
		a=a^b;
		
		System.out.println("After Swapping : " + a + " " +b);
		
	}
}