//5. Write a Java program that takes a number from the user and generates an integer between 1 and 7. It displays the weekday name.
//
//Test Data
//Input number: 3
//Expected Output :
//Wednesday
import java.util.Random;
import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		int min = 1;
		int max = 7;
		int ran = (int)(Math.random()*(max+min));
		System.out.println("Random number : "+ran);
		if(ran==1){
			System.out.print("Monday !");
		}
		else if(ran==2){
			System.out.print("Tuesday !");
		}
		else if(ran==3){
			System.out.print("wednesday !");
		}
		else if(ran==4){
			System.out.print("Thursday !");
		}
		else if(ran==5){
			System.out.print("friday !");
		}
		else if(ran==6){
			System.out.print("saturday !");
		}
		else{
			System.out.print("Sunday !");
		}
	}
}