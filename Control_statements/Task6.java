//7. Write a Java program to find the number of days in a month.
//
//Test Data
//Input a month number: 2
//Input a year: 2016
//Expected Output :
//February 2016 has 29 days
import java.util.Scanner;
public class Task6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the month number : ");
		int month = sc.nextInt();
		System.out.print("Enter the year : ");
		int year = sc.nextInt();
		if(month==2){
			if(year%400==0 || year%4 == 0){
				System.out.print("February " + year + " has 29 days");
			}
			else{
				System.out.print("February " + year + " has 28 days");
			}
		}
		else{
			if(month==1){
				System.out.print("January " + year + " has 31 days");
			}
			else if(month==3){
				System.out.print("March" + year + " has 31 days");
			}
			else if(month==4){
				System.out.print("April" + year + " has 30 days");
			}
			else if(month==5){
				System.out.print("May" + year + " has 31 days");
			}
			else if(month==6){
				System.out.print("June" + year + " has 30 days");
			}
			else if(month==7){
				System.out.print("July" + year + " has 31 days");
			}
			else if(month==8){
				System.out.print("August" + year + " has 31 days");
			}
			else if(month==9){
				System.out.print("september" + year + " has 30 days");
			}
			else if(month==10){
				System.out.print("October" + year + " has 31 days");
			}
			else if(month==11){
				System.out.print("November" + year + " has 30 days");
			}
			else if(month==12){
				System.out.print("December" + year + " has 31 days");
			}
			else{
				System.out.print("Invalid Month !!");
			}
		}
	}
}