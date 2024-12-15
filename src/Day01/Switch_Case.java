package Day01;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		sc.close();
		
		switch(num) {
		case 1:{
			System.out.println("Monday");
			break;
		}
		case 2:{
			System.out.println("Tuesday");
		}
		case 3:{
			System.out.println("Wednesday");
		}
		case 4:{
			System.out.println("Friday");
		}
		default:System.out.println("Invalid day");
		}
	
	}
}
