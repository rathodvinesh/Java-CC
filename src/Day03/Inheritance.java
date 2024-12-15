package Day03;
import java.util.Scanner;

class Area{
	int a;
	int b;
	
	void areaOfRectangle() {
		Scanner sc= new Scanner(System.in);
		a=sc.nextInt();
		b= sc.nextInt();
		int res=a*b;
		
		System.out.println("Area of rectangle "+res);
	}
}


public class Inheritance{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		areaOfRectangle();
		Area obj = new Area();
		obj.areaOfRectangle();
	}

}
