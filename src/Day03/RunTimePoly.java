package Day03;

class Parent {

	Parent() {
		System.out.println("In Parent Constructor");
	}

	void display() {
		System.out.println("I am in Parent");
	}
}

class Child extends Parent {

	Child() {
		super();
//		super.display();
		System.out.println("In child constructor");
	}

	@Override
	void display() {
		super.display();
		System.out.println("I am in Child");
	}
}

public class RunTimePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj = new Child();
		obj.display();

	}

}
