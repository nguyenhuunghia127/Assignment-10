package vesion2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class StudentList {

    private ArrayList<Student> students;

    public StudentList() {
        this.students = new ArrayList<>();
    }

    public StudentList(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        this.students.add(student);
        System.out.println("da them");
    }

    public void update(String id) {
        Student student = findStudentById(id);
        Scanner scanner = new Scanner(System.in);

        System.out.println("new full name :");
        String newfullname = scanner.nextLine();
        student.setFullName(newfullname);

        System.out.println("nhap date (dd/MM/yyyy): ");
        String date = scanner.nextLine();
        SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfbirth = Format.parse(date);
            student.setDateOfBirth(dateOfbirth);

        } catch (ParseException e) {
            System.out.println("lỗi ");
        }
        System.out.println("new gpa :");
        float newGpa = scanner.nextFloat();
        scanner.nextLine();
        student.setGpa(newGpa);

        System.out.println("nhap major :");
        String major = scanner.nextLine();
        student.setMajor(major);
    }

    public void deleteStudentById(String id) {
        Student student = findStudentById(id);
        if (students.remove(student) && student != null) {
            System.out.println("da xoa");
        } else {
            System.out.println("khong tim thay");
        }
    }

    public Student findStudentById(String id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(id)) {
                return students.get(i);
            }
        }
        return null;

    }

    public void displayAllStudents() {
        for (int i = 0; i < students.size(); i++) {
            System.out.println("hoc sinh thu " + (i + 1));
            students.get(i).displayInfor();
        }
    }

    public Student findTopStudent() {
        Student top = students.get(0);
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getGpa() > top.getGpa()) {
                top = students.get(i);
            }
        }
        System.out.println("TopStudent :" + top.toString());
        return top;

    }

    public ArrayList<Student> findScholarshipStudents() {
        ArrayList<Student> scho = new ArrayList<>();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).isSchoolarship()) {
                scho.add(students.get(i));
            }
        }
        return scho;

    }

    public double caculateTuiitionOfAllStudents() {
        double total = 0;
        for (int i = 0; i < students.size(); i++) {
            total += students.get(i).getTuition();
        }
        return total;

    }

}
