package Day01;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a number 1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter a number 2");
		int num2 = sc.nextInt();
		
		System.out.print("Enter a choice \n 1.Multiplication \n 2.Divison \n 3.Addition \n 4.Subtraction");
		int choice = sc.nextInt();
		
		sc.close();
		
		switch(choice){
			case 1: {
				System.out.println("The multiplication is"+ (num1*num2));
				break;
			}
			case 2: {
				System.out.println("The divison is"+ (num1/num2));
				break;
			}
			case 3: {
				System.out.println("The addition is"+ (num1+num2));
				break;
			}
			case 4: {
				System.out.println("The subtraction is"+ (num1-num2));
				break;
			}
		}
	}

}
