/** 
  * file: Ex8_13
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 8.13
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex4_25 abstract data type.
  */
/**
  *exercise 8_13
  *This class generates a license plate.
  */
public class Ex8_13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.printf("Enter the number of rows and columns of the array: ");
        int row = input.nextInt();
        int column = input.nextInt();
        double[][] m = new double[row][column];

        System.out.println("Enter the array : ");
        for (int i = 0; i < row; i++)
            for (int k = 0; k < column; k++)
                m[i][k] = input.nextDouble();


        int[] location = locateLargest(m);
        System.out.printf("The location of the largest element is at (%d, %d)\n", location[0], location[1]);
    }

    public static int[] locateLargest(double[][] a) {

        int[] location = new int[] { 0, 0 };
        double largest = a[0][0];
        for (int i = 0; i < a.length; i++) {

            for (int k = 0; k < a[i].length; k++) {

                if (a[i][k] > largest) {
                    location[0] = i; // row
                    location[1] = k; // column
                    largest = a[i][k];
                }

            }
        }

        return location;
    }
}   