public class CVRT{
    public static void main(String[] args) {
          new A().get().message();
          new B().get().message();  
    }
}
class A{
    A get(){
        return this;
    }
    void message(){
        System.out.print(this.getClass().getSimpleName());
        System.out.println(" : This is covariant return type");
    }
}
class B extends A{
   
    B get(){
        return this;
    }
    void message(){
        System.out.print(this.getClass().getSimpleName());
        System.out.println(": This is Covariant return Type ");
    }
}