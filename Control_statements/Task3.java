//3. Write a Java program that takes three numbers from the user and prints the greatest number.
//
//Test Data
//Input the 1st number: 25
//Input the 2nd number: 78
//Input the 3rd number: 87
//Expected Output :
//The greatest: 87
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number a : ");
		int a = sc.nextInt();
		System.out.print("Enter the number b : ");
		int b = sc.nextInt();
		System.out.print("Enter the number c : ");
		int c = sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.print("The greatest :" + a);
			}
			else{
				System.out.print("The greatest : "+c);
			}
		}
		else{
			if(b>c){
				System.out.print("The greatest : "+b);
			}
			else{
				System.out.print("The greatest : "+c);
			}
		}
	}
}