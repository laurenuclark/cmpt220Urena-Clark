/**
  * file: Ex7_18
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 7.18
  * due date: February,28, 2017
  *
  *This file contians the declaration of the 
  * Ex7_18 abstract data type.
  */
/**
  *exercise 7_18
  * This bubble-sort algorithm makes several
  * passes through the array.
  */
public class Ex7_18 {
  public static void main(String[] args) {
  double[] numbers = new double[100];
  
  for (int i = 0; i < numbers.length ; i++) {
  numbers[i] = Math.random() * 200;
        }
  bubbleSort(numbers);
  printArray(numbers, 10);
    }

  public static void printArray(double[] array, int numberPerLine)     {
  for (int i = 0; i < array.length; i++) {
  System.out.printf("%4.0f ", array[i]);
  if ((i + 1) % numberPerLine == 0) System.out.println("");
        }
  }

  public static void bubbleSort(double[] numbers) {
  boolean change;
  do {
  change = false;
  for (int i = 0; i < numbers.length - 1; i++) {
  
  if (numbers[i] > numbers[i + 1]) {
  double temp = numbers[i];
  numbers[i] = numbers[i + 1];
  numbers[i + 1] = temp;
  change = true;
              }
            }
        } while (change);
      }
  }