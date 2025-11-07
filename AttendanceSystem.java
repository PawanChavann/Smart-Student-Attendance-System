import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.println("╔════════════════════════════════════════════╗");
            System.out.println("║  SMART STUDENT ATTENDANCE & REPORT SYSTEM  ║");
            System.out.println("╚════════════════════════════════════════════╝");
            
            // Get student details
            System.out.print("\nEnter Student Name: ");
            String name = scanner.nextLine();
            
            int id = 0;
            boolean validId = false;
            while (!validId) {
                try {
                    System.out.print("Enter Student ID: ");
                    id = Integer.parseInt(scanner.nextLine());
                    if (id <= 0) {
                        System.out.println("Error: ID must be a positive number!");
                    } else {
                        validId = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number for ID!");
                }
            }
            
            Student student = new Student(name, id);
            System.out.println("\n✓ Student created successfully!");
            
            // Get number of days for attendance
            int days = 0;
            boolean validDays = false;
            while (!validDays) {
                try {
                    System.out.print("\nEnter number of days to mark attendance: ");
                    days = Integer.parseInt(scanner.nextLine());
                    if (days <= 0) {
                        System.out.println("Error: Number of days must be positive!");
                    } else {
                        validDays = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number!");
                }
            }
            
            // Collect attendance data
            boolean[] attendanceData = new boolean[days];
            System.out.println("\nMark attendance (P for Present, A for Absent):");
            for (int i = 0; i < days; i++) {
                boolean validInput = false;
                while (!validInput) {
                    System.out.print("Day " + (i + 1) + ": ");
                    String input = scanner.nextLine().trim().toUpperCase();
                    if (input.equals("P")) {
                        attendanceData[i] = true;
                        validInput = true;
                    } else if (input.equals("A")) {
                        attendanceData[i] = false;
                        validInput = true;
                    } else {
                        System.out.println("Error: Please enter 'P' or 'A' only!");
                    }
                }
            }
            
            // Get number of test marks
            int numTests = 0;
            boolean validTests = false;
            while (!validTests) {
                try {
                    System.out.print("\nEnter number of tests: ");
                    numTests = Integer.parseInt(scanner.nextLine());
                    if (numTests <= 0) {
                        System.out.println("Error: Number of tests must be positive!");
                    } else {
                        validTests = true;
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Error: Please enter a valid number!");
                }
            }
            
            // Collect marks
            System.out.println("\nEnter marks (0-100):");
            for (int i = 0; i < numTests; i++) {
                boolean validMarks = false;
                while (!validMarks) {
                    try {
                        System.out.print("Test " + (i + 1) + ": ");
                        int marks = Integer.parseInt(scanner.nextLine());
                        student.addMarks(marks);
                        validMarks = true;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Please enter a valid number!");
                    } catch (InvalidMarksException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                }
            }
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("PROCESSING DATA USING MULTITHREADING...");
            System.out.println("=".repeat(50));
            
            // Create and start threads
            AttendanceThread attendanceThread = new AttendanceThread(student, attendanceData);
            ReportThread reportThread = new ReportThread(student);
            
            attendanceThread.start();
            reportThread.start();
            
            // Wait for both threads to complete
            attendanceThread.join();
            reportThread.join();
            
            System.out.println("\n" + "=".repeat(50));
            System.out.println("ALL OPERATIONS COMPLETED!");
            System.out.println("=".repeat(50));
            
            // Save student data to file
            System.out.println("\nSaving complete student data...");
            student.saveToFile();
            System.out.println("✓ Data saved to: student_" + student.getId() + "_data.txt");
            
            // Display summary
            System.out.println("\n╔════════════════════════════════════════════╗");
            System.out.println("║            QUICK SUMMARY                   ║");
            System.out.println("╚════════════════════════════════════════════╝");
            System.out.println("Student: " + student.getName() + " (ID: " + student.getId() + ")");
            System.out.println("Attendance: " + String.format("%.2f", student.getAttendancePercentage()) + "%");
            System.out.println("Average Marks: " + String.format("%.2f", student.getAverageMarks()));
            System.out.println("\nFiles generated:");
            System.out.println("  • student_" + student.getId() + "_data.txt (Complete data)");
            System.out.println("  • student_" + student.getId() + "_report.txt (Performance report)");
            
        } catch (Exception e) {
            System.err.println("\nAn unexpected error occurred: " + e.getMessage());
            e.printStackTrace();
        } finally {
            scanner.close();
            System.out.println("\n✓ System closed successfully!");
        }
    }
}
