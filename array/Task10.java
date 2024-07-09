// maximum and minimum of array 
import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the element of array : ");
		for(int i=0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();	
		int max = arr[0];
		for(int i = 0;i<arr.length;i++){
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("The maximum element of array : " + max);
	}
}