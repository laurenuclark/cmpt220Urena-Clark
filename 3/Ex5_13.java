/** 
  * file: Ex5_13
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex5_13 abstract data type.
  */
/**
  *exercise 5_13
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
public class Ex5_13 {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n, 3) < 12000) {
    n++;
    }
    n--;
    System.out.println(n + " is the largest integer n, such that n^3 is less than 12,000");
    System.out.println("Proof: " + (n - 1) + "^3 = " + Math.pow(n - 1, 3));
    System.out.println("Proof: " + n + "^3 = " + Math.pow(n, 3));
    System.out.println("Proof: " + (n + 1) + "^3 = " + Math.pow(n + 1, 3));
        }
    }