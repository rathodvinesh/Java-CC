package Day03;

class calc {
	private int a;
	private int b;

	int set_a(int a) {
		this.a = a;
		return a;
	}

	int set_b(int b) {
		this.b = b;
		return b;
	}

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int mul() {
		return a * b;
	}

	int div() {
		return a / b;
	}
}

class basicCal extends calc {

	int a;

	int sq() {
		return a * a;
	}

}

class ScientificCalcu extends basicCal {

	public int a;

	int fact() {
		int facto = 1;
		for (int i = 1; i < a; i++) {
			facto *= i;
		}
		return facto;
	}

}

public class Caclulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ScientificCalcu obj = new ScientificCalcu();
		basicCal obj1 = new basicCal();
//		obj.set_a(5);
//		obj.a=7;
//		System.out.println(obj.fact());
////		obj.set_a(5);
//		
//		obj1.a=5;
//		System.out.println(obj1.sq());

		obj.set_a(5);
		obj.set_b(7);
		System.out.println(obj.add());
		System.out.println(obj.sub());
	}

}
