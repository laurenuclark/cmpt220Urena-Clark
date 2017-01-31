/**

  * file: PercentageProb2
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 2.6
  * due date: January, 31, 2017
  *
  * This file contians the declaration of the 
  * PercentageProb2 abstract data type. 
  */
/**
 *excersice 2_6
 * This class will calculate a students grade in the class according to rubric guidelines.
 */
 import java.util.Scanner;
 public class PercentageProb2{
  public static void main(String[]args){
   Scanner input = new Scanner(System.in);
   System.out.print("Please enter the following as percentage   ");
   System.out.print("midterm exam: ");
   double midtermexam = input.nextDouble();
   System.out.print("final exam: ");
   double finalexam = input.nextDouble();
   System.out.print("projects:  ");
   double projects = input.nextDouble();
   System.out.print("homework and labs: ");
   double homework = input.nextDouble();
   System.out.println("Your final grade is:  ");
  }
 }