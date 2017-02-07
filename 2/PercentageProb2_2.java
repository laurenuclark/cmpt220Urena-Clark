/** 
  * file: PercentageProb2_2
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *PercentageProb2_2
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
  import java.util.Scanner;
 public class PercentageProb2_2{
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
   double hw = input.nextDouble();
   double score = (midtermexam * 0.2 + finalexam * 0.2 + projects * 0.2 + hw * 0.4);
   
   if (score >= 90.0)
       System.out.print("Your final grade is an A");
   else if (score >= 80.0)
       System.out.print("Your final grade is an B");
   else if (score >= 70.0)
       System.out.print("Your final grade is an C");
    else if (score >= 60.0)
       System.out.print("Your final grade is an D");
    else 
       System.out.print("Your final grade is an F");
  }
 }