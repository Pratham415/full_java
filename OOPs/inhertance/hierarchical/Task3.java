// 3. Hierarchical Inheritance Problem:
//    - Problem Statement: Implement a hierarchical inheritance setup with a base class 'Person' and two derived classes 'Student' and 'Teacher'. The 'Person' class should have attributes 'name' and 'age', and a method 'introduce()'. The 'Student' class should add an attribute 'grade', while the 'Teacher' class should add 'subject'. Both derived classes should override 'introduce()' to include their specific details. Utilize constructors and the 'super' keyword appropriately.
class Person{
    public String name;
    public int age;

    public Person(String name,int age){
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println("The name of person : " + name);
        System.out.println("The age of person : " + age);
    }
}
class Student extends Person{
    public String grade;
    public Student(String name,int age,String grade){
        super(name, age);
        this.grade = grade;
    }

    public void displayStudentInfo(){
        super.introduce();
        System.out.println("The grade of student : " +grade );
    }
}
class Teacher extends Person{
    public String subject;

    public Teacher(String name ,int age ,String subject){
        super(name, age);
        this.subject = subject;
    }

    public void displayTeacherInfo(){
        super.introduce();
        System.out.println("The teacher teaching "+subject + " subject");
    }
}
public class Task3 {
    public static void main(String[] args) {
        Student student = new Student("pratham" ,20,"A++");
    student.displayStudentInfo();
    }
}
