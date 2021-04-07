package problemandsolutions;

import java.util.Scanner;

public class ArraySort {
    // By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.


        public static void main(String []args) {
            int num, i, j, sort;
            Scanner input = new Scanner(System.in);

            System.out.println("Enter the number of integers to sort:");
            num = input.nextInt();

            int array[] = new int[num];

            System.out.println("Enter " + num + " integers: ");

            for (i = 0; i < num; i++)
                array[i] = input.nextInt();

            for (i = 0; i < ( num - 1 ); i++) {
                for (j = 0; j < num - i - 1; j++) {
                    if (array[j] > array[j+1])
                    {
                        sort = array[j];
                        array[j] = array[j+1];
                        array[j+1] = sort;
                    }
                }
            }

            System.out.println("Sorted list of integers:");

            for (i = 0; i < num; i++)
                System.out.println(array[i]);
        }


    }
