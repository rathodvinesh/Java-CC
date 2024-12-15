package Day01;
import java.util.Scanner;
public class Divisibilityby3_5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		
		if(num%3==0) {
			System.out.println("Number is divisible by 3");
		}
		else if(num%5==0) {
			System.out.println("Number is divisible by 5");
		}
		else if(num%5==0 && num%3==0) {
			System.out.println("Number is divisible by 5 and 3");
		}
		

	}

}
