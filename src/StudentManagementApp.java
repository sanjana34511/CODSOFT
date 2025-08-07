import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class Student {
    String name;
    int rollNo;
    String grade;

    public Student(String name, int rollNo, String grade) {
        this.name = name;
        this.rollNo = rollNo;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Name;" + name + ",Roll No:" + rollNo + ",Grade:" + grade;
    }
}

class StudentManagementSystem {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully.\n");
    }

    public void displayStudent(){
        if (students.isEmpty()) {
            System.out.println("No students found.\n");
        } else {
            System.out.println("Student List:");
            for (Student s: students) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public void searchStudent(int rollNo) {
        for (Student s: students) {
            if (s.rollNo == rollNo) {
                System.out.println("Student not found: " + s + "\n");
                return;
            }
        }
        System.out.println("Student not found.\n");
    }
}

public class  StudentManagementApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("Add the Student");
            System.out.println("Display the Students");
            System.out.println("Search the Student by their Roll No");
            System.out.println("Exit");
            System.out.println("Choose an option:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    sc.nextLine();//consume the leftover newline
                    System.out.println("Enter the name");
                    String name = sc.nextLine();

                    System.out.println("Enter the roll number.");
                    int rollNo = sc.nextInt();

                    sc.nextLine();  //consume newline
                    System.out.println("Enter the grade:");
                    String grade = sc.nextLine();

                    //Simple input validation
                    if (name.isEmpty() || grade.isEmpty()) {
                        System.out.println("Invalid input! Name and grade cannot be empty ");
                        break;
                    }

                    sms.addStudent(new Student(name, rollNo, grade));
                    break;

                case 2:
                    sms.displayStudent();
                    break;

                case 3:
                    System.out.println("Enter roll number to search:");
                    int searchRoll = sc.nextInt();
                    sms.searchStudent(searchRoll);
                    break;

                case 4:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.\n");
            }
        }
    }
}










