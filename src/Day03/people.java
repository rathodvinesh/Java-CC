package Day03;

class zxy{
	protected int d = 30;
	private int g = 30;

}

class abc{
	public int d = 30;
	
}

class def{
	private int d = 30;
	
	int get_d(){
		return d;
	}
	
}



public class people{
	public static void main(String [] args) {
		zxy obj = new zxy();
		abc obj1 = new abc();
		abc obj2 = new abc();
		
		System.out.println(obj.d);
		System.out.println(obj1.d);
		System.out.println(obj2.d);
		
	}
}