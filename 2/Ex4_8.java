/** 
  * file: Ex4_8
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 4_8
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
  public class Ex4_8{
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int ch;
  
    System.out.print("Enter an ASCII code:");
    ch = s.nextInt();
  
    if(ch < 0 || ch > 127) {
    System.out.print("Invalid data. Number must be between 0 and 127.");
    } 
    else {
    System.out.print("The character for ASCII code " + ch + " is " + (char)ch);
        }
      }
    }