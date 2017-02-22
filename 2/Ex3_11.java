/**
  * file: Ex3_11
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex3_11 abstract data type.
  */
/**
  *exercise 3_11
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
public class Ex3_11 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);

  // Prompt user to enter the month an year
System.out.print("Enter the month as integer: ");
int month = input.nextInt();
System.out.print("Enter the year as integer: ");
int year = input.nextInt();

boolean leapYear = 
(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
  // Display the number of days in the month
switch (month)
{
case 1: System.out.println(
"January " + year + " had 31 days"); break;
case 2: System.out.println("February " + year + " had" +
((leapYear) ? " 29 days" : " 28 days")); break;
case 3: System.out.println(
"March " + year + " had 31 days"); break;
case 4: System.out.println(
"April " + year + " had 30 days"); break;
case 5: System.out.println(
 "May " + year + " had 31 days"); break;
case 6: System.out.println(
"June " + year + " had 30 days"); break;
case 7: System.out.println(
"July " + year + " had 31 days"); break;
case 8: System.out.println(
"August " + year + " had 31 days"); break;
case 9: System.out.println(
"September " + year + " had 30 days"); break;
case 10: System.out.println(
"October " + year + " had 31 days"); break;
case 11: System.out.println(
"November " + year + " had 30 days"); break;
case 12: System.out.println(
"December " + year + " had 31 days");
      }
     }
   }
