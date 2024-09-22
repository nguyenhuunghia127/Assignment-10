package assignment10;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {


    private float gpa;
    private String major;

    public Student(String major, int age, String id, String fullName, float gpa, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public Student() {
    }
    

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void displayInfor() {
        System.out.println("id :" + this.getId());
        System.out.println("full name :" + this.getFullName());
        System.out.println("Date of Birth: " + new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("gpa :" + this.getGpa());
        System.out.println("major :" + this.getMajor());
    }

    public void addStudent(Scanner student) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thong tin sinh vien:");
        System.out.print("Name: ");
        String Fullname = scanner.nextLine();
        setFullName(Fullname);
        
        System.out.print("Student ID: ");
        String id = scanner.nextLine();
        setId(id);
        
        
        System.out.print("GPA: ");
        float gpa = scanner.nextFloat();
        setGpa(gpa);
        scanner.nextLine();
        
        System.out.println("major: ");
        String major = scanner.nextLine();
        setMajor(major);

        System.out.println("nhap date (dd/MM/yyyy): ");
        String date = scanner.nextLine();
        SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfbirth = Format.parse(date);
            setDateOfBirth(dateOfbirth);

        } catch (ParseException e) {
            System.out.println("lỗi ");
        }
    }


}
