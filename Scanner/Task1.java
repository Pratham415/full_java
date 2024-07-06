//1. Write a Java program to take the user's name as input and display a personalized greeting message.
import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the name : ");
		String name = sc.nextLine();

		System.out.println("Congrats " + name + " for a new car !");
	}
}
//Methods used in Scanner class: 
//1. next(): Used to scan a word from the user
//2. nextLine(): used to scan the whole line from the user
//3. nextInt(): used to scan integer data from the user
//4. nextFloat(): used to scan float data from the user
//5. nextDouble(): used to scan double data from the user
//6. nextBoolean(): used to scan boolean data from the user
//7. nextByte(): used to scan byte data from the user
