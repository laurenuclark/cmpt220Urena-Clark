/** 
  * file: Ex4_15
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 4_15
  *This class associates a number to a letter of the alphabet - like the older keypads of cell phones.
  
  */
import java.util.Scanner;
  public class Ex4_15{
    private static final int INVALID_KEY = -1;
      public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a letter: ");
      char ch = input.next().charAt(0);

      int numberPressed = correspondingNumber(ch);

      if (numberPressed != INVALID_KEY) {
      System.out.println("The corresponding number is " + numberPressed);
        } 
      else {
      System.out.println(ch + " is an invalid input");
        }
      }

      public static int correspondingNumber(char ch) {

      ch = Character.toUpperCase(ch);

      if (ch >= 'A' && ch <= 'O') {
      int number = 2; // where 'A' start
      int n = ch - 'A';
      number += (n / 3);
      return number;
      }

      if (ch >= 'P' && ch <= 'S') return 7;
      if (ch >= 'T' && ch <= 'V') return 8;
      if (ch >= 'W' && ch <= 'Z') return 9;
        return INVALID_KEY;
        }
      }