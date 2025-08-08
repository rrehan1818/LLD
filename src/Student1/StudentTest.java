package Student1;

public class StudentTest {
    public static void main  (String[] args){
        Student s1=new Student("rehan",23);
        System.out.println("Student one details:" +s1);
        Student s2 = new Student(s1);
        System.out.println("student two details:" + s2);
    }

}
