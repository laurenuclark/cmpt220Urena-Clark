/** 
  * file: Ex5_7
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 1.3
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex5_7 abstract data type.
  */
/**
  *exercise5_7
  *This class converts a Celsius value to Farenheit.
  * This file will print the word "JAVA" by 
  * making a pattern using the 
  * corresponding letters for each letter of the word
  */
import java.text.DecimalFormat;
  public class Ex5_7 {
    private static final double TUITION = 10000; // tuition cost
    public static void main(String[] args) {
    double increaseRate = 0.05; // tuition percent increase rate
    double tInTenYears = TUITION; // tuition cost in 10 years
    double fourYearTuitionCost = 0;
    for (int i = 0; i < 10; i++) {
    tInTenYears *= (1 + increaseRate);
    }
    fourYearTuitionCost = tInTenYears;
    System.out.println("Tuition cost in 10 years: " +
    DecimalFormat.getCurrencyInstance().format(tInTenYears));
    for (int i = 0; i < 4; i++) {
    fourYearTuitionCost *= (1 + fourYearTuitionCost);
    }
    System.out.println("Total cost of 4 years starting today: " +
    DecimalFormat.getCurrencyInstance().format(tInTenYears));

        }
    }