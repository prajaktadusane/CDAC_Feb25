/*Write a java program that  takes three boolean inputs  and prints  true  if at 
least two of  them are  true. Hint  : Use logical operators (  &&  ,  || */


import java.util.Scanner;

public class AtLeastTwoTrue {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter first boolean value (true/false): ");
        boolean input1 = scanner.nextBoolean();
        
        System.out.print("Enter second boolean value (true/false): ");
        boolean input2 = scanner.nextBoolean();
        
        System.out.print("Enter third boolean value (true/false): ");
        boolean input3 = scanner.nextBoolean();
		
		if ((input1 && input2) || (input1 && input3) || (input2 && input3)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}
