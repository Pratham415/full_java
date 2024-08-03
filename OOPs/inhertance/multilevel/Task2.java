// 2. Multilevel Inheritance Problem:
//    - Problem Statement: Create a multilevel inheritance structure with three classes: 'Animal' (base class), 'Mammal' (derived class), and 'Dog' (further derived class). The 'Animal' class should have an attribute 'species' and a method 'makeSound()'. The 'Mammal' class should add an attribute 'hasFur' and override 'makeSound()'. The 'Dog' class should add an attribute 'breed' and further override 'makeSound()' to specify the dog's sound. Use constructors to initialize attributes and ensure proper use of 'this' and 'super'.
class Animal{
    public String species;
    
    public Animal(String species){
        this.species = species;
    }
    public void makeSound(){
        System.out.println("The Animal make a sound and the species is" + species);
    }
}
class Mammal extends Animal{
    public String hasFur;

    public Mammal(String species,String hasfur){
        super(species);
        this.hasFur = hasfur;
    }
    public void makeSound(){
        System.out.println("The mammal make a sound ");
    }
}
class Dog extends Mammal{
    public String breed;

    public Dog(String species,String hasfur,String breed){
        super(species,hasfur);
        this.breed = breed;
    }
    public void makeSound(){
        System.out.println("The dog make a sound and the breed is" + breed);
    }
}
public class Task2 {
    public static void main(String[] args) {
        Dog z = new Dog("Dog", "no", "Rotwiller");
        z.makeSound(); 
    }
}
