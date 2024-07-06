import java.util.Scanner;
public class Task4{
	public static void main(String[] args){
		int[] arr = new int[3];
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array : ");
		for(int a=0;a<arr.length;a++){
			arr[a] = sc.nextInt();
		}
		for(int b=0;b<arr.length;b++){
			System.out.print(arr[b] + " ");
		}
		sortarr(arr);
		System.out.print("sorted array : ");
		for(int c=0;c<arr.length;c++){
			System.out.print(arr[c] + " ");
		}
	}
	public static int sortarr(int[] arr){
		int n = arr.length;
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		return 0;
	}
}