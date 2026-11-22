import java.util.Scanner;

public class practice3dstudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] subjects = {"DATABASE GRADE", "NETWORK GRADE", "JAVA GRADE"};

        System.out.print("Enter number of sections to encode: ");
        int numSections = sc.nextInt();

        double[][][] grades = new double[numSections][][];

        //input
        for (int sec = 0; sec < numSections; sec++) {
            System.out.println("\n--- ENCODING SECTION " + (sec + 1) + " ---");
            System.out.print("How many students in Section " + (sec + 1) + "? ");
            int numStudents = sc.nextInt();

            grades[sec] = new double[numStudents][3];

            for (int stu = 0; stu < numStudents; stu++) {
                System.out.println("\nStudent " + (stu + 1) + ":");
                for (int sub = 0; sub < 3; sub++) {
                    System.out.print("  Enter " + subjects[sub] + ": ");
                    grades[sec][stu][sub] = sc.nextDouble();
                }
            }
        }

        // output
        System.out.println("\n==========================================");
        System.out.println("             GRADE REPORT                 ");
        System.out.println("==========================================");

        int totalPassed = 0;
        int totalFailed = 0;
        int totalExcellent = 0;

        for (int sec = 0; sec < grades.length; sec++) {
            System.out.println("\n=== SECTION " + (sec + 1) + " ===");

            for (int stu = 0; stu < grades[sec].length; stu++) {
                System.out.println("\nSTUDENT " + (stu + 1));

                double sum = 0;
                for (int sub = 0; sub < 3; sub++) {
                    System.out.println(subjects[sub] + ": " + grades[sec][stu][sub]);
                    sum += grades[sec][stu][sub];
                }

                double average = sum / 3.0;
                String remarks;

                //Passing Grade: 75 and above is passed 
                if (average >= 90) {
                    remarks = "EXCELLENT";
                    totalExcellent++;
                } else if (average >= 75) {
                    remarks = "PASSED";
                    totalPassed++;
                } else {
                    remarks = "FAILED";
                    totalFailed++;
                }

                System.out.printf("\nAVG GRADE: %.2f%n", average);
                System.out.println("REMARKS: " + remarks);
            }
        }

        //summary
        System.out.println("\n==========================================");
        System.out.println("TOTAL STUDENTS PASSED: " + totalPassed);
        System.out.println("==========================================");

        System.out.println("\n==========================================");
        System.out.println("TOTAL STUDENTS FAILED: " + totalFailed);
        System.out.println("==========================================");

        System.out.println("\n==========================================");
        System.out.println("TOTAL STUDENTS PASSED WITH EXCELLENT: " + totalExcellent);
        System.out.println("==========================================");




        sc.close();
    }
}