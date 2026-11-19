
import java.util.Scanner;

public class ThreeDihh {
    public static void main(String[] args) {

        //1. declare scanner to get user input
        Scanner input = new Scanner(System.in);

        //2. create a 3D array for 2 sections, 3 students, and 3 subjects
        int[][][] three = new int[2][3][3];

        //3. store the subject names
        String[] subjects = {"Java", "Database", "Networking"};

        //4. get the grades of each student from both sections
        for (int layer = 0; layer < 2; layer++) {
            System.out.println("SECTION " + (layer + 1));
            System.out.println("------------------------");

            for (int row = 0; row < 3; row++) {
                System.out.println("Student " + (row + 1));

                for (int col = 0; col < 3; col++) {
                    System.out.print(subjects[col] + ": ");
                    three[layer][row][col] = input.nextInt();
                }
                System.out.println();
            }
        }

        //5. display the grades and calculate the student and section averages
        for (int layer = 0; layer < 2; layer++) {
            System.out.println("SECTION " + (layer + 1));
            System.out.println("------------------------");

            double sectionTotal = 0;

            for (int row = 0; row < 3; row++) {
                System.out.println("Student " + (row + 1));

                double studentTotal = 0;

                //6. get and display each subject grade, then add them together
                for (int col = 0; col < 3; col++) {
                    System.out.println(subjects[col] + ": " + three[layer][row][col]);
                    studentTotal += three[layer][row][col];
                }

                //7. calculate the student's average
                double studentAvg = studentTotal / 3.0;

                //8. add the student's average to the section total
                sectionTotal += studentAvg;

                System.out.printf("Student Average: %.2f%n", studentAvg);

                if (row < 2) {
                    System.out.println();
                }
            }

            //9. calculate and display the average of all students in the section
            double sectionAvg = sectionTotal / 3.0;
            System.out.printf("Section Average: %.2f%n%n", sectionAvg);
        }

        //10. close scanner after getting all inputs
        input.close();
    }
}
