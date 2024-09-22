
package vesion3;

import java.util.ArrayList;
import java.util.Scanner;


public class Processor {
    public static void main(String[] args) {
        PersonList personlist=new PersonList(new ArrayList<Person>());
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
            System.out.println("nhap lua chon");
            int luachon=scanner.nextInt();
            scanner.nextLine();
            switch (luachon) {
                case 1->{
                    personlist.addStudent();
                    break;
                }
                case 2->{
                    personlist.addTeacher();
                    break;
                }
                case 3->{
                    System.out.println("nhap id update :");
                    String update=scanner.nextLine();
                    personlist.updatePerson(update);
                    break;
                }
                case 4->{
                    System.out.println("nhap id delete :");
                    String delete=scanner.nextLine();
                    personlist.deletePersonById(delete);
                    break;
                }
                case 5->{
                    personlist.displayEveryone();
                    break;
                }
                case 6->{
                    Student student=personlist.findTopStudent();
                    student.displayInfor();
                }
                case 7->{
                    System.out.println("nhap department :");
                    String de=scanner.nextLine();
                    Teacher teacher=personlist.findTeacherByDepartment(de);
                    teacher.displayInfor();
                }  
                default->{
                    System.out.println("loi");
                }
                   
            }
            System.out.println("nhan y de tiep tuc");
            check=scanner.nextLine();
        }while(check.equals("y"));
    }
}
