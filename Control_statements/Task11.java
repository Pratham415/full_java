//15. Write a Java program that displays the sum of n odd natural numbers.
//
//Test Data
//Input number of terms is: 5
//Expected Output :
//
//The odd numbers are :                                                            
//1                                                                                
//3                                                                                
//5                                                                                
//7                                                                                
//9                                                                                
//The Sum of odd Natural Number upto 5 terms is: 25
import java.util.Scanner;
public class Task11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of n odd term :  ");
		int n = sc.nextInt();
		int sum = 0;
		for(int i=1;i<=n*2;i++){
			if(i%2!=0){
				System.out.println(i);
				sum = sum + i;
			}
		}
		System.out.print("The sum of odd number is : " + sum);
	}


}