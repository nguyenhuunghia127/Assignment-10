package vesion2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;
    private double tuition;
    private boolean schoolarship;

    public Student() {
    }
    public Student(float gpa, String major, double tuition, boolean schoolarship, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
        this.schoolarship = (gpa >= 9.0);
        this.tuition = caculateTuiition();
    }
    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
        this.schoolarship = (gpa >= 9);
        this.tuition = caculateTuiition();
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public double getTuition() {
        return tuition;
    }

    public void setTuition(double tuition) {
        this.tuition = tuition;
    }

    public boolean isSchoolarship() {
        return schoolarship;
    }

    public void setSchoolarship(boolean schoolarship) {
        this.schoolarship = schoolarship;
    }

    

    @Override
    public void displayInfor() {
        System.out.println("id :" + this.getId());
        System.out.println("full name :" + this.getFullName());
        System.out.println("date of birth :" + new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("gpa :" + this.getGpa());
        System.out.println("major :" + this.getMajor());
        System.out.println("tuition :" + this.getTuition());
        System.out.println("schoolarship :" + this.schoolarship);
    }

    public void addStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin sinh vien");
        System.out.println("nhap id :");
        String id = scanner.nextLine();
        setId(id);

        System.out.println("nhap full name :");
        String fullname = scanner.nextLine();
        setFullName(fullname);

        System.out.println("nhap date (dd/MM/yyyy): ");
        String date = scanner.nextLine();
        SimpleDateFormat Format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfbirth = Format.parse(date);
            setDateOfBirth(dateOfbirth);

        } catch (ParseException e) {
            System.out.println("lỗi ");
        }
        System.out.println("nhap gpa :");
        float gpa = scanner.nextFloat();
        setGpa(gpa);
        scanner.nextLine();

        System.out.println("nhap major :");
        String major = scanner.nextLine();
        setMajor(major);
    }

    public double caculateTuiition() {
        if (this.gpa >= 9) {
            return 10000000 * 0.5;
        }
        return 10000000;

    }

}
