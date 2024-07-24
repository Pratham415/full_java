import java.util.Scanner;
class Employee{
    private int empId;
    private String name;
    private float salary;

    void scanDetails(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the employee ID : ");
        empId = sc.nextInt();

        sc.nextLine();
        System.out.print("Enter the name of employee : ");
        name = sc.nextLine();

        System.out.print("Enter the salary : ");
        salary = sc.nextFloat();
    }

    void printDetails(){
        System.out.println("empId : " + empId);
        System.out.println("Name : " + name);
        // System.out.println("salary : " + salary);
        System.out.printf("salary : %f",salary);
    }
}
public class Basic {
    public static void main(String[] args){
        Employee e = new Employee();

        e.scanDetails();
        e.printDetails();
    }    
}
