import java.util.Scanner;
public class Intro{
	public static void main(String[] args){
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array : ");
		for (int i =0;i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}

		for (int i= 0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}