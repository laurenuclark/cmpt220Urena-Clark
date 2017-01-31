/**

  * file: Ex2_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 2.1
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex2_1 abstract data type.
  */
/**
  *exercise 2_1
  *This class converts a Celsius value to Farenheit.
  */
import java.util.Scanner;
public class Ex2_1{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  
  System.out.print("Enter a degree in Celsius: ");
  double celsius = input.nextDouble();
      
  double fahrenheit = 9.0 / 5 * celsius + 32;
      
  System.out.println(celsius + " Celsius is " + fahrenheit
  + "Farenheit");
  }
}