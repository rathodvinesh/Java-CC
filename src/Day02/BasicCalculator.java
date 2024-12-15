package Day02;
class Base{
	
	private int x = 0;
	private int y = 0;
	
	int get_x(){
		return x;
	}
	void set_x(int x){
		this.x =x;
	}
	void set_y(int y){
		this.y=y;
	}
}
public class BasicCalculator extends Base {
	int  X,Y;
//	double Add(double set_x(),double y) {
//		X= set_x();
//		return X+Y;
//	}
	double Subtraction() {
		return X-Y;
	}
	double Multiplication() {
		return X*Y;
	}
	double Divison() {
		return X/Y;
	}

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		bc.set_x(10);
		bc.set_y(22);
		bc.Multiplication();
	}

}
