package Function;
import java.util.Scanner;

public class Calulation_Number {

    public static int CalculationNumber(int Num01 , int Num02 , int Num03) {
         int SumOfNumber  =  Num01 + Num02 - Num03;
         return SumOfNumber;
    }
    public static void main(String[] args) {
       System.out.println("Welcome to the test CalculatIon The Number");
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number First:" );
       int num01 = sc.nextInt();
       System.out.println("Enter the number Secound:" );

       int num02 = sc.nextInt();
       System.out.println("Enter the number Third:" );

       int num03 = sc.nextInt();


       

      int SumOfNumber = CalculationNumber(num01, num02, num03);
      System.out.println("Calculation the number: " + SumOfNumber);

      sc.close();
    }
}
