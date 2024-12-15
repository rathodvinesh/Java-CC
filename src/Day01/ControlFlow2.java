package Day01;
import java.util.Scanner;

public class ControlFlow2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number between 1 to 7");
		int a = sc.nextInt();
		sc.close();
		if(a>=1 && a<=7) {
			System.out.println("Number is between 1 to 7");
		}
		else System.out.println("Number is not between 1 to 7"); 
		
		
		if(a==1) {
			System.out.println("Monday"); 
		}
		else if(a==2) {
			System.out.println("Tuesday"); 
		}
		else if(a==3) {
			System.out.println("Wednesday"); 
		}
		else if(a==4) {
			System.out.println("Thursday"); 
		}
		else if(a==5) {
			System.out.println("Friday");
		}
		else if(a==6) {
			System.out.println("Saturday"); 
		}
		else if(a==7) {
			System.out.println("Sunday"); 
		}
	}
}
