package Day03;

abstract class PatternPrinter {
	protected int rows;

	public PatternPrinter(int rows) {
		this.rows = rows;
	}

	public void setRows(int rows) {
		this.rows = rows;
	}

	public int getRows() {
		return rows;
	}

	public abstract void printPattern();
}

class Triangle extends PatternPrinter {
	public Triangle(int rows) {
		super(rows);
	}

	@Override
	public void printPattern() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class TriangleRev extends Triangle {
	public TriangleRev(int rows) {
		super(rows);
		super.printPattern();
	}

	@Override
	public void printPattern() {
		for (int i = rows; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class SquarePattern extends TriangleRev {
	public SquarePattern(int rows) {
		super(rows);
		super.printPattern();
	}

	@Override
	public void printPattern() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= rows; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}

class NumberTrianglePattern extends SquarePattern {
	public NumberTrianglePattern(int rows) {
		super(rows);
		super.printPattern();
	}

	@Override
	public void printPattern() {
		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}

public class Hello {
	public static void main(String[] args) {
		int rows = 5;

		NumberTrianglePattern obj = new NumberTrianglePattern(rows);
		obj.printPattern();

//		PatternPrinter obj1 = new PatternPrinter();

//        System.out.println("Triangle Pattern:");
//        PatternPrinter triangle = new Triangle(rows);
//        triangle.printPattern();
//        
//        System.out.println("Reverse Triangle Pattern:");
//        PatternPrinter triangleRev = new TriangleRev(rows);
//        triangleRev.printPattern();
//
//        System.out.println("\nSquare Pattern:");
//        PatternPrinter square = new SquarePattern(rows);
//        square.printPattern();
//
//        System.out.println("\nNumber Triangle Pattern:");
//        PatternPrinter numberTriangle = new NumberTrianglePattern(rows);
//        numberTriangle.printPattern();
	}
}
