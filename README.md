# Student Record Management System (SRMS)
This project is Java-based system designed to manage university student records. developed as part of the Group Coursework Assignment.


Student Management:
- Add student
- Search for a student
- Display all students
- Update student
- Remove student


Student:
- Stores ID, name, department, and GPA
- Provide getters and setters
- Validate GPA
- Convert info to a string


File handler:
- Load student records from a file
- Save student records to a file


Reports:
- Department Report
- GPA Report


Multithreading:
-  AutoSaveTask, saves data every second
-  ReportTask, generates reports without blocking main program




# Project structure:


StudentProject/
├── README.md
├── students.txt
└── src/
    ├── Main.java
    ├── model/
    │   └── Student.java
    ├── manager/
    │   └── StudentManager.java
    ├── util/
    │   └── FileHandler.java
    ├── report/
    │   ├── Report.java
    │   ├── GPAReport.java
    │   └── DepartmentReport.java
    └── thread/
        ├── AutoSaveTask.java
        └── ReportTask.java




# Run Instructions File


System requirements for running the project:
- Java JDK 8 or above  
-  IDE NetBeans or VS Code


How to compile the project:
- Open Terminal 
- Go to cd /path/to/StudentProject/src in the terminal
- write javac */*.java *.java (to Compile all java files)


How to run:
- After compiling, all the files with .java transform to .class needed to run the system 
- After successful compilation, run the program using java main


How to test the program:
 1 you can test the system through the command line by doing the following,
Add Student → Enter student information and confirm it is save
Update Student → Modify an existing student and update
Delete Student → Remove a student and confirm deletion
Search Student → Find a student by ID 



# Team members:
 1 Core developer - لامار الدوسري
 2 Multithreading & Reports - غلا الفهيد
 3 Documeantation & UML - يافا الربعي
 4 Github & README and Testing  - رولا الغانم
