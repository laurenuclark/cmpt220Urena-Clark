import java.util.Scanner;

public class DriverPr1 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    
    int p = input.nextInt();
    int j = input.nextInt();
      
    double[] aFirst = new double[i];
    double[] aSecond = new double[j];
    
    for (int z = 0; z < p; z++){
      aFirst[z] = input.nextDouble();
      }
    
    for (int z = 0; z < j; z++){
      aSecond[z] = input.nextDouble();
      }
    
    double[] aThird = convolveVectors(aFirst, aSecond);
    
    for (int count = 0; count < aThird.length - 1; count++) {
      System.out.printf("%d ", new Object[] { Long.valueOf(Math.round(aThird[count])) });
      }
    System.out.printf("%d\n", new Object[] { Long.valueOf(Math.round(aThird[(aThird.length - 1)])) });
     }
  
  private static double[] convolveVectors(double[] vFirst, double[] vSecond)
    {
    double[] vResult = new double[vFirst.length + vSecond.length - 1];
 
      for (int p = 0; p < vResult.length; p++){
      vResult[p] = 0.0D;
      for (int j = 0; j < vSecond.length; j++) {
        if ((p - j >= 0) && (p - j < vFirst.length)) {
          vResult[p] += vFirst[(p - j)] * vSecond[j];
          }
        }
      }
    return vResult;
    }
  }