package Day01;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number you want table of");
		int a = sc.nextInt();
		sc.close();
		
		for(int i=1;i<=10;i++) {
			System.out.println(a + " X " + i +" = "+ (a*i));
		}

	}

}
