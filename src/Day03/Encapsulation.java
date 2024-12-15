package Day03;

class xyz{
//	default int u=10;
	private int x = 10;
	private int y=10;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
}

public class Encapsulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		xyz obj = new xyz();
		
		System.out.println(obj.getX());
//		System.out.println(obj.y);
	}

}
