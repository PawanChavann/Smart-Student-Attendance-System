public class AttendanceThread extends Thread {
    private Student student;
    private boolean[] attendanceData;

    public AttendanceThread(Student student, boolean[] attendanceData) {
        this.student = student;
        this.attendanceData = attendanceData;
    }

    @Override
    public void run() {
        System.out.println("\n[Attendance Thread] Starting attendance marking for " + student.getName());
        try {
            for (int i = 0; i < attendanceData.length; i++) {
                student.markAttendance(attendanceData[i]);
                System.out.println("[Attendance Thread] Day " + (i + 1) + ": " + 
                                 (attendanceData[i] ? "Present" : "Absent"));
                Thread.sleep(500); // Simulate processing time
            }
            System.out.println("[Attendance Thread] Attendance marking completed!");
        } catch (InterruptedException e) {
            System.err.println("Attendance thread interrupted: " + e.getMessage());
        }
    }
}