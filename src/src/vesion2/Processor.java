package vesion2;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        StudentList studentList = new StudentList(new ArrayList<Student>());
        Scanner scanner = new Scanner(System.in);
        String check;
        do {
            System.out.println("------menu------");
            System.out.println("1. Add a new student");
            System.out.println("2. Update student by ID");
            System.out.println("3. Delete student by ID");
            System.out.println("4. Display all students");
            System.out.println("5. Find student with highest GPA");
            System.out.println("6. Display students with scholarships");
            System.out.println("7. Display total tuition of all students");
            System.out.print("nhap lua chon ");

            int luachon = scanner.nextInt();
            scanner.nextLine();
            switch (luachon) {
                case 1 ->  {
                    Student student=new Student();
                    student.addStudent();
                    studentList.addStudent(student);
                }
                case 2 ->  {
                    System.out.println("nhap id update :");
                    String id = scanner.nextLine();
                    studentList.update(id);
                }
                case 3 ->  {
                    System.out.println("nhap id xoa :");
                    String id = scanner.nextLine();
                    studentList.deleteStudentById(id);
                }
                case 4 ->  {
                    System.out.println("display all");
                    studentList.displayAllStudents();
                }
                case 5 ->  {
                    System.out.println("gpa hight");
                    studentList.findTopStudent();
                }
                case 6 ->  {
                    ArrayList<Student> stu = studentList.findScholarshipStudents();
                    if (stu.isEmpty()) {
                        System.out.println("khong co sv dat hoc bong");
                    } else {
                        System.out.println("danh sach");
                        for (Student s : stu) {
                            s.displayInfor();
                        }
                    }

                }
                case 7 ->  {
                    double totalTuition = studentList.caculateTuiitionOfAllStudents();
                    System.out.println("Total all students: " + totalTuition);
                }

                default -> System.out.println("Invalid option. Please try again.");
            }
            System.out.println("nhan y de tiep tuc");
            check=scanner.nextLine();
        }while(check.equals("y"));
    }
}
