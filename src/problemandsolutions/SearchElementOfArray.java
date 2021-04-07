package problemandsolutions;

import java.util.Scanner;

public class SearchElementOfArray {
    // By using the sequential search algorithm,
    // write a Java program to search for an element of an integer array of 10 elements.


        public static int seqsearch (int[] dataset, int target, int n){

            int number=0;
            int i;
            int position = -1;

            for(i=0; i <n && number !=1; i++)
                if(target == dataset[i]){

                position = i; number = 1;
                }

            return position;
        }

        public static void main(String[] args) {

            int[] arr={2,4,50,56,80,23,40,5,65,99};
            int position =seqsearch(arr,99, arr.length);
            if(position != -1) System.out.println(" The values is found at the position of "+ position);
        }




    /*
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int arr[] = new int[10];
        int x, snum;
        for (x = 0; x < arr.length; x++) {
            System.out.println("Please Enter the Number : ");
            arr[x] = scan.nextInt();
        }
        System.out.println("Please Enter Search Number : ");
        snum = scan.nextInt();
        boolean found = false;
        for (x = 0; x < arr.length; x++) {
            if (snum == arr[x]) {
                found = true;
                break;
            }

        }
        if (found == true) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }*/

    }

