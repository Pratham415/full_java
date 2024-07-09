//12. Write a Java program to find duplicate values in an array of integer values.
import java.util.Scanner;
public class Task9{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		System.out.print("Enter the element of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("The orig array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.print("The Duplicate element of array : " );
		Duplicate(arr);

	}
	static void Duplicate(int[] arr){
		for(int i=0;i<arr.length;i++){
			for(int j = i+1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					System.out.print(arr[i] + " ");
				}
			}
		}
	}
			
	static void Print(int[] arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
		}
	}
}