/** 
  * file: Ex9_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: exercise 9.1
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Ex9_1 abstract data type.
  */
/**
  *exercise 9_1
  *This class generates a license plate.
  */
  
  public class Ex9_1 {
  public static void main(String[] args) {
    Rectangle rectangle1 = new Rectangle(4,40);
    Rectangle rectangle2 = new Rectangle(3.5, 35.9);
    
    //Rectangle 1  
    System.out.println("The details of the first rectangle...");
    System.out.println("Width of Rectangle1: " + rectangle1.width);
    System.out.println("Height of Rectangle1: " + rectangle1.height);
    System.out.println("Area of Rectangle1: " + rectangle1.getArea());
    System.out.print("Perimeter of Rectangle1: " + rectangle1.getPerimeter());
    System.out.println();

    //Rectangle 2  
    System.out.println("The details of the second rectangle...");
    System.out.println("Width of Rectangle2: " + rectangle2.width);
    System.out.println("Height of Rectangle2: " + rectangle2.height);
    System.out.println("Area of Rectangle2: " + rectangle2.getArea());
    System.out.print("Perimeter of Rectangle2: " + rectangle2.getPerimeter());
    System.out.println();
  }
}
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  