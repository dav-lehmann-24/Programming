import java.util.ArrayList;
import java.util.Scanner;

class Student {
    public String name;
    private double gradeProgramming;
    private double gradeBusiness;
    private double gradeMath;

    public Student(String name) {
        this.name = name;
        this.gradeProgramming = 0;
        this.gradeBusiness = 0;
        this.gradeMath = 0;
    }

    public void setNote(String course, double grade) {
        switch (course.toLowerCase()) {
            case "programming":
                this.gradeProgramming = grade;
                break;
            case "business":
                this.gradeBusiness = grade;
                break;
            case "math":
                this.gradeMath = grade;
                break;
        }
    }

    public void displayStudent() {
        System.out.println(" ");
        System.out.println("Student: " + name);
        System.out.println("Programming: " + gradeProgramming);
        System.out.println("Business: " + gradeBusiness);
        System.out.println("Math: " + gradeMath);
    }

    public double averageGrade() {
        return (gradeProgramming + gradeBusiness + gradeMath) / 3;
    }
}

public class GradeManager {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println(" ");
            System.out.println("Welcome to the grade manager! Please choose an option:");
            System.out.println("1. Add new student");
            System.out.println("2. Add grades");
            System.out.println("3. Calculate average grade");
            System.out.println("4. Display all students");
            System.out.println("5. Quit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name of student: ");
                    String name = scanner.nextLine();
                    studentList.add(new Student(name));
                    System.out.println("New student successfully added!");
                    break;
                case 2:
                    if(!studentList.isEmpty()) {
                        System.out.print("Enter name of student: ");
                        String studentName = scanner.nextLine();
                        Student student = findStudentByName(studentList, studentName);
                        if(student != null) {
                            System.out.print("Enter course and grade (e.g. Programming 2): ");
                            String input = scanner.nextLine();
                            String[] parts = input.split(" ");
                            String fach = parts[0];
                            double note = Double.parseDouble(parts[1]);
                            student.setNote(fach, note);
                            System.out.println("Course and grade was added to the student!");
                        }
                        else {
                            System.out.println("Student not found!");
                        }
                    }
                    else {
                        System.out.println("No student in the list!");
                    }
                    break;
                case 3:
                    if(!studentList.isEmpty()) {
                        double sum = 0;
                        for(Student s : studentList) {
                            sum += s.averageGrade();
                        }
                        System.out.println("The average of all students: " + sum / studentList.size());
                    }
                    else {
                        System.out.println("No student in the list!");
                    }
                    break;
                case 4:
                    System.out.println("Here is the list of students: ");
                    if(!studentList.isEmpty()) {
                        for(Student s : studentList) {
                            s.displayStudent();
                        }
                    }
                    else {
                        System.out.println("No student in the list!");
                    }
                    break;
                case 5:
                    System.out.println("See you next time! :)");
                    System.exit(0);
                    break;
            }
        }
    }

    private static Student findStudentByName(ArrayList<Student> list, String name) {
        for(Student s : list) {
            if(s.name.equals(name)) {
                return s;
            }
        }
        return null;
    }
}