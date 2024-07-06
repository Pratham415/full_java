//Develop a program that takes a user's birthdate as input and calculates their current age.
import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the birth date year : ");
		int bod = sc.nextInt();
		int current = 2024;

		if(bod <= 2024){
			int age = 2000 - bod + 24;
			System.out.print("The age of person is : " + age);
		}else{
			System.out.print("invalid date  !");
		}

	}
}