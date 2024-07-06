//2. Write a Java program to sum values of an array.
import java.util.Scanner;
public class Task1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int arr1[] = new int[3];
		for(int i=0;i<arr1.length;i++){
			arr1[i] = sc.nextInt(); 
		}
		int sum = 0;
		for(int i=0;i<arr1.length;i++){
			 sum = sum + arr1[i];
		} 
		System.out.println("Sum of array : "+ sum);

	}
}