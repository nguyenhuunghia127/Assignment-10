
package vesion5;

import java.util.ArrayList;
import java.util.Scanner;

public class Processor {
    public static void main(String[] args) {
        PersonList personlis=new PersonList(new ArrayList<Person>());
        Scanner scanner=new Scanner(System.in);
        String check;
        do{
            System.out.println("------menu------");
            System.out.println("1. Add new student");
            System.out.println("2. Add new teacher");
            System.out.println("3. Update person by id");
            System.out.println("4. Delete person by id");
            System.out.println("5. Display all students and teachers");
            System.out.println("6. Find the student with the highest GPA");
            System.out.println("7. Find teachers by department");
            System.out.println("8. Notify whether the book's return due date has arrived or not");
            System.out.println("nhap lua chon");
            int luachon=scanner.nextInt();
            scanner.nextLine();
            switch (luachon) {
                case 1->{
                    personlis.addStudent(); 
                    break;
                }
                case 2->{
                    personlis.addTeacher();
                    break;
                }
                case 3->{
                    System.out.println("nhap id update:");
                    String id=scanner.nextLine();
                    personlis.updatePerson(id);
                    break;
                }
                case 4->{
                    System.out.println("nhap id delete:");
                    String id=scanner.nextLine();
                    personlis.deletePersonById(id);
                    break;
                }
                case 5->{
                    personlis.displayEveryone();
                    break;
                }
                
                case 6->{
                    Student top=personlis.findTopStudent();
                    top.displayInfor();
                    break;
                }
                case 7->{
                    System.out.println("nhap department:");
                    String de=scanner.nextLine();
                    Teacher teacher=personlis.findTeacherByDepartment(de);
                }
                case 8->{
                    personlis.checkBookBorrowing();
                }
                default ->{
                    System.out.println("loi");
                }
            }
            System.out.println("nhan y de tiep tuc");
            check=scanner.nextLine();
        }while(check.equals("y"));
    }
}
