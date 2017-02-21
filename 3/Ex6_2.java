/** 
  * file: Ex6_2
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex6_2 abstract data type.
  */
/**
  *exercise 6_2
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
 import java.util.Scanner;
  public class Ex6_2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    long num = input.nextLong();
    System.out.println("The sum of the DIGITS is " + sumDigits(num));
    }
    public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
    sum += n % 10;
    n /= 10;
    }
    return sum;
        }
    }