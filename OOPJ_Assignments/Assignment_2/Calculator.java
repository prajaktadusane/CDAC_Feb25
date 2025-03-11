 /* Implement a  calculator  that takes two numbers and an operator (  +  ,  -  ,  *  ,  /  ) as input 
and prints the result using only  switch-case */

import java.util.Scanner;

public class Calculator{
   public static void main(String args[]){
   
   Scanner sc=new Scanner(System.in);
   
   System.out.println("Enter first number:");
   double num1=sc.nextDouble();
   
   System.out.println("Enter second number:");
   double num2 = sc.nextDouble();
   
   System.out.println("Enter Operator (+,-,*,/): ");
   char operator = sc.next().charAt(0);
   
   double result;
   
   switch(operator){
	   case '+':
	        result = num1+num2;
			System.out.println("Result: "+result);
			break;
	  
	  case '-':
	        result =num1 - num2;
			System.out.println("Result: " +result);
			break;
	  
	  case '*':
	        result = num1 - num2;
			System.out.println("Result: " +result);
			break;
	  
	  case '/':
	        if(num2 == 0){
				System.out.println("Error: Division by zero is not allowed.. ");
			}
			else{
				result = num1/num2;
				System.out.println("Result: "+result);
			}
			break;
			
	  default:
	        System.out.println("Error: Invalid Operator");
			break;
   }
   
   }

} 