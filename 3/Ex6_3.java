/** 
  * file: Ex6_3
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex6_3 abstract data type.
  */
/**
  *exercise 6_3
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
  public class Ex6_3 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a integer: ");
    int num = input.nextInt();

    if (isPalindrome(num)) {
    System.out.println(num + " is a palindrome.");
    } else {
    System.out.println(num + " is NOT a palindrome.");
      }
    }
    // 
    public static int reverse(int number) {
    int reverse = 0;
    while (number != 0) {
    reverse *= 10; 
    reverse += number % 10;
    number /= 10;
    }
    return reverse;
    }
    //
    public static boolean isPalindrome(int number) {
    return (number == reverse(number));
        }
    }