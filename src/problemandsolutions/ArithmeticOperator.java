package problemandsolutions;

import java.util.Scanner;

public class ArithmeticOperator {
    //Write Java program to allow the user to input two integer values and then the program prints the results of adding,
    // subtracting, multiplying, and dividing among the two values.


    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        System.out.println("Enter First Number : ");
        int x= a.nextInt();
        System.out.println("Enter Second Number: ");
        int y= a.nextInt();
        System.out.println(x+y);

    }

}
