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
public class Ex10_2 {

    public static void main(String[] args) {

        BMI p = new BMI("El Chapo", 22, 175, 5, 7);
        System.out.printf("Name: %s Age: %d weight: %.2f feet: %.2f inches: %.2f\n",
                p.getName(), p.getAge(), p.getWeight(), p.getFeet(), p.getInches());
    }


}