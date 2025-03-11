 /*Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
(  &  )  and  for  loop */


public class EvenNumberBitwise {
    public static void main(String[] args) {
        
        for (int num = 1; num <= 100; num++) {
          
            if ((num & 1) == 0) {
                System.out.println(num);
            }
        }
    }
}