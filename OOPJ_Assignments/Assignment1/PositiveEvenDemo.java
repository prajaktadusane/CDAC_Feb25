/*Write a program to check if a number is positive and even using logical operators (&&, ||, !).*/

public class PositiveEvenDemo{
	public static void main(String[] args){
		int num = 20;
		
		if((num > 0) && (num % 2 == 0))
		{
			System.out.println( num + " is Positive and Even using && operator");
		}
		if((num > 0) || (num % 2 == 0))
		{
			System.out.println("The given condition using || operator is " +((num > 0) && (num % 2 == 0)));
			
		}
		if(num % 2 != 0)
		{
			System.out.println("Number is odd");
		}
	}
}