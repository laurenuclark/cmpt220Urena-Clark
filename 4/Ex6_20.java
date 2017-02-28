/**
  * file: Ex6_20
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 6.20
  * due date:  February, 27 , 2017
  *
  *This file contians the declaration of the 
  * Ex6_20 abstract data type.
  */
/**
  *exercise 6_20
  * This class asks the user to enter a string
  * then it will dispay the number of the letters 
  * in the string. 
  */

import java.util.Scanner;
public class Ex6_20 {
  public static void main(String[] args) {

  Scanner input = new Scanner(System.in);
  System.out.print("Enter a string: ");
  String s = input.nextLine();

  System.out.println("The number of letters inside the string is: " + countLetters(s));
      }
  public static int countLetters(String s) {
  int letterCount = 0;
  for (int i = 0; i < s.length(); i++) {
  if (isLetter(s.charAt(i))) letterCount++;
      }
  return letterCount;
      }
  
  public static boolean isLetter(char ch) {
  ch = Character.toUpperCase(ch);
  return (ch >= 'A' && ch <= 'Z');
        }
    }