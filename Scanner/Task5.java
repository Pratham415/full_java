//Implement a program to accept the user's weight and height, and then calculate their BMI
import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the weight(in kg) : ");
		float weight = sc.nextFloat();

		System.out.println("Enter the height : ");
		float height = sc.nextFloat();

		float BMI = weight/height;
		System.out.println("The BMI is : " + BMI);
	}
}