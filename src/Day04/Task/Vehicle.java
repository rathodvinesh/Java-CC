package Day04.Task;

public abstract class Vehicle {
	
	abstract void startEngine();
	abstract void stopEngine();
	 void showType(String type){
		System.out.println("Vehicle is a "+type); 
	 }
}
class car extends Vehicle {
	@Override
	void startEngine() {
		System.out.println(" carStart");
	}
	@Override
	 void stopEngine() {
		System.out.println("Stop");
	}
	
}
class Bike extends Vehicle {
	@Override
	void startEngine() {
		System.out.println("Start");
	}
	@Override
	 void stopEngine() {
		System.out.println("Stop");
	}
	
}
class Truck extends Vehicle {
	@Override
	void startEngine() {
		System.out.println("Start");
	}
	@Override
	 void stopEngine() {
		System.out.println("Stop");
	}
	
}
class main10{
	public static void main(String args[]) {
		car obj1 =new car();
		obj1.startEngine();
		obj1.stopEngine();
	}
}