import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		char[] arr = new char[10];
		int[] arr1 = new int[10];
		Scanner sc = new Scanner(System.in);
		Task6 t = new Task6();
	
		System.out.println("1--------sort int array");
		System.out.println("2--------sort char array");
		System.out.println("3--------exit");
		System.out.print("Enter the choice  : ");
		int choice = sc.nextInt();
		switch(choice){
		case 1: System.out.print("Enter the charater array : ");
				for(int i=0;i<arr.length;i++){
					arr[i] = sc.next().charAt(0);
				}
				t.sortedstringAarray(arr);
				for(int i=0;i<arr.length;i++){
					System.out.print(arr[i] + " ");
				}
				break;
		case 2:System.out.print("Enter the integer array : ");
				for(int i=0;i<arr1.length;i++){
					arr1[i] = sc.nextInt();
				}	
				t.sortedintAarray(arr1);
				for(int i=0;i<arr1.length;i++){
					System.out.print(arr1[i] + " ");
				}
				break;
		case 3: System.exit(0);

		}
	}
	public void sortedstringAarray(char[] arr){
		for(int i=0;i<arr.length-1;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[i] > arr[j]){
					char temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public void sortedintAarray(int[] arr1){
		for(int i=0;i<arr1.length;i++){
			for(int j=i+1;j<arr1.length;j++){
				if(arr1[i]>arr1[j]){
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}
	}
}