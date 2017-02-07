/** 
  * file: Ex4_5
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 4_5
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
  import java.util.Scanner;
    public class Ex4_5{
      public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int n;
      double side, area;
  
      System.out.print("Enter the number of sides:");
      n = s.nextInt();
  
      System.out.print("Enter the side:");
      side = s.nextDouble();
  
      area = (n * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / n));
  
      System.out.print("The area of the polygon is " + area);
         }
      }