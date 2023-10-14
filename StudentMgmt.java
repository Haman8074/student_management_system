import java.util.Scanner;

class Student {
    long StudentId;
    String StudentName;
    int StudentAge;
    String Gender;
    String SelectedCourse;
    String Qualification;
    String EmailId;
    long PhoneNumber;

    // Constructor, getters, setters, and other methods for Student class can be defined here
    

    void DisplayStudentDetails() {
        System.out.println("Student ID: " + StudentId);
        System.out.println("Name: " + StudentName);
        System.out.println("Age: " + StudentAge);
        System.out.println("Gender: " + Gender);
        System.out.println("Selected Course: " + SelectedCourse);
        System.out.println("Qualification: " + Qualification);
        System.out.println("Email ID: " + EmailId);
        System.out.println("Phone Number: " + PhoneNumber);
        System.out.println("-------------------------------------");
    }
}

class StudentServices {
    long Id = 307453736L;
    Student studentList[] = new Student[20];
    Scanner scan = new Scanner(System.in);
    int idx = 0;

    void addNewStudent() {
        if (idx < studentList.length) {
            Student std = new Student();

            System.out.println("Enter student name:");
            String Name = scan.nextLine();
            System.out.println("Enter student age:");
            int Age = scan.nextInt();
            scan.nextLine();
            System.out.println("Enter gender:");
            String stdGender = scan.nextLine();
            System.out.println("Enter the selected course:");
            String course = scan.nextLine();
            System.out.println("Enter student qualification:");
            String Qual = scan.nextLine();
            System.out.println("Enter the email Id:");
            String EmailId = scan.nextLine();
            System.out.println("Enter phone number:");
            long PhNumber = scan.nextLong();
            std.StudentId = Id;
            std.StudentName = Name;
            std.StudentAge = Age;
            std.Gender = stdGender;
            std.SelectedCourse = course;
            std.Qualification = Qual;
            std.EmailId = EmailId;
            std.PhoneNumber = PhNumber;
            studentList[idx] = std;
            Id++;
            idx++;
        } else {
            System.out.println("Sorry! Student data is full.");
        }
    }

    void displayStudentDetails() {
        if (idx > 0) {
            for (int i = 0; i < idx; i++) {
                studentList[i].DisplayStudentDetails();
            }
        } else {
            System.out.println("Sorry! There is no data available.");
        }
    }

    void menu() {
        while (true) {
            System.out.println("============= Student Management ===========");
            System.out.println("Enter 1 to add student details");
            System.out.println("Enter 2 to display student details");
            System.out.println("Enter 0 to exit");
            System.out.println("Enter your choice:");
            System.out.println("============================================");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    addNewStudent();
                    break;
                case 2:
                    displayStudentDetails();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Project under development");
            }
        }
    }
}

public class StudentMgmt {
    public static void main(String[] args) {
        StudentServices studentServices = new StudentServices();
        studentServices.menu();
    }
}