package Day02;

import java.util.Scanner;

class base1{
	void input() {
		
	}
	void output() {
		
	}
}
class cir2 extends base1{
	int r;
	
	@Override
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius");
		r = sc.nextInt();
	}
	@Override
	void output() {
		System.out.println(3.14*r*r);	
	}
}

class rect extends cir2{
	@Override
	void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		int l = sc.nextInt();
		System.out.println("Enter breadth");
		int b = sc.nextInt();
	}
	
}
public class Areaoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
