//6. Write a Java program that reads two floating-point numbers and tests whether they are the same up to //three decimal places.
//
//Test Data
//Input floating-point number: 25.586
//Input floating-point another number: 25.589
//Expected Output :
//They are different
import java.util.Scanner;
public class Task5{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the floating number1 upto three decimal  : ");
		float a = sc.nextFloat();
		System.out.print("Enter the floating number2 upto three decimal : ");
		float b = sc.nextFloat();
		EqualUpToThreeDecimals(a,b);
	}
	static float EqualUpToThreeDecimals(float a,float b){
		int first = (int)(a*1000);
		int sec = (int)(b*1000);
		if(first==sec){
			System.out.print("They are same ");
		}
		else{
			System.out.print("They are different");
		}
		return 0;
	}
}