
package vesion3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Teacher extends Person{
    private String department;
    private String teachingSubject;

    public Teacher(String department, String teachingSubject, String id, String fullname, Date dateOfBirth) {
        super(id, fullname, dateOfBirth);
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
        System.out.println("id :"+this.getId());
        System.out.println("full name :"+this.getFullname());
        System.out.println("date of birth :"+new SimpleDateFormat("dd/MM/yyyy").format(this.getDateOfBirth()));
        System.out.println("department :"+this.getDepartment());
        System.out.println("teachingSubject :"+this.getTeachingSubject());
    }

    @Override
    public void updatePerson(String id) {
        if(!this.getId().equals(id)){
            System.out.println("loi");
            return;
        }
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thong tin update teacher");
        System.out.println("nhap new full name :");
        String newfullname=scanner.nextLine();
        setFullname(newfullname);
        
        System.out.println("nhap new date dd/MM/yyyy :");
        String date=scanner.nextLine();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth=format.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap new department :");
        String newdepartment=scanner.nextLine();
        setDepartment(newdepartment);
        
        System.out.println("nhap teachingSubject :");
        String newteachingSubject=scanner.nextLine();
        setTeachingSubject(newteachingSubject);
        System.out.println("da them");
        
       
    }

    @Override
    public void addPerson() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("nhap thong tin teacher");
        System.out.println("nhap id :");
        String id=scanner.nextLine();
        setId(id);
        
        System.out.println("nhap full name :");
        String fullname=scanner.nextLine();
        setFullname(fullname);
        
        System.out.println("nhap date dd/MM/yyyy :");
        String date=scanner.nextLine();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyy");
        try {
            Date dateOfBirth=format.parse(date);
            setDateOfBirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println("loi");
        }
        System.out.println("nhap department :");
        String department=scanner.nextLine();
        setDepartment(department);
        
        System.out.println("nhap teachingSubject :");
        String teachingSubject=scanner.nextLine();
        setTeachingSubject(teachingSubject);
        System.out.println("da them");
        
    }

    

    
    
}
