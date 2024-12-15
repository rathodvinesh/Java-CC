package Day02;

import java.util.Scanner;

public class MethodOverloading_2 {
	
	static int add(int a,int b) {
		return a+b;
	}
	static int add(int a,int b,int c) {
		return a+b+c;
	}
	
	static int add(int a,int b,int c, int d ) {
		return a+b+c+d;
	}
	static int multiply(int a,int b ) {
		return a*b;
	}
	static int multiply(int a,int b,int c) {
		return a+b+c;
	}
	static int multiply(int a,int b,int c,int d) {
		return a+b+c+d;
	}
	static int divide(int a,int b ) {
		return a/b;
	}
	static int divide(int a,int b,int c) {
		return (a/b)/c;
	}
	static int divide(int a,int b,int c,int d) {
		return ((a/b)/c)/d;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	}

}
