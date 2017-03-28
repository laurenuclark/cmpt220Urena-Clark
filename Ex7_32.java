/** 
  * file: Ex7_32
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 7.32
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex4_25 abstract data type.
  */
/**
  *exercise 7_32
  *This class generates a license plate.
  */


import java.util.Scanner;

public class Ex7_32 {

public static void main(String[] args) {
  
  Scanner input = new Scanner(System.in);
  System.out.print("Enter a list:");
  
  int[] lista = new int[input.nextInt()];
  for (int i = 0; i < lista.length; i++) { 
  lista[i] = input.nextInt();
  }
  partition(lista);
  
  System.out.print("After the partition the list will be ");

  for (int i = 0; i < lista.length; i++) {
    System.out.print(lista[i] + " ");
     }
  }
 public static int partition(int[] list) {
  int partition = list[0];
  int partitionLocation = 0;
  int high = list.length-1;

  while (partitionLocation < high) {
   if (partition>list[partitionLocation+1]) {
     list [partitionLocation] = list[partitionLocation+1];
     list [partitionLocation+1] = partition;
     partitionLocation++;
   } else {
       
  int temp = list[high];
  list [high]=list[partitionLocation+1];
  list[partitionLocation+1] = temp;
  high--;
          }
        } 
  return partitionLocation;
    }
 }