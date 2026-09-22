
import java.util.Scanner;

// Student class to encapsulate student details and performance calculations
class Student {
    //given  Data is arranged as a question for to do the program task
    private int rollNumber;
    private String name;
    private int[] marks;      // marks in 5 subjects
    private final int numSubjects;
    private final int maxMarksPerSubject = 100;
    // Constructor
    public Student(int rollNumber, String name, int[] marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
        this.numSubjects = marks.length;
    }
    // Calculate total marks
    public int calculateTotal() {
        int total = 0;
        for (int i = 0; i < numSubjects; i++) {
            total += marks[i];
        }
        return total;
    }
    // Calculate average marks  to demonstrate type casting
    public double calculateAverage() {
        return (double) calculateTotal() / numSubjects;
    }
    // Find highest marks to demonstrate Math.max() usage
    public int findHighest() {
        int highest = marks[0];
        for (int i = 1; i < numSubjects; i++) {
            highest = Math.max(highest, marks[i]);
        }
        return highest;
    }
    // Find lowest marks to demonstrate Math.min() usage
    public int findLowest() {
        int lowest = marks[0];
        for (int i = 1; i < numSubjects; i++) {
            lowest = Math.min(lowest, marks[i]);
        }
        return lowest;
    }
    // Calculate the percentage of total marks
    public double calculatePercentage() {
        int maxTotal = numSubjects * maxMarksPerSubject;
        return ((double) calculateTotal() / maxTotal) * 100;
    }
    // Round percentage to two decimal places using Math package
    public double getRoundedPercentage() {
        double percentage = calculatePercentage();
        return Math.round(percentage * 100.0) / 100.0;
    }
    // Determine grade based on percentage
    public String determineGrade() {
        double percentage = calculatePercentage();
        if (percentage >= 90) {
            return "A+";
        } else if (percentage >= 80) {
            return "A";
        } else if (percentage >= 70) {
            return "B";
        } else if (percentage >= 60) {
            return "C";
        } else if (percentage >= 50) {
            return "D";
        } else {
            return "F (Fail)";
        }
    }
    // Determine pass/fail status
    public boolean hasPassed() {
        return calculatePercentage() >= 50;
    }
    // Performance remark based on grade
    public String getPerformanceRemark() {
        String grade = determineGrade();
        switch (grade) {
            case "A+":
                return "Outstanding performance! Keep up the excellent work.";
            case "A":
                return "Excellent performance!";
            case "B":
                return "Good performance. Room for improvement.";
            case "C":
                return "Average performance. Needs more effort.";
            case "D":
                return "Below average. Needs significant improvement.";
            default:
                return "Failed. Immediate attention and effort required.";
        }
    }
    // Display formatted student name using String operations
    public String getFormattedName() {
        String cleanName = name.trim();
        return cleanName.toUpperCase() + " (Length: " + cleanName.length() + " characters)";
    }
    // Display complete student details
    public void displayReport() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Roll Number      : " + rollNumber);
        System.out.println("Student Name     : " + getFormattedName());
        System.out.print("Subject Marks    : ");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print(marks[i]);
            if (i != numSubjects - 1) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Total Marks      : " + calculateTotal() + " / " + (numSubjects * maxMarksPerSubject));
        System.out.println("Average Marks    : " + String.format("%.2f", calculateAverage()));
        System.out.println("Highest Marks    : " + findHighest());
        System.out.println("Lowest Marks     : " + findLowest());
        System.out.println("Percentage       : " + getRoundedPercentage() + "%");
        System.out.println("Grade            : " + determineGrade());
        System.out.println("Result           : " + (hasPassed() ? "PASS" : "FAIL"));
        System.out.println("Remark           : " + getPerformanceRemark());
    }
}
public class ObservationTask4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        int rollNumber = Integer.parseInt(sc.nextLine().trim());
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        int numSubjects = 5;
        int[] marks = new int[numSubjects];
        System.out.println("Enter marks for " + numSubjects + " subjects (out of 100 each):");
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            marks[i] = Integer.parseInt(sc.nextLine().trim());
        }
        Student student = new Student(rollNumber, name, marks);
        student.displayReport();
        sc.close();
    }
}
