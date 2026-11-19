
import java.util.Scanner;

public class ThreeDihh {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //1. declare the subjects and create a 3D array for the sections, students, and grades
        String[] subjects = {"Java", "Database", "Networking"};
        int[][][] grades = new int[2][3][3];

        //2. ask the user to input the grades of all students
        for (int s = 0; s < 2; s++) {

            System.out.println("\nSECTION " + (s + 1));

            for (int st = 0; st < 3; st++) {

                System.out.println("\nStudent " + (st + 1));

                int sub = 0;
                while (sub < 3) {
                    System.out.print("Enter " + subjects[sub] + " grade: ");
                    grades[s][st][sub] = sc.nextInt();
                    sub++;
                }
            }
        }

        //3. display all grades and calculate the average of each student
        for (int s = 0; s < 2; s++) {

            double totalSection = 0;

            System.out.println("\n========================");
            System.out.println("SECTION " + (s + 1));
            System.out.println("========================");

            for (int st = 0; st < 3; st++) {

                double totalStudent = 0;

                System.out.println("\nStudent " + (st + 1));

                for (int sub = 0; sub < 3; sub++) {

                    System.out.println(subjects[sub] + ": " + grades[s][st][sub]);

                    totalStudent = totalStudent + grades[s][st][sub];
                }

                //4. get the average of the student's three subject grades
                double average = totalStudent / 3;

                System.out.printf("Student Average: %.2f%n", average);

                totalSection += average;
            }

            //5. calculate the average of all students in the current section
            double averageSection = totalSection / 3;

            System.out.printf("%nSection Average: %.2f%n", averageSection);
        }

        //6. close scanner after all inputs and calculations are done
        sc.close();
    }
}
