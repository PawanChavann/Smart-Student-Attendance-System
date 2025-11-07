# Smart-Student-Attendance-System
A comprehensive Java-based student management system that handles attendance tracking, marks management, and automated report generation using core Java concepts including OOP, multithreading, file handling, and exception management.
🎓 Smart Student Attendance & Report System
A comprehensive Java-based student management system that handles attendance tracking, marks management, and automated report generation using core Java concepts including OOP, multithreading, file handling, and exception management.
Show Image
Show Image
Show Image
📋 Table of Contents

About
Features
Concepts Demonstrated
Project Structure
Prerequisites
Installation
Usage
Sample Output
Technologies Used
Contributing
License
Contact

📖 About
This Smart Student Attendance & Report System is a command-line application built with Java that demonstrates advanced programming concepts. It allows users to manage student attendance records, store test marks, and automatically generate comprehensive performance reports. The system uses multithreading to process attendance and generate reports simultaneously, showcasing efficient concurrent programming.
✨ Features

✅ Interactive Attendance Tracking - Mark daily attendance with simple P (Present) / A (Absent) input
✅ Marks Management System - Store and validate test scores with automatic range checking (0-100)
✅ Automated Report Generation - Creates formatted performance reports with grades
✅ Multithreaded Processing - Simultaneous attendance marking and report generation for efficiency
✅ File Persistence - Saves all data to text files for permanent storage
✅ Automatic Grade Calculation - Assigns letter grades (A+, A, B, C, D, F) based on average marks
✅ Attendance Analytics - Calculates attendance percentage and provides status alerts
✅ Comprehensive Input Validation - Robust error handling for all user inputs
✅ User-Friendly Interface - Clean console-based UI with clear prompts and feedback

🎯 Concepts Demonstrated
This project showcases essential Java programming concepts:
1. Interface Implementation

Saveable interface defining a contract for file operations
Demonstrates abstraction and polymorphism
Implemented by Student class for data persistence

2. Inheritance (OOP)

Person (Base class) → Student (Derived class)
Demonstrates "is-a" relationship
Code reusability through inheritance
Method overriding with toString()

3. File Handling

Uses FileWriter and PrintWriter for file I/O operations
Generates two types of files:

Complete student data file
Formatted performance report


Try-with-resources for automatic resource management
Exception handling for file operations

4. Exception Handling

Custom exception: InvalidMarksException
Handles NumberFormatException for invalid numeric inputs
Comprehensive try-catch blocks throughout the application
User-friendly error messages

5. Multithreading

AttendanceThread - Processes attendance marking concurrently
ReportThread - Generates performance reports simultaneously
Demonstrates concurrent execution
Thread synchronization with join() method
Simulates real-world asynchronous processing

📁 Project Structure
Smart-Student-Attendance-System/
│
├── Saveable.java              # Interface defining file save operations
├── Person.java                # Base class with common person properties
├── Student.java               # Student class extending Person, implementing Saveable
├── InvalidMarksException.java # Custom exception for marks validation
├── AttendanceThread.java      # Thread class for attendance processing
├── ReportThread.java          # Thread class for report generation
├── AttendanceSystem.java      # Main application entry point
│
├── README.md                  # Project documentation (this file)
├── LICENSE                    # MIT License
└── .gitignore                 # Git ignore file for Java projects
File Descriptions
FileDescriptionSaveable.javaInterface that defines the contract for saving data to filesPerson.javaBase class containing common properties (name, id) for all personsStudent.javaDerived class that manages student-specific data (attendance, marks)InvalidMarksException.javaCustom exception thrown when marks are outside valid range (0-100)AttendanceThread.javaThread that handles attendance marking operations concurrentlyReportThread.javaThread that generates performance reports simultaneouslyAttendanceSystem.javaMain class containing the application logic and user interface
🔧 Prerequisites
Before running this project, ensure you have:

Java Development Kit (JDK) 8 or higher installed
Any Java IDE or Text Editor (VS Code, IntelliJ IDEA, Eclipse, NetBeans, or just Terminal)
Basic understanding of Java programming concepts

Check Java Installation
Open Terminal/Command Prompt and run:
bashjava -version
javac -version
If not installed, download from:

Oracle JDK
OpenJDK

📥 Installation
Option 1: Clone the Repository
bash# Clone this repository
git clone https://github.com/YOUR_USERNAME/Smart-Student-Attendance-System.git

# Navigate to project directory
cd Smart-Student-Attendance-System
Option 2: Download ZIP

Click the green "Code" button on GitHub
Select "Download ZIP"
Extract the ZIP file to your desired location
Navigate to the extracted folder

🚀 Usage
Step 1: Compile the Project
Open Terminal/Command Prompt in the project directory and run:
bashjavac *.java
This will compile all Java files and create .class files.
Step 2: Run the Application
bashjava AttendanceSystem
Step 3: Follow the Interactive Prompts
The system will guide you through:

Enter Student Details

   Enter Student Name: John Doe
   Enter Student ID: 101

Mark Attendance

   Enter number of days to mark attendance: 5
   Day 1: P
   Day 2: P
   Day 3: A
   Day 4: P
   Day 5: P

Enter Test Marks

   Enter number of tests: 3
   Test 1: 85
   Test 2: 90
   Test 3: 78

System Processing

Attendance marking thread starts
Report generation thread starts simultaneously
Both processes complete
Files are saved automatically



📊 Sample Output
Console Output
╔════════════════════════════════════════════╗
║  SMART STUDENT ATTENDANCE & REPORT SYSTEM  ║
╚════════════════════════════════════════════╝

Enter Student Name: John Doe
Enter Student ID: 101

✓ Student created successfully!

Enter number of days to mark attendance: 5

Mark attendance (P for Present, A for Absent):
Day 1: P
Day 2: P
Day 3: A
Day 4: P
Day 5: P

Enter number of tests: 3

Enter marks (0-100):
Test 1: 85
Test 2: 90
Test 3: 78

==================================================
PROCESSING DATA USING MULTITHREADING...
==================================================

[Attendance Thread] Starting attendance marking for John Doe
[Report Thread] Starting report generation for John Doe

[Attendance Thread] Day 1: Present
[Attendance Thread] Day 2: Present
[Attendance Thread] Day 3: Absent
[Attendance Thread] Day 4: Present
[Attendance Thread] Day 5: Present
[Attendance Thread] Attendance marking completed!

[Report Thread] Report saved to: student_101_report.txt
[Report Thread] Report generation completed!

==================================================
ALL OPERATIONS COMPLETED!
==================================================

Saving complete student data...
✓ Data saved to: student_101_data.txt

╔════════════════════════════════════════════╗
║            QUICK SUMMARY                   ║
╚════════════════════════════════════════════╝
Student: John Doe (ID: 101)
Attendance: 80.00%
Average Marks: 84.33

Files generated:
  • student_101_data.txt (Complete data)
  • student_101_report.txt (Performance report)

✓ System closed successfully!
Generated Files
📄 student_101_data.txt
Complete student records with detailed information:
=== STUDENT DATA ===
ID: 101, Name: John Doe

=== ATTENDANCE RECORDS ===
Day 1: Present
Day 2: Present
Day 3: Absent
Day 4: Present
Day 5: Present

Total Classes: 5
Present Days: 4
Attendance Percentage: 80.00%

=== MARKS RECORDS ===
Test 1: 85
Test 2: 90
Test 3: 78

Average Marks: 84.33
📄 student_101_report.txt
Formatted performance report with grade:
========================================
    STUDENT PERFORMANCE REPORT
========================================

Student Information:
  ID: 101, Name: John Doe

--- ATTENDANCE SUMMARY ---
  Total Classes: 5
  Present Days: 4
  Attendance: 80.00%
  Status: GOOD ATTENDANCE ✓

--- ACADEMIC SUMMARY ---
  Total Tests: 3
  Average Marks: 84.33
  Grade: A

========================================
  Report generated successfully!
========================================
🛠️ Technologies Used

Programming Language: Java (JDK 8+)
File I/O: FileWriter, PrintWriter
Concurrency: Java Threads (Thread class)
Data Structures: ArrayList
Exception Handling: Custom & Built-in Exceptions
OOP Concepts: Inheritance, Interface, Polymorphism, Encapsulation

📚 Key Learning Outcomes
By studying this project, you will learn:

How to implement interfaces in Java
How to use inheritance for code reusability
How to handle file operations with proper resource management
How to create and handle custom exceptions
How to implement multithreading for concurrent operations
How to validate user input effectively
How to design a clean, maintainable code structure


Made with ❤️ using Java
Last Updated: November 2025
