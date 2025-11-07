import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Student extends Person implements Saveable {
    private List<Boolean> attendanceRecords;
    private List<Integer> marks;

    public Student(String name, int id) {
        super(name, id);
        this.attendanceRecords = new ArrayList<>();
        this.marks = new ArrayList<>();
    }

    public void markAttendance(boolean isPresent) {
        attendanceRecords.add(isPresent);
    }

    public void addMarks(int mark) throws InvalidMarksException {
        if (mark < 0 || mark > 100) {
            throw new InvalidMarksException("Marks must be between 0 and 100. Received: " + mark);
        }
        marks.add(mark);
    }

    public int getTotalClasses() {
        return attendanceRecords.size();
    }

    public int getPresentDays() {
        int count = 0;
        for (boolean present : attendanceRecords) {
            if (present) count++;
        }
        return count;
    }

    public double getAttendancePercentage() {
        if (attendanceRecords.isEmpty()) return 0.0;
        return (getPresentDays() * 100.0) / getTotalClasses();
    }

    public double getAverageMarks() {
        if (marks.isEmpty()) return 0.0;
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }
        return sum / (double) marks.size();
    }

    public List<Boolean> getAttendanceRecords() {
        return attendanceRecords;
    }

    public List<Integer> getMarks() {
        return marks;
    }

    @Override
    public void saveToFile() throws Exception {
        try (PrintWriter writer = new PrintWriter(new FileWriter("student_" + id + "_data.txt"))) {
            writer.println("=== STUDENT DATA ===");
            writer.println(toString());
            writer.println("\n=== ATTENDANCE RECORDS ===");
            for (int i = 0; i < attendanceRecords.size(); i++) {
                writer.println("Day " + (i + 1) + ": " + (attendanceRecords.get(i) ? "Present" : "Absent"));
            }
            writer.println("\nTotal Classes: " + getTotalClasses());
            writer.println("Present Days: " + getPresentDays());
            writer.println("Attendance Percentage: " + String.format("%.2f", getAttendancePercentage()) + "%");
            
            writer.println("\n=== MARKS RECORDS ===");
            for (int i = 0; i < marks.size(); i++) {
                writer.println("Test " + (i + 1) + ": " + marks.get(i));
            }
            writer.println("\nAverage Marks: " + String.format("%.2f", getAverageMarks()));
        }
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
