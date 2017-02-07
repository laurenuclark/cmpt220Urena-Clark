/** 
  * file: Ex4_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 4_1
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
public class Ex4_1{ 
public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
    System.out.print("Enter the side: ");
    double lengthOfSide = input.nextDouble();
    input.close();
    double area = calculateArea(lengthOfSide);
    System.out.printf("The area of the pentagon is %.2f", area);
    }
    private static double calculateArea(double s) {
    double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
    return area;
     }
    }