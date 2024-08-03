// 4. Constructor Chaining with Single Inheritance:
//    - Problem Statement: Design a single inheritance relationship with classes 'Appliance' and 'WashingMachine'. The 'Appliance' class should have attributes 'power' and 'brand', and a constructor to initialize these attributes. The 'WashingMachine' class should add 'capacity' and utilize constructor chaining to initialize all attributes using 'this' and 'super'.

class Appliance{
    public int power;
    public String brand;

    public Appliance(int power,String brand){
        this.power = power;
        this.brand = brand;
    }
    public void displayInfo(){
        System.out.println("The power of the washingmachine : "  + power);
        System.out.println("The brand of the washingmachine : "+ brand);
    }
}
class WashingMachine extends Appliance{
    public int capacity;

   
    public WashingMachine(int power,String brand,int capacity){
        super( power, brand);
        this.capacity = capacity;
    }
    public void display(){
       super.displayInfo();
       System.out.println("The capacity of the machine : " + capacity);

    }
}
public class Task4 {
    public static void main(String[] args) {
        WashingMachine A123 = new WashingMachine(300,"haier", 30);
        
        A123.display();
    }
}
