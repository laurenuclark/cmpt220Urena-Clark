/**

  * file: Ex2_6
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 2.6
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex2_6 abstract data type. 
  */
/**
 *excersice 2_6
 * This class declares the sum of the digits as an integer.
 */
import java.util.Scanner;
public class Ex2_6{
  public static void main(String[] args){
   Scanner input = new Scanner(System.in);
   System.out.print("Enter a number bewteen 0 and 1000");
   int number = input.nextInt();
   int lessThan10 = number % 10;
   number /= 10;
   int tens = number % 10;
   number /= 10;
   int hundreds = number % 10;
   number /= 10;
   int sum = hundreds + tens+ lessThan10;
   System.out.println("The sum of the digits is " + sum);
  }
}