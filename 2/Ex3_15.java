/** 
  * file: Ex3_15
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex1_3 abstract data type.
  */
/**
  *exercise 3_15
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
  public class Ex3_15 {
    public static void main(String[] strings) {
    
    int lottery = (int) (Math.random() * 1000);

    Scanner input = new Scanner(System.in);
    System.out.print("Enter your lottery pick (three digits): ");
    int guess = input.nextInt();

    int lotteryDigit1 = lottery / 100;
    int lotteryDigit2 = lottery % 100 / 10;
    int lotteryDigit3 = lottery % 10;

    int guessDigit1 = lottery / 100;
    int guessDigit2 = lottery % 100 / 10;
    int guessDigit3 = lottery % 10;

    System.out.println("The lottery number is " + lottery);

       
    if (guess == lottery) {
    System.out.println("Exact match: you win $10,000");
        } 
        else if (((guessDigit2 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit3 == lotteryDigit3)) ||
        ((guessDigit1 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
        ((guessDigit3 == lotteryDigit1) && (guessDigit1 == lotteryDigit2) && (guessDigit2 == lotteryDigit3)) ||
        ((guessDigit2 == lotteryDigit1) && (guessDigit3 == lotteryDigit2) && (guessDigit1 == lotteryDigit3)) ||
        ((guessDigit3 == lotteryDigit1) && (guessDigit2 == lotteryDigit2) && (guessDigit1 == lotteryDigit3))) 
        {
        System.out.println("Match all digits: you win $3,000");
        } else if 
        ((guessDigit1 == lotteryDigit1) || (guessDigit1 == lotteryDigit2) || (guessDigit1 == lotteryDigit3) ||
        (guessDigit2 == lotteryDigit1) || (guessDigit2 == lotteryDigit2) || (guessDigit2 == lotteryDigit3) ||
        (guessDigit3 == lotteryDigit1) || (guessDigit3 == lotteryDigit2) || (guessDigit3 == lotteryDigit3)) {
        System.out.println("Match one digit: you win $1,000");
        } else {
        System.out.println("Sorry, no match");
             }
          }

        }