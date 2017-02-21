/** 
  * file: Ex5_12
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 5.12
  * due date: Febuary,21, 2017
  *
  *This file contians the declaration of the 
  * Ex5_12 abstract data type.
  */
/**
  *exercise 5_12
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
public class Ex5_12 {
  public static void main(String[] args) {
    int n = 0;
    while (Math.pow(n, 2) < 12000) {
    n++;
    }
    System.out.println(n + " is the lowest number, such that n^2 is greater than 12,000");
    System.out.println("Proof: " + (n - 1) + "^2 = " + Math.pow(n - 1, 2));
    System.out.println("Proof: " + n + "^2 = " + Math.pow(n, 2));

        }
    }