package Day01;
import java.util.Scanner;
public class Scanner_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		float num2 = sc.nextFloat();
		short num3 = sc.nextShort();
		sc.nextLine();
		String str = sc.nextLine();
		
		
		System.out.printf("the numbers are %d %f %d %s",num1,num2,num3,str);
		sc.close();
	}

}
