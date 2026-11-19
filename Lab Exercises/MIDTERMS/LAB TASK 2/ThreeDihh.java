import java.util.Scanner;
 
public class ThreeDihh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        int[][][] three = new int[2][3][3];
        String[] subjects = {"Java", "Database", "Networking"};
 
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
 
        for (int layer = 0; layer < 2; layer++) {
            System.out.println("SECTION " + (layer + 1));
            System.out.println("------------------------");
            double sectionTotal = 0;
 
            for (int row = 0; row < 3; row++) {
                System.out.println("Student " + (row + 1));
                double studentTotal = 0;
 
                for (int col = 0; col < 3; col++) {
                    System.out.println(subjects[col] + ": " + three[layer][row][col]);
                    studentTotal += three[layer][row][col];
                }
 
                double studentAvg = studentTotal / 3.0;
                sectionTotal += studentAvg;
                System.out.printf("Student Average: %.2f%n", studentAvg);
 
                if (row < 2) {
                    System.out.println();
                }
            }
 
            double sectionAvg = sectionTotal / 3.0;
            System.out.printf("Section Average: %.2f%n%n", sectionAvg);
        }
 
        input.close();
    }
}
