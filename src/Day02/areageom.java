package Day02;
import java.util.Scanner;
class AreaofCircle{
	 void area() {
		 Scanner sc = new Scanner(System.in);
			System.out.println("Enter Radius");
			double  rad = sc.nextDouble();
			sc.close();
			
			double arr_circle = Math.PI* Math.pow(rad,2);
			System.out.println("The area of circle is " + arr_circle);
	 }		
}

class AreaofRectangle extends AreaofCircle{
	
	@Override
	void area() {
		super.area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		double  length = sc.nextDouble();

		System.out.println("Enter breadth");
		double  breadth = sc.nextDouble();
		sc.close();
		
		double arr_rectangle= length*breadth;
		System.out.println("The area of rectangle is" + arr_rectangle);
	}
}
class Areaoftriangle extends AreaofRectangle{
	
	@Override
	void area() {
		super.area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter base");
		double  base = sc.nextDouble();

		System.out.println("Enter height");
		double  height = sc.nextDouble();
		sc.close();
		
		double arr_triangle= 0.5*base*height;
		System.out.println("The area of triangle is" + arr_triangle);
	}
}

public class areageom extends Areaoftriangle {
	public static void main(String[] args) {
		areageom obj = new areageom();
		obj.area();

	}

}
