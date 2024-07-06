//4. Write a Java program to calculate the average value of array elements.
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			sum = sum + arr[i];
		}
		float avg = sum/size;
		System.out.println("The avg of array :" + avg);
		
	}
}