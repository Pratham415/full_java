//1. Write a Java program to get a number from the user and print whether it is positive or negative.
import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the any number : ");
		int num = sc.nextInt();

		if(num>0){
			System.out.println("The number is positive ! ");
		}
		else if(num<0){
			System.out.println("The number is negative !");

		}
		else{
			System.out.println(" Zero !!");
		}
	}
}