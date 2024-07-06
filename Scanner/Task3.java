//3. Build a Java application to collect the user's contact information (name, email, and phone number) and //display it back to them.
import java.util.Scanner;
public class Task3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the name  : ");
		String name = sc.nextLine();

		System.out.println("Enter the email : ");
		String email = sc.nextLine();

		System.out.println("Enetr the phone number  : ");
		double phonenum = sc.nextDouble();

		System.out.println("Name : " + name);
		System.out.println("email : " + email);
		System.out.println("Phone  number : " + phonenum);
	}
}