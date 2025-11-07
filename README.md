# 🎓 Smart Student Attendance & 
Report System

A comprehensive Java-based student 
management system that handles 
attendance tracking, marks 
management, and automated report 
generation using core Java 
concepts.

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

## 📋 Table of Contents

- [Features](#features)
- [Concepts 
Demonstrated](#concepts-demonstrated)
- [Project 
Structure](#project-structure)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Sample Output](#sample-output)
- [Screenshots](#screenshots)
- [Contributing](#contributing)
- [License](#license)

## ✨ Features

- ✅ **Interactive Attendance 
Tracking** - Mark student 
attendance with P/A input
- ✅ **Marks Management** - Store 
and validate test scores (0-100)
- ✅ **Automated Report 
Generation** - Create formatted 
performance reports
- ✅ **Multithreaded Processing** 
- Simultaneous attendance marking 
and report generation
- ✅ **File Persistence** - Save 
data to text files for future 
reference
- ✅ **Grade Calculation** - 
Automatic grade assignment based 
on average marks
- ✅ **Attendance Analytics** - 
Calculate attendance percentage 
and status
- ✅ **Input Validation** - 
Comprehensive error handling for 
all user inputs

## 🎯 Concepts Demonstrated

This project showcases the 
following Java programming 
concepts:

### 1. **Interface 
Implementation**
- `Saveable` interface defining 
file operations contract
- Implemented by `Student` class 
for data persistence

### 2. **Inheritance**
- `Person` (Base class) → 
`Student` (Derived class)
- Demonstrates "is-a" relationship 
and code reusability

### 3. **File Handling**
- Uses `FileWriter` and 
`PrintWriter` for file operations
- Generates structured data and 
report files
- Try-with-resources for automatic 
resource management

### 4. **Exception Handling**
- Custom exception: 
`InvalidMarksException`
- Handles `NumberFormatException` 
for invalid inputs
- Comprehensive try-catch blocks 
throughout

### 5. **Multithreading**
- `AttendanceThread` - Processes 
attendance marking
- `ReportThread` - Generates 
performance reports
- Concurrent execution with thread 
synchronization

## 📁 Project Structure

```
Smart-Student-Attendance-System/
│
├── src/
│   ├── Saveable.java              
# Interface for file operations
│   ├── Person.java                
# Base class with common 
properties
│   ├── Student.java               
# Student class with attendance & 
marks
│   ├── 
InvalidMarksException.java # 
Custom exception class
│   ├── AttendanceThread.java      
# Thread for attendance processing
│   ├── ReportThread.java          
# Thread for report generation
│   └── AttendanceSystem.java      
# Main application entry point
│
├── README.md                       
# Project documentation
├── LICENSE                         
# MIT License
└── .gitignore                      
# Git ignore file for Java 
projects
```

## 🔧 Prerequisites

Before running this project, 
ensure you have:

- **Java Development Kit (JDK)** 8 
or higher
- **Any Java IDE** (VS Code, 
IntelliJ IDEA, Eclipse, NetBeans)
- Basic understanding of Java 
programming

### Check Java Installation

```bash
java -version
javac -version
```

## 📥 Installation

### Option 1: Clone the Repository

```bash
# Clone this repository
git clone 
https://github.com/YOUR_USERNAME/Smart-Student-Attendance-System.git

# Navigate to project directory
cd Smart-Student-Attendance-System

# Navigate to source directory
cd src
```

### Option 2: Download ZIP

1. Click the green "Code" button 
on GitHub
2. Select "Download ZIP"
3. Extract the ZIP file
4. Navigate to the `src` folder

## 🚀 Usage

### Compile the Project

```bash
javac *.java
```

### Run the Application

```bash
java AttendanceSystem
```

### Follow the Interactive Prompts

```
Enter Student Name: John Doe
Enter Student ID: 101
Enter number of days to mark 
attendance: 5
Day 1: P
Day 2: P
Day 3: A
Day 4: P
Day 5: P
Enter number of tests: 3
Test 1: 85
Test 2: 90
Test 3: 78
```

## 📊 Sample Output

### Console Output
```
╔════════════════════════════════════════════╗
║  SMART STUDENT ATTENDANCE & 
REPORT SYSTEM  ║
╚════════════════════════════════════════════╝

✓ Student created successfully!

==================================================
PROCESSING DATA USING 
MULTITHREADING...
==================================================

[Attendance Thread] Starting 
attendance marking for John Doe
[Report Thread] Starting report 
generation for John Doe

[Attendance Thread] Day 1: Present
[Attendance Thread] Day 2: Present
...

╔════════════════════════════════════════════╗
║            QUICK SUMMARY                   
║
╚════════════════════════════════════════════╝
Student: John Doe (ID: 101)
Attendance: 80.00%
Average Marks: 84.33

Files generated:
  • student_101_data.txt (Complete 
data)
  • student_101_report.txt 
(Performance report)
```

### Generated Files

**student_101_data.txt** - 
Complete student records
```
=== STUDENT DATA ===
ID: 101, Name: John Doe

=== ATTENDANCE RECORDS ===
Day 1: Present
Day 2: Present
...
Attendance Percentage: 80.00%
```

**student_101_report.txt** - 
Performance report with grade
```
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
```

## 📸 Screenshots

_Add screenshots of your running 
application here_

## 🛠️ Technologies Used

- **Language:** Java
- **File I/O:** FileWriter, 
PrintWriter
- **Concurrency:** Java Threads
- **Data Structures:** ArrayList
- **Exception Handling:** Custom & 
Built-in Exceptions

## 🤝 Contributing

Contributions are welcome! Here's 
how you can help:

1. Fork the repository
2. Create a new branch (`git 
checkout -b feature/improvement`)
3. Make your changes
4. Commit your changes (`git 
commit -am 'Add new feature'`)
5. Push to the branch (`git push 
origin feature/improvement`)
6. Create a Pull Request

## 📝 License

This project is licensed under the 
MIT License - see the 
[LICENSE](LICENSE) file for 
details.

## 👨‍💻 Author

Pawan Chavan
- GitHub: 
(https://github.com/PawanChavann)
- Email: chavanpawan55@gmail.com

## 📞 Support

If you have any questions or run 
into issues, please:
- Open an issue on GitHub
- Contact via email 
chavanpawan55@gmail.com

---

⭐ **If you find this project 
helpful, please give it a star!** 
⭐

---

**Made with ❤️ and Java**
