package Student1;

public class Student {
    String name;
    int id;


    public Student(String name,int id){
        this.name=name;
        this.id=id;

    }

    Student(Student s) {
        name = s.name;
        id = s.id;

    }
    void displayInfo(){
        System.out.println("Name"+name);
        System.out.println("ID"+id);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}
