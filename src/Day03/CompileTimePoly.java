package Day03;

public class CompileTimePoly {

	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}

	static String strConcat(String a, String b) {
		String res = a + " " + b;
		return res;
	}

	public static void main(String[] args) {
//		add(1, 2);
		System.out.println(add(1, 2));
		System.out.println(add(1, 2, 3));
		System.out.println(strConcat("Vinesh", "Rathod"));
	}

}
