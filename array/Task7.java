import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		int[] arr = new int[3];

		Task7 t = new Task7();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("Enter the number to be delete : ");
		System.out.print("Enter the array element : ");
		for(int i = 0;i<arr.length;i++){
			arr[i] = sc.nextInt();
		}
		t.Delete(arr,n);
		for(int i = 0;i<arr.length-1;i++){
			System.out.print(arr[i] + " ");
		}
	}
	public void Delete(int[] arr,int n){

		for(int i=0;i<arr.length;i++){
			 	if(arr[i]==n){
			 		for(int j=i;j<arr.length-1;j++){
			 			arr[j] = arr[j+1];

			 		}
			 	}
		}
	}
}