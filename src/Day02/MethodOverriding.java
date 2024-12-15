package Day02;

class abc{
	public void display() {
		System.out.println("I am a Parent");
	}
}

public class MethodOverriding extends abc{
	MethodOverriding(){
		super();
	}
	@Override
	public void display() {
		super.display();
		System.out.println("I am Child");
	}
	public static void main(String[] args) {
		MethodOverriding obj = new MethodOverriding();
		obj.display();
	}

}
