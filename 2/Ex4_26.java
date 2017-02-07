/** 
  * file: Ex4_26
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex4_26 abstract data type.
  */
/**
  *exercise 4_26
  *This class converts a float into an int
  */
import java.util.Scanner;
  public class Ex4_26 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter an amount, for example 11.56: ");
    String amount = input.nextLine();

    String numberOfOneDollars = amount.substring(0, amount.indexOf('.'));

    int cents = Integer.parseInt(amount.substring(amount.indexOf('.') + 1));

    int numberOfQuarters = cents / 25;
    cents %= 25;

    int numberOfDimes = cents / 10;
    cents %= 10;

    int numberOfNickels = cents / 5;
    cents %= 5;

    System.out.println("Your amount " + amount + " consists of\n " 
    + numberOfOneDollars + " dollars\n " 
    + numberOfQuarters + " quarters\n "
    + numberOfDimes + " dimes\n "
    + numberOfNickels + " nickels\n "
    + cents + " pennies\n "
        );
      }
    }