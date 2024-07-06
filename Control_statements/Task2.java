
import java.util.Scanner;
public class Task2{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number a : ");
		float a = sc.nextFloat();

		System.out.println("Enter the number b : ");
		float b = sc.nextFloat();

		System.out.println("1----------add");
		System.out.println("2----------sub");
		System.out.println("3----------multi");
		System.out.println("4----------divide");
		System.out.println("5----------exit");
		System.out.print("Enter the choice : ");
		int choice = sc.nextInt();
		switch(choice){
		case 1: float add = add(a,b);
				System.out.println("Add : "+ add);
			break;
		case 2: float sub = sub(a,b);
				System.out.println("sub : "+ sub);
			break;
		case 3: float multi = multi(a,b);
				System.out.println("multi : "+ multi);
			break;
		case 4: float div = div(a,b);
				System.out.println("divide : "+ div);
			break;
		case 5 : System.out.println("exit !!");
			break;
		}
	}
	static float add(float a,float b){
		return a+b;
	}
	static float sub(float a,float b){
		return a-b;
	}
	static float multi(float a,float b){
		return a*b;
	}
	static float div(float a,float b){
		return a/b;
	}
	
}