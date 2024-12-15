package Day03;

import java.util.Scanner;

abstract class ShapeDerived {
	abstract void Area();

	abstract void Perimeter();

	abstract void inp();
}

class circle extends ShapeDerived {
	private double radius;

	public circle(double radius) {
		this.radius = radius;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	void inp() {
		System.out.println("The radius of circle");
		radius = sc.nextDouble();
	}

	@Override
	void Area() {
		System.out.println("Area of Circle: " + Math.PI * radius * radius);
	}

	@Override
	void Perimeter() {
		System.out.println("Perimeter of Circle: " + Math.PI * 2 * radius);
	}

}

class Rectangle extends ShapeDerived {
	private double length;
	private double breadth;

	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	void inp() {
		System.out.println("The l and b for rectangle");
		length = sc.nextDouble();
		breadth = sc.nextDouble();
	}

	@Override
	void Area() {
		System.out.println("Area of Rectangle: " + length * breadth);
	}

	@Override
	void Perimeter() {
		System.out.println("Perimeter of Rectangle: " + (2 * length + 2 * breadth));
	}
}

class Tri extends ShapeDerived {
	private double base;
	private double height;

	public Tri(double base, double height) {
		this.base = base;
		this.height = height;
	}

	Scanner sc = new Scanner(System.in);

	@Override
	void inp() {
		System.out.println("The l and b for rectangle");
		base = sc.nextDouble();
		height = sc.nextDouble();
	}

	@Override
	void Area() {
		System.out.println("Area of Triangle: " + 0.5 * base * height);
	}

	@Override
	void Perimeter() {
		System.out.println("Perimeter of Triangle: Not Implemented (requires all sides)");
	}
}

public class Cir {
	public static void main(String[] args) {

		ShapeDerived rectangle = new Rectangle(5, 7);
		rectangle.Area();
		rectangle.Perimeter();

		ShapeDerived circle = new circle(3.5);
		circle.Area();
		circle.Perimeter();

		ShapeDerived triangle = new Tri(4.0, 3.0);
		triangle.Area();
		triangle.Perimeter();
	}
}
