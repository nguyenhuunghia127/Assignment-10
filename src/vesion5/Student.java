package vesion5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
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
        System.out.println("id la :" + this.getId());
        System.out.println("full name la :" + this.getFullName());
        System.out.println("date of birth la :" + new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("gpa la :" + this.getGpa());
        System.out.println("major la :" + this.getMajor());

    }

    @Override
    public void updatePerson(String id) {
        if (!this.getId().equals(id)) {
            System.out.println("khong tim thay");
            return;
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("update hoc sinh");
        System.out.println("update fullname :");
        String newfullname = scanner.nextLine();
        setId(newfullname);

        System.out.println("update gpa :");
        float newgpa = scanner.nextFloat();
        setGpa(newgpa);
        scanner.nextLine();

        System.out.println("update major :");
        String newmajor = scanner.nextLine();
        setMajor(newmajor);

    }

    @Override
    public void addPerson() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap thong tin hoc sinh ");
        System.out.println("nhap id :");
        String id = scanner.nextLine();
        setId(id);

        System.out.println("nhap fullname :");
        String fullname = scanner.nextLine();
        setFullName(fullname);

        System.out.println("nhap date of birth (dd/MM/yyyy):");
        String date = scanner.nextLine();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateofbirth = format.parse(date);
            setDateOfBirth(dateofbirth);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap bookBorrowDate (dd/MM/yyyy):");
        String bookBorrowDate = scanner.nextLine();
        SimpleDateFormat formatborrow = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateborrow = formatborrow.parse(bookBorrowDate);
            setBookBorrowDate(dateborrow);
        } catch (ParseException e) {
            System.out.println("loi ");
        }
        System.out.println("nhap bookReturnDate (dd/MM/yyyy):");
        String bookReturnDate = scanner.nextLine();
        SimpleDateFormat formatreturn = new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date ReturnDate = formatreturn.parse(bookReturnDate);
            setBookReturnDate(ReturnDate);
        } catch (ParseException e) {
            System.out.println("loi ");
        }
        System.out.println("nhap gpa :");
        float gpa = scanner.nextFloat();
        setGpa(gpa);
        scanner.nextLine();

        System.out.println("nhap major :");
        String major = scanner.nextLine();
        setMajor(major);
    }

}
