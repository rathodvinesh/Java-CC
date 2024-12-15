package Day02;
//Method Overloading
public class Polymorphism {
	static int add(int a,int b ) {
		return a+b;
	}
	static int add(int a,int b,int c, int d ) {
		return a+b+c+d;
	}
	public static void main(String args[]) {
		System.out.println(add(11,12));
		System.out.println(add(11,12,34,45));
	}
	
	
	
	
	
	
	
	
	
	
	
	

}
