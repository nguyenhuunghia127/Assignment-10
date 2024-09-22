
package vesion3;

import java.util.ArrayList;


public class PersonList {
    private ArrayList<Person> person;

    public PersonList(ArrayList<Person> person) {
        this.person = person;
    }

    public PersonList() {
        this.person=new ArrayList<>();
    }
    public void addStudent(){
        Student student=new Student();
        student.addPerson();
        this.person.add(student);
        System.out.println("da them");
        
    }
    public void addTeacher(){
        Teacher teacher=new Teacher();
        teacher.addPerson();
        this.person.add(teacher);
        System.out.println("da them");
        
    }
    public void updatePerson(String id){
        Person update=findPersonById(id);
        update.updatePerson(id);
        System.out.println("da update");
      
    }
    public void deletePersonById(String id){
        Person delete=findPersonById(id);
        this.person.remove(delete);
        System.out.println("da delete");
    }
    Person findPersonById(String id){
        for(Person p:this.person){
            if(p.getId().equals(id)){
                return p;
            }
        }
        return null;
    }
    public void displayEveryone(){
        for(Person p:this.person){
            p.displayInfor();
        }
        
    }
    Student findTopStudent(){
        Student top= null;
        for(Person p:this.person){
            if(p instanceof Student){
                Student student=(Student)p;
                if(top==null||student.getGpa()>top.getGpa()){
                    top=student;
                }
                
            }
        }
        return top;
    }
    Teacher findTeacherByDepartment(String deparment){
        Teacher findteacher=null;
        for(Person p:this.person){
            if(p instanceof Teacher){
                Teacher teacher=(Teacher)p;
                if(teacher.getDepartment().equals(deparment)){
                return teacher;
                }
            }
        }
        return null;
    }
}
