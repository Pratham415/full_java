class Address{
    private String city;
    private String state;

    public Address(String city, String state){
        this.city = city;
        this.state = state;
    }

    public void displayInfo(){
        System.out.println("The city : "+ city);
        System.out.println("The state : " + state);
    }

}
class Employees{

    private int id;
    private String name;
    private Address address;
    private int salary;
    private String description;

    public Employees(int id, String name ,Address address,int salary,String description){
        this.id = id;
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.description = description;
    }

    public void displayEmployeesDetail(){
        System.out.println("The employees id :" + id);
        System.out.println("The name :" + name);
        address.displayInfo();
        System.out.println("The salary : " + salary);
        System.out.println("The description : " + description);
    } 
}
public class Aggregation{
    public static void main(String[] args) {
        Address address = new Address("gandhinagar", "gujarat");
        Employees pratham = new Employees(23,"Pratham patel",address,1000000,"senior manager");

        pratham.displayEmployeesDetail();
    }
}