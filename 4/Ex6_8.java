/**
  * file: Ex6_8
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 6.8
  * due date:  February, 27 , 2017
  *
  *This file contians the declaration of the 
  * Ex6_8 abstract data type.
  */
/**
  *exercise 6_8
  *This class converts a Celsius value to Farenheit.
  */

public class Ex6_8 {
  public static void main(String[] args) {

  String c = "Celsius";
  String f = "Fahrenheit";
  System.out.printf("%s%15s | %10s%10s\n", c, f, f, c);
  for (double celsius = 40, fahrenheit = 120.0; celsius >= 31; celsius--, fahrenheit -= 10) {

  System.out.printf("%4.2f%17.2f | %10.2f%10.2f\n", celsius, celsiusToFahrenheit(celsius),
  fahrenheit, fahrenheitToCelsius(fahrenheit));
      }
    }

    /** converts from celsius to fahrenheit */
    public static double celsiusToFahrenheit(double celsius) {
    return (9.0 / 5.0) * celsius + 32.0;
    }

    /** converts from fahrenheit to celsius */
    public static double fahrenheitToCelsius(double fahrenheit) {
    return (5.0 / 9) * (fahrenheit - 32.0);
        }
    }