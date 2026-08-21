# BIT1123 Object Oriented Programming - Assignment 1

## 2.1 Assignment Title
BIT1123 Object Oriented Programming - Assignment 1 (Individual)

## 2.2 Student Name
Hlengiwe Ntunja 

## 2.3 Student ID
[Your Student ID]

## 2.4 Course Information
- **Course Code:** BIT1123/BISE2093/DIT1113
- **Course Name:** Object Oriented Programming
- **Program:** Bachelor of Information Technology
- **Lecturer:** Sir Nazmirul Izzad Bin Nassir
- **University:** City University Malaysia
- **Semester:** 2026

## 2.5 Brief Course Description
This course provides a comprehensive introduction to Object-Oriented Programming (OOP) using Java. Students learn fundamental OOP concepts including classes, objects, inheritance, polymorphism, abstraction, and encapsulation. The course emphasizes practical, hands-on learning through weekly tutorials that progressively build programming skills. Topics also include file input/output operations, collections framework, exception handling, and graphical user interface development using Java Swing.

## 2.6 Repository Structure
1-OUP/
│
├── tutorial_1/
│ ├── HelloWorld.java
│ └── StudentGrade.java
│
├── tutorial_2/
│ ├── Main.java
│ └── Student.java
│
├── tutorial_3/
│ ├── Main.java
│ ├── Person.java
│ ├── Student.java
│ └── Lecturer.java
│
├── tutorial_5/
│ ├── Main.java
│ └── [Your files]
│
├── tutorial_6/
│ ├── Main.java
│ ├── Employee.java
│ └── Lecturer.java
│
├── tutorial_7/
│ ├── Main.java
│ ├── Appliance.java
│ ├── AirConditioner.java
│ ├── WashingMachine.java
│ └── Television.java
│
├── tutorial_8-9/
│ └── Main.java
│
├── week_10/
│ ├── Questions.java
│ └── QuizBattleGUI.java
│
├── .gitignore
├── LICENSE
└── README.md


## 2.7 Tutorial Summary (Week 1-10)

### Week 1: Getting Started with GitHub and Java Basics
This tutorial introduced GitHub and Codespaces setup. Created `HelloWorld.java` and `StudentGrade.java` programs. Learned basic Java syntax, the main method structure, and essential Git commands including `git init`, `git status`, `git add`, `git commit`, and `git push`.

### Week 2: Classes and Objects
Created `Student.java` class with attributes and methods. Learned object instantiation using the `new` keyword. Developed understanding that classes are blueprints and objects are instances of those classes.

### Week 3-4: Inheritance and Polymorphism
Created `Person.java` base class and extended it with `Student.java` and `Lecturer.java` subclasses. Learned the `extends` keyword, `super` keyword, and `@Override` annotation. Understood polymorphism and method overriding.

### Week 5: [Add your Week 5 description]
[Describe what you learned in tutorial_5]

### Week 6: Inheritance with Employee and Lecturer
Created `Employee.java` and `Lecturer.java` classes. Learned protected access modifiers and adding additional attributes like `subject` and `department` to subclasses. Reinforced inheritance concepts.

### Week 7: Abstract Classes and Abstraction
Created `Appliance.java` abstract class with concrete and abstract methods. Implemented multiple subclasses including `AirConditioner.java`, `WashingMachine.java`, and `Television.java`. Learned abstraction and hiding implementation details.

### Week 8-9: File I/O and Collections
Created to-do list application using `ArrayList`. Implemented file saving and loading using `BufferedWriter` and `BufferedReader`. Learned persistent data storage and exception handling.

### Week 10: Graphical User Interface (GUI) with Swing
Created `QuizBattleGUI.java` and `Questions.java` using Java Swing. Learned JFrame, JButton, JLabel, ActionListener, and event-driven programming. Built interactive quiz application.

## 2.8 Technologies Used
- **Java JDK 17+** - Programming Language
- **Git** - Version Control System
- **GitHub** - Remote Repository Hosting
- **GitHub Codespaces** - Cloud Development Environment
- **Java Swing** - GUI Development Library
- **Java I/O** - File Input/Output Operations
- **Java Collections** - ArrayList and Collections Framework

## 2.9 How to Run the Projects

### Prerequisites
- Java Development Kit (JDK) 17 or higher
- Git (optional)
- GitHub account

### Command Line Instructions
```bash
# Clone the repository
git clone https://github.com/Hlengiwe-debug/1-OUP.git
cd 1-OUP

# Navigate to a tutorial
cd tutorial_1

# Compile
javac HelloWorld.java

# Run
java HelloWorld
