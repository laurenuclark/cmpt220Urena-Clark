/**

  * file: Ex2_5
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 2.5
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex2_5 abstract data type. 
  */
/**
  *exercise 2_5
  *This class claculates the tip.
  */
import java.util.Scanner;
public class Ex2_5{
  public static void main(String[] args){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the subtotal and gratuity rate: ");
  double subtotal = input.nextDouble();
  double gratuity = input.nextDouble();
  double tip = subtotal * (gratuity / 100);
  double total = subtotal + gratuity;
  System.out.println("The gratuity is $" + tip
  + "and total is $" + total);
  }
}