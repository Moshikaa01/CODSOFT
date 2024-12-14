/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentgradecalculatortask2;
import java.util.Scanner;
class StudentGradeCalculator{
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the number of subjects: ");
            int numberOfSubjects = scanner.nextInt();
            if (numberOfSubjects <= 0) {
                System.out.println("Number of subjects must be greater than 0.");
                return;
            }  
            int[] marks = new int[numberOfSubjects];
            int totalMarks = 0;
            System.out.println("Enter marks obtained in " + numberOfSubjects + " subjects (out of 100):");
            for (int i = 0; i < numberOfSubjects; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
                totalMarks += marks[i];
            }
            
            double averagePercentage = (totalMarks * 100.0) / (numberOfSubjects * 100.0);
            String formattedPercentage = String.format("%.2f", averagePercentage);
            String grade = "";
            if (averagePercentage >= 90) {
                grade = "A+";
            } else if (averagePercentage >= 80) {
                grade = "A";
            } else if (averagePercentage >= 70) {
                grade = "B+";
            } else if (averagePercentage >= 60) {
                grade = "B";
            } else if (averagePercentage >= 50) {
                grade = "C";
            } else {
                grade = "F";
            }
            
            System.out.println("\n--- Results ---");
            System.out.println("Total Marks: " + totalMarks + " / " + (numberOfSubjects * 100));
            System.out.println("Average Percentage: " + formattedPercentage + "%");
            System.out.println("Grade: " + grade);
        }
    }
}



