/** 
  * file: FinalP_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: Final Project
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Final Project abstract data type.
  */
/**
  *Final Project
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
  
  import java.util.Scanner;
  public class FinalP_1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" Enter GPA:  ");
    double GPA = input.nextDouble();
    
    if (GPA >= 3.85){
      System.out.print (" You recieved 12 priority points ");
    }
    else if (GPA >= 3.60){
      System.out.print (" You recieved 11 priority points ");
    }
    else if (GPA >= 3.25){
      System.out.print (" You recieved 10 priority points ");
    } 
    else if (GPA >= 3.00){
      System.out.print (" You recieved 9 priority points ");
    }
    else if (GPA >= 2.75){
      System.out.print(" You recieved 7 priority points ");
    }
    else if (GPA >= 2.50){
      System.out.print (" You recieved 6 priority points ");
    }
    else if (GPA >= 2.25){
      System.out.print(" You recieved 5 priority points ");
    }
    else if (GPA >= 2.00){
      System.out.print(" You recieved 4 priority points ");
    }
    else if (GPA >= 0.50){
      System.out.print(" You recieved 1 priority points ");
    }
    else if (GPA >= 0.00){
      System.out.print (" You recieved 0 priority points ");
    }
    }
  }