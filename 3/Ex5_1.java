/** 
  * file: Ex5_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex5_12 abstract data type.
  */
/**
  *exercise 5_1
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.util.Scanner;
  public class Ex5_1 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
   
    System.out.print("Enter an integer, the input ends if it is 0: ");
     int value = input.nextInt();
     double total = 0;
     int positive = 0;
     int negative = 0;
     double avg = 0;
     int count = 0;
    
     if (value == 0) {
         System.out.print("No numbers are entered except  0 ");
         System.exit(1);
     }
      do {
        total += value;
        
        if (value > 0)
            positive += 1;
        else
             negative += 1;
        
        count += 1;
        
        value = input.nextInt();
      } while (value !=0);
        
        avg = total / (double) count;
        
        System.out.printf("The number of positives is %d%n The number of negatives is %d%n" + "The total is %.2f%n The average is %.2f%n", positive, negative, total, avg);
          }
     }
     