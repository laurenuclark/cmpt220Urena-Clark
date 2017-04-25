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
  public class Ex10_10 {
	
	public static void main(String[] args) {
		
		Queue queue = new Queue();

		
		for (int i = 1; i <= 20; i++) {
			queue.enqueue(i);
		}

		
		while (!queue.empty()) {
			System.out.print(queue.dequeue() + " ");
		}
		System.out.println();
	}
}