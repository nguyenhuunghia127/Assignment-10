package assignment10;


import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList(new ArrayList<Student>());
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("------menu------");
            System.out.println("1. Add a new student");
            System.out.println("2. Update a student by id");
            System.out.println("3. Delete a student by id");
            System.out.println("4. Display all students");
            System.out.println("5. Find the student with the highest GPA");
            System.out.println("6. thoat");
            System.out.print("nhap lua chon: ");

            int luachon = scanner.nextInt();
            scanner.nextLine();
            switch (luachon) {
                case 1 -> {
                     Student newStudent = new Student();
                    newStudent.addStudent(scanner);
                    studentList.addStudent(newStudent);
                }
                case 2 -> {
                    System.out.print("Enter Student ID to update: ");
                    scanner.nextLine();
                    String id = scanner.nextLine();
                    System.out.print("nhap Name: ");
                    String newName = scanner.nextLine();
                    System.out.print("nhap chuyen nganh: ");
                    String newmajor = scanner.nextLine();
                    scanner.nextLine();
                    System.out.print("nhap GPA: ");
                    float newGpa = scanner.nextFloat();
                    scanner.nextLine();
                    System.out.print("nhap date: ");
                    String dateofbirth = scanner.nextLine();
                    scanner.nextLine();
                    studentList.updateStudent(id, newName,newmajor,newGpa,dateofbirth);
                }

                case 3 -> {

                    System.out.print("Enter the student ID to delete: ");
                    String idToDelete = scanner.nextLine();
                    studentList.deleteStudentById(idToDelete);
                }
                case 4 ->
                    studentList.displayAllStudents();
                case 5 -> {

                    Student highestGPAStudent = studentList.findStudentWithHighestGPA();
                    System.out.println("Student with the highest GPA:");
                    highestGPAStudent.displayInfor();
                }
                case 6 ->
                    System.out.println("thoat");
                default ->
                    System.out.println("lua chon khong hop le");
            }
            System.out.println("nhan y de tiep tuc chuong trinh");
            check = scanner.nextLine();
        } while (check.equals("y"));

    }

}
