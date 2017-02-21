/** 
  * file: Driver_lab3
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Driver_lab3 abstract data type.
  */
/**
  *Driver_lab3
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;

public class Driver_lab3 {
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    
    while(true) {
      double x1 = input.nextDouble();
        
      if (x1 == 0)
          break;
        
     double y1 = input.nextDouble();
     double x2 = input.nextDouble();
     double y2 = input.nextDouble();
     double p = input.nextDouble();
     
     System.out.printf("%.5f",Math.pow(Math.pow(Math.abs(x1 - x2),p) + Math.pow(Math.abs(y1 - y2),p),1 / p));
     System.out.println();
          }
     input.close();
         }
     }