import java.io.FileWriter;
import java.io.PrintWriter;

public class ReportThread extends Thread {
    private Student student;

    public ReportThread(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        System.out.println("\n[Report Thread] Starting report generation for " + student.getName());
        try {
            // Wait a bit to ensure some data is available
            Thread.sleep(1000);
            
            String filename = "student_" + student.getId() + "_report.txt";
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                writer.println("========================================");
                writer.println("    STUDENT PERFORMANCE REPORT");
                writer.println("========================================");
                writer.println("\nStudent Information:");
                writer.println("  " + student.toString());
                
                writer.println("\n--- ATTENDANCE SUMMARY ---");
                writer.println("  Total Classes: " + student.getTotalClasses());
                writer.println("  Present Days: " + student.getPresentDays());
                writer.println("  Attendance: " + String.format("%.2f", student.getAttendancePercentage()) + "%");
                
                if (student.getAttendancePercentage() >= 75) {
                    writer.println("  Status: GOOD ATTENDANCE ✓");
                } else {
                    writer.println("  Status: LOW ATTENDANCE ⚠");
                }
                
                writer.println("\n--- ACADEMIC SUMMARY ---");
                writer.println("  Total Tests: " + student.getMarks().size());
                writer.println("  Average Marks: " + String.format("%.2f", student.getAverageMarks()));
                
                double avg = student.getAverageMarks();
                String grade;
                if (avg >= 90) grade = "A+";
                else if (avg >= 80) grade = "A";
                else if (avg >= 70) grade = "B";
                else if (avg >= 60) grade = "C";
                else if (avg >= 50) grade = "D";
                else grade = "F";
                
                writer.println("  Grade: " + grade);
                
                writer.println("\n========================================");
                writer.println("  Report generated successfully!");
                writer.println("========================================");
            }
            
            System.out.println("[Report Thread] Report saved to: " + filename);
            Thread.sleep(500);
            System.out.println("[Report Thread] Report generation completed!");
            
        } catch (Exception e) {
            System.err.println("Error generating report: " + e.getMessage());
        }
    }
}
