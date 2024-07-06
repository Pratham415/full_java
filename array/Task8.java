//11. Write a Java program to reverse an array of integer values.
import java.util.Scanner;
public class Task8{
	public static void main(String[] args){
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		Reverse(arr);
		System.out.print("Array : ");
		Print(arr);

	}
	static void Reverse(int[] arr){
		int start=0;
		int end = arr.length-1;
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			start++;
			end--;
		}
	}
	static void Print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}