package Day01;
import java.util.Scanner;
public class Hackerank_If_Else {

	public static void main(String[] args) {
		Scanner o = new Scanner(System.in);
		
		System.out.println("Enter a number to be checked");
		int num = o.nextInt();
		o.close();
		
		if(num<=1 && num>=100) {
			System.out.println("Error");
		}
		
		if(num%2==0) {
			if(num>=2 && num<=5) {
				System.out.print("Not Weird");
			}
			else if(num>=6 && num<=20) {
				System.out.println("Weird");
			}
			else if(num>20) {
				System.out.println("Not weird");
			}
		}
		else System.out.println("Weird");
		
	}

}
