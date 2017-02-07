/** 
  * file: Ex4_25
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex4_25 abstract data type.
  */
/**
  *exercise 4_25
  *This class generates a license plate.
  */
import java.util.Scanner;
  public class Ex4_25{
    public static void main(String[] args) {

    StringBuilder s = new StringBuilder();
    for (int i = 0; i < 3; i++) {
    char ch = (char)(Math.random() * 26 + 'A');
    s.append(ch);
    }

    for (int i = 0; i < 4; i++) {
    char digit1 = (char)(Math.random() * 10 + '0');
    s.append(digit1);
    }

    System.out.println("Random vehicle plate number: " + s);
      }
 
    }
