
package vesion5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Teacher extends Person{
    private String department;
    private String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth, Date bookBorrowDate, Date bookReturnDate) {
        super(id, fullName, dateOfBirth, bookBorrowDate, bookReturnDate);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    

    @Override
    public void displayInfor() {
        System.out.println("id la :"+this.getId());
        System.out.println("full name la :"+this.getFullName());
        System.out.println("date of birth la :"+new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("department la :"+this.department);
        System.out.println("teachingSubject la :"+this.teachingSubject);
    }

    @Override
    public void updatePerson(String id) {
        if(!this.getId().equals(id)){
            System.out.println("khong tim thay");
            return ;
        }
        Scanner scanner =new Scanner(System.in);
        System.out.println("update teacher");
        System.out.println("update fullname :");
        String newfullname=scanner.nextLine();
        setFullName(newfullname);
        
        System.out.println("update department :");
        String newdepartment=scanner.nextLine();
        setDepartment(newdepartment);
                
        System.out.println("update teachingSubject :");
        String newteachingSubject=scanner.nextLine();
        setTeachingSubject(newteachingSubject);
    }

    @Override
    public void addPerson() {
        Scanner scanner =new Scanner(System.in);
        System.out.println("nhap thong tin teacher ");
        System.out.println("nhap id :");
        String id=scanner.nextLine();
        setId(id);
        
        System.out.println("nhap fullname :");
        String fullname =scanner.nextLine();
        setFullName(fullname);
        
        System.out.println("nhap date of birth (dd/MM/yyyy):");
        String date=scanner.nextLine();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateofbirth=format.parse(date);
            setDateOfBirth(dateofbirth);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap bookBorrowDate(dd/MM/yyyy):");
        String bookBorrow=scanner.nextLine();
        SimpleDateFormat BorrowDate=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookBorrowDate=BorrowDate.parse(bookBorrow);
            setBookBorrowDate(bookBorrowDate);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap bookReturnDate(dd/MM/yyyy):");
        String bookReturn=scanner.nextLine();
        SimpleDateFormat ReturnDate=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date bookReturnDate=ReturnDate.parse(bookReturn);
            setBookReturnDate(bookReturnDate);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap department:");
        String department=scanner.nextLine();
        setDepartment(department);
        System.out.println("nhap teachingSubject");
        String teachingSubject=scanner.nextLine();
        setTeachingSubject(teachingSubject);
    }
    
}
