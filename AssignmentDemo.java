/*Write a program to demonstrate the use of assignment operators (=, +=, -=, *=, /=, %=) on two integers.*/

public class AssignmentDemo{
	public static void main(String[] args){
		int a = 44;
		int b = 25;
		
		a=b;
		System.out.println(" value of a = b   is " +a);
		
		a += b;
		System.out.println("  value of a += b is " +a);
		
		a -= b;
		System.out.println("  value of a -= b is " +a);
		
		a *= b;
		System.out.println(" value of a *= b is " +a);
		
		a /= b;
		System.out.println(" value of a /= b is " +a);
		
		a %= b;
		System.out.println("Value of a %= b "  +a);
		
		
	}
	
}