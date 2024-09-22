package assignment10;


import java.util.ArrayList;
import java.util.Date;



public class StudentList {
    private ArrayList<Student> student;

    public StudentList(ArrayList<Student> student) {
        this.student = student;
    }

    public void addStudent(Student student) {
        this.student.add(student); 
        System.out.println("Added a new student.");
    }

    public void deleteStudentById(String id) {
        int delete = -1;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId().equals(id)) {
                delete = i;
                break;
            }
        }

        if (delete != -1) {
            student.remove(delete);
            System.out.println("Student with ID " + id + " has been deleted.");
        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }

    public void findStudentByID(String id) {
        boolean found = false;
        for (int i = 0; i < student.size(); i++) {
            if (student.get(i).getId().equals(id)) {
                System.out.println("da tim thay" + student.get(i).toString());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("khong tim thay");

        }

    }

    public void displayAllStudents() {
        for (int i = 0; i < student.size(); i++) {
            System.out.println("hoc sinh thu " + i + 1);
            student.get(i).displayInfor(); 
        }

    }

    public void updateStudent(String id, String newName, String major, float newGpa, String dateofbirth) {
        for (int i = 0; i < student.size(); i++) {
        Student stu = student.get(i);
        if (stu.getId().equals(id)) {
            stu.setFullName(newName);
            stu.setMajor(major);
            stu.setGpa(newGpa);
            
            return;
        }
    }
    }

    Student findStudentWithHighestGPA() {
        Student top = student.get(0);
        for (int i = 1; i < student.size(); i++) {
            if (student.get(i).getGpa() > top.getGpa()) {
                top = student.get(i);
            }
        }
        System.out.println("sinh vien cao nhat :" + student.toString());
        return top;
    }

}
