//14. Write a Java program to display the multiplication table of a given integer.
import java.util.Scanner;
public class Task10{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number that you want to display table : ");
		int n = sc.nextInt();
		for(int i=1;i<=10;i++){
			System.out.printf("%d * %d = %d",n,i,n*i);
			System.out.println();
		}
	}
}