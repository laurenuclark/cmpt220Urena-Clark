/** 
  * file: Driver9_1
  * author: Lauren Urena-Clark
  * course: CMPT 220
  * assignment: Driver 9.1
  * due date: January, 31, 2017
  *
  *This file contians the declaration of the 
  * Driver9_1 abstract data type.
  */
/**
  *Driver 9_1
  *This class generates a license plate.
  */

class Rectangle {
  double width = 1.0;
  double height = 1.0;

  Rectangle() {

  }

  Rectangle(double newWidth, double newHeight) {
    width = newWidth;
    height = newHeight;
  }

  double getArea() {
    return width * height;
  }

  double getPerimeter() {
    return 2 * (width + height);
  }
}