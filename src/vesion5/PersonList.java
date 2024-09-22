
package vesion5;

import java.util.ArrayList;

public class PersonList {
    private ArrayList <Person> persons;

    public PersonList(ArrayList<Person> persons) {
        this.persons = persons;
    }

    public PersonList() {
        this.persons=new ArrayList<>();
    }
    void addStudent(){
        Student student=new Student();
        student.addPerson();
        this.persons.add(student);
        System.out.println("da add student");
        
    }   
    void addTeacher(){
        Teacher teacher=new Teacher();
        teacher.addPerson();
        this.persons.add(teacher);
        System.out.println("da add teacher");
        
    }
    void updatePerson(String id){
        Person update=findPersonById(id);
        update.updatePerson(id);
        System.out.println("da update");
        
    }
    void deletePersonById(String id){
        Person delete=findPersonById(id);
        this.persons.remove(delete);
        System.out.println("da delete");
        
    }
    Person findPersonById(String id){
        for(Person p:this.persons){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
        
    }
    Student displayEveryone(){
        for(Person p:this.persons){
            p.displayInfor();
        }   
        return null;
    }
    public Student findTopStudent(){
        Student top=null;
        for(Person p:this.persons){
            if(p instanceof Student){
                Student student=(Student)p;
                if(top==null||student.getGpa()>top.getGpa()){
                    top=student;
                }
            }    
        }
        return top;
    }
    public Teacher findTeacherByDepartment(String deparment){
        Teacher top=null;
        for(Person p:this.persons){
            if(p instanceof Teacher){
                Teacher teacher=(Teacher)p;
                if(teacher.getDepartment().equals(teacher)){
                    return teacher;
                }
            }
        }
        return top;
    }
    void checkBookBorrowing(){
        for(Person p:this.persons){
            if(!p.isBookOverdue()){
                System.out.println("No overdue");
            }
            else{
                System.out.println("Overdue");
            }
        }
    }

    
}
