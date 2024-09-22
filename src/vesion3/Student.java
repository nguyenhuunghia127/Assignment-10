package vesion3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Student extends Person {

    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
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
        System.out.println("full name :" + this.getFullname());
        System.out.println("date of birth :" + new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("gpa :" + this.getGpa());
        System.out.println("major :" + this.getMajor());
    }

    @Override
    public void updatePerson(String id) {
        if(!this.getId().equals(id)){
            System.out.println("khong tim thay");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin student");
        System.out.println("nhap full name :");
        String newfullname = scanner.nextLine();
        setFullname(newfullname);
        System.out.println("nhap date dd/MM/yyyy:");
        String date = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = format.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (ParseException ex) {
            System.out.println("loi");
        }
        System.out.println("nhap gpa :");
        float newgpa=scanner.nextFloat();
        setGpa(newgpa);
        scanner.nextLine();
        
        System.out.println("nhap major :");
        String newmajor=scanner.nextLine();
        setMajor(newmajor);
        System.out.println("da update");
    }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin student update");
        System.out.println("nhap id :");
        String id = scanner.nextLine();
        setId(id);

        System.out.println("nhap full name :");
        String fullname = scanner.nextLine();
        setFullname(fullname);
        System.out.println("nhap date dd/MM/yyyy:");
        String date = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth = format.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (ParseException ex) {
            System.out.println("loi");
        }
        System.out.println("nhap gpa :");
        float gpa=scanner.nextFloat();
        setGpa(gpa);
        scanner.nextLine();
        
        System.out.println("nhap major :");
        String major=scanner.nextLine();
        setMajor(major);

    }

}