package Day02;

class xyz {
	private int x = 25;
	private int y = 30;
	
	int get_x() {
		return x;
	}
	int get_y() {
		return y;
	}
	int set_x(int x) {
		this.x =x;
	    return x;
	}
	int set_y(int y) {
		this.y =y;
		return y;
	}
}

public class AccessModifiers extends xyz {

	public static void main(String[] args) {
		xyz obj = new xyz();
		System.out.println(obj.get_x());
		System.out.println(obj.get_y());
		
		System.out.println(obj.get_x());
		System.out.println(obj.set_y(56));
		System.out.println(obj.get_x());
		System.out.println(obj.get_y());
		
			

	}

}
