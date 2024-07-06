//8. Write a Java program that requires the user to enter a single character from the alphabet. 
//Print Vowel or Consonant, depending on user input.
//If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.
//Test Data
//Input an alphabet: p
//Expected Output :
//Input letter is Consonant
import java.util.Scanner;
public class Task7{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the single character : ");
		String input = sc.next();
		char ch = input.charAt(0);
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')){
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				System.out.print("The character is vowel ");
			}
			else{
				System.out.print("The charcter is consonant !");
			}
		}
	}
}