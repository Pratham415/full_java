import java.util.Scanner;
public class Sum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number of a : ");
		int a = sc.nextInt();

		System.out.println("enter the number of b : ");
		int b = sc.nextInt();

		System.out.println("sum = "+(a+b));

		sc.close();
	}
}