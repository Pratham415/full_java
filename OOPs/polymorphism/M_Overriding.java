class Animal {
    protected void eat() {
        System.out.println("Animal is eating!");
    }
}

class Dog extends Animal {
    @Override   // this annotation makes sure that your method is overriding from its super class
    protected void eat() {
        System.out.println("Dog is eating!");
    }
}

class Cat extends Animal {
    protected void eat() {
        System.out.println("Cat is eating!");
    }
}

public class M_Overriding {
    public static void main(String[] args) {
        Dog d = new Dog();
        Cat c = new Cat();
        
        d.eat();
        c.eat();
    }
}
