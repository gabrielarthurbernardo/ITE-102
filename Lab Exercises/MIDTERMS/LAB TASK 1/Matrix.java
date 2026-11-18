/*
    Student Name: Arthur Gabriel P. Bernardo
    Course: BS Information Technology
    Activity: Java 2D Array Matrix Operations
    Description: A program that populates a 3x3 2D array with user-inputted 
                 elements, then computes and displays row sums, column sums, 
                 diagonal sums, and total elements with a retry loop.
*/

import java.util.Scanner;

//1. CLASS DECLARED
public class Matrix {
    public static void main(String[] args) {
        //2. DECLARED ARRAY
        int[][] Matrix = new int[3][3];
        String option = "";
        do {
            //3. SCANNER DECLARED
            Scanner sc = new Scanner(System.in);
            //4. Enter the 9 inputted elements
            System.out.println("Input 9 elements: ");
            //5. Input the elements into the array
            for (int row = 0; row < 3; row++) {
                for (int col = 0; col < 3; col++) {
                    Matrix[row][col] = sc.nextInt();
                }
            }
            //6. Display the array and calculate row sums
            System.out.println("Display Here are the Numbers and the required output:");
            System.out.println("===============================================");
            System.out.printf("%36s%n", "Row Sum:");
            System.out.println();
            for (int i = 0; i < 3; i++) {
                int sum = 0;
                for (int j = 0; j < 3; j++) {
                    sum += Matrix[i][j];
                    System.out.printf("%8d", Matrix[i][j]);
                }
                System.out.printf("%12d%n", sum);
            }
            //7. Calculate and display column sums
            System.out.print("\nColumn sum: ");
            for (int i = 0; i < Matrix[0].length; i++) {
                int sum2 = 0;
                for (int j = 0; j < Matrix.length; j++) {
                    sum2 += Matrix[j][i];
                }
                System.out.printf("%8d", sum2);
            }
            //8. Calculate diagonal sums
            int diagonal1 = 0, diagonal2 = 0;
            for (int i = 0; i < 3; i++) {
                diagonal1 += Matrix[i][i];
                diagonal2 += Matrix[i][2 - i];
            }
            //10. TOTAL ELEMENTS
            System.out.println("\n===============================================");
            System.out.println("Diagonal sum 1: " + diagonal1);
            System.out.println("Diagonal sum 2: " + diagonal2);
            //12. THIS PRINTS THE TOTAL ELEMENTS
            System.out.printf("Display Total Elements: " + (Matrix.length * Matrix[0].length));
            //11. THIS ASKS IF YOU WANT TO TRY AGAIN
            System.out.print("\nDo you want try again? (y|n): ");
            option = sc.next();
        } while (option.equalsIgnoreCase("y"));
    }
}
