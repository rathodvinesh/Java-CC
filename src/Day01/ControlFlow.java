package Day01;
import java.util.Scanner;
public class ControlFlow {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		
		/*
		 * if(condition){
		 * 	 Code;
		 * }
		 */
		if(a==0) {
			System.out.println("The number is zero");
		}
		else if(a%2==0) {
				System.out.println("The number is even");
			}
			else System.out.println("The number is odd");
		}
	}

