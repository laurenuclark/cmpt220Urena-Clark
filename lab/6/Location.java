/** 
  * file: Ex9_13
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 9.13
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex9_13 abstract data type.
  */
/**
  *exercise 9_13
  *This class generates a license plate.
  */
public class Location {
int row;         	
int column;			
double maxValue;	

Location(double[][] a) {
  maxValue = a[0][0];
  row = 0;
  column = 0;
		
for (int i = 0; i < a.length; i++) {
for (int j = 0; j < a[i].length; j++) {
if (a[i][j] > maxValue) {
					
maxValue = a[i][j];
row = i;
column = j;
     }
    }
   }
  }
}