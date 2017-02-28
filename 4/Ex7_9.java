/**
  * file: Ex7_9
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 7.9
  * due date: February, 27 , 2017
  *
  *This file contians the declaration of the 
  * Ex7_9 abstract data type.
  */
/**
  *exercise 7_9
  * This class asks the user to enter 10 numbers;
  * the method will find then display the minumum value. 
  */
import java.util.Scanner;
public class Ex7_9 {
  static final int SIZE = 10;
  public static void main(String[] args) {
  double[] n = new double[SIZE];
  Scanner input = new Scanner(System.in);

  System.out.print("Enter " + SIZE + " numbers: ");
  for (int i = 0; i < n.length; i++) n[i] = input.nextDouble();

  System.out.println("The minimum number is: " + min(n));
        }

  public static double min(double[] array) {
  double min = array[0];
  for (int i = 0; i < array.length; i++) {
  if (min > array[i]) min = array[i];
          }
  return min;
      }
  }