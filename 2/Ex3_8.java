/** 
  * file: Ex3_8
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 3_8
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;  

public class Ex3_8 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter three integers:");
    int number1 = input.nextInt();
    int number2 = input.nextInt();
    int number3 = input.nextInt();
    if((number1 <= number2) && (number1 <= number3)) {
    if(number2 <= number3) {
    System.out.print(number1 + ", " + number2 + ", " + number3);
    } else {
    System.out.print(number1 + ", " + number3 + ", " + number2);
    }
    } else if((number2 <= number1) && (number2 <= number3)) {
    if(number1 <= number3) {
    System.out.print(number2 + ", " + number1 + ", " + number3);
    } else {
    System.out.print(number2 + ", " + number3 + ", " + number1);
    }
    } else {
    if(number1 <= number2) {
    System.out.print(number3 + ", " + number1 + ", " + number2);
    } else {
    System.out.print(number3 + ", " + number2 + ", " + number1);
        }
    
}

    }
}