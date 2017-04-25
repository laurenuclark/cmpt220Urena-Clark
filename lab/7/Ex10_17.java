/** 
  * file: Ex10_17 
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise Ex10_17 
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex10_17  abstract data type.
  */
/**
  *exercise Ex10_17 s
  *This class generates a license plate.
  */
  import java.math.BigInteger;

public class Ex10_17 {
	/** Main method */
	public static void main(String[] args) {
		// Find the first ten square numbers  
		// that are greater than Long.MAX_VALUE
		BigInteger i = new BigInteger(Long.MAX_VALUE + ""); 
		BigInteger end = i.add(new BigInteger("10"));

		// Display results
		for (i = new BigInteger(Long.MAX_VALUE + ""); 
			i.compareTo(end) <= 0; 
			i = i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i)); 
		}		
	}
}