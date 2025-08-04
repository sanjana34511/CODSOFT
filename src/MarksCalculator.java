import java.util.Scanner;

public class MarksCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of subjects; ");
        int numSubjects = scanner.nextInt();

        int[] marks = new int[numSubjects];
        int totalMarks = 0;


        //Input: marks of each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.println("Enter marks for subject ' + (i + 1) + (out of 100): ");
            marks[i] = scanner.nextInt();
            totalMarks += marks[i];
        }

        //Calculate  average percentage
        double average = (double) totalMarks / numSubjects;

        //Grade calculation based on average percentage
        String grade = "";
        if (average >= 90) {
            System.out.println("Your grade is 0");
        } else if (average >= 80) {
            System.out.println("Your grade is A+");
        } else if (average >= 70) {
            System.out.println("Your grade is A");
        } else if (average >= 60) {
            System.out.println("Your grade is B");
        } else if (average >= 50) {
            System.out.println("Your grade is C");
        } else if (average >= 40) {
            System.out.println("Your grade is D");
        } else if (average >= 30) {
            System.out.println("Your grade is F");
        }

        //Display results
        System.out.println("Total Marks:" + totalMarks);
        System.out.println("Average %:" + average + "%");
        System.out.println("Grade: " + grade);

        scanner.close();
    }
}