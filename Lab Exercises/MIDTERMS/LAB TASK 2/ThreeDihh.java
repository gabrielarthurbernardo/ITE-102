
import java.util.Scanner;

public class ThreeDihh {
    public static void main(String[] args) {

        //3. create scanner to get user input
        Scanner sc = new Scanner(System.in);

        //2. declare the subjects and create a 3D array for 2 sections, 3 students, and 3 subjects
        String[] subjects = {"Java", "Database", "Networking"};
        int[][][] grades = new int[2][3][3];

        //4. get the grades of each student from both sections
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

        //5. display each section, student, and their subject grades
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

                    //6. add the grades of each subject to get the student's total
                    totalStudent += grades[s][st][sub];
                }

                //7. calculate and display the student's average
                double average = totalStudent / 3;
                System.out.printf("Student Average: %.2f%n", average);

                //8. add the student's average to the section total
                totalSection += average;
            }

            //9. calculate and display the section average
            double averageSection = totalSection / 3;
            System.out.printf("%nSection Average: %.2f%n", averageSection);
        }

        //10. close scanner after all inputs and calculations are done
        sc.close();
    }
}
