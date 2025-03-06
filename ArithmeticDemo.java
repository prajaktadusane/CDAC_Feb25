/*Write a program to perform addition, subtraction, multiplication, division, and modulus operations on two integer numbers and display the results.*/

public class ArithmeticDemo{
	public static void main(String[] args){
		int a = 30;
		int b = 2 ;
		
		int add = a+b;
		System.out.println("Addition of two numbers is : " +add);
		
		int sub = a - b;
		System.out.println("Substraction of two numbers is : " +sub);
		
		int mul = a*b;
		System.out.println("Multiplication of two numbers is : " +mul);
		
		int div = a/b;
		System.out.println("Division of two numbers is : " +div);
		
		int mod = a % b;
		System.out.println("Modulus of two numbers is :" +mod);
		
	}
}