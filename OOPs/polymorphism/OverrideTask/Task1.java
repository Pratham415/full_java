// 1. Problem: Create a class called `Calculator` that demonstrates method overloading for basic arithmetic operations (addition, subtraction, multiplication, and division).
//    - Example: Implement the `add`, `subtract`, `multiply`, and `divide` methods in the `Calculator` class, each overloaded with different parameter lists to perform the respective operations.
class Calculator{
    public int add(int a,int b){
        return a+b;
    }

    public void sub(int a,int b){
        System.out.println("The subtraction of a and b  =" + (a - b));
    }
}
class scintificCal extends Calculator{
   
    public int add(int a,int b){
        return a+b;
    }
}
public class Task1 {
    public static void main(String[] args) {
        scintificCal sc = new scintificCal();

        int a = sc.add(13,15);
        System.out.println(a);
    }
}
