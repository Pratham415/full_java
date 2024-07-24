import java.util.Scanner;
public class Task11{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number  n : ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		for(int i = 0;i<n;i++){
			int c = 0;
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c; 
		}
		
	}
}