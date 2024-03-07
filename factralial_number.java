package Function;

import java.util.Scanner;

public class factralial_number {
    public static void factralialNumber(int j) {
       
        if (j < 0) {
            System.out.println("invalid number");
            return;
        }

        int factralial = 1; 
       for (int i = j; i >= 1; i--) {
        factralial =factralial * i; 


       }
       System.out.println(factralial);
       return;
   }

   
    public static void main(String[] args) {
       System.out.println("Welcome to the test CalculatIon The Number");
       Scanner sc = new Scanner(System.in);

       System.out.println("Enter the number First:" );
       int num01 = sc.nextInt();

       factralialNumber(num01);

       sc.close();
    }
}

