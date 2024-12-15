package Day01;
import java.util.Scanner;
public class InputAndArithmaticops {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First Number:");
		float num1 = sc.nextFloat();
		System.out.println("Enter Second Number:");
		float num2 = sc.nextFloat();
		sc.close();
		
		System.out.println("The multiplication of number is"+ num1*num2);
		System.out.println("The division of number is "+ num1/num2);
		System.out.println("The addition of number is "+ (num1+num2));
		System.out.println("The subtraction of number is "+ (num1-num2));
		
		
		
	}

}
