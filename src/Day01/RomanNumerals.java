package Day01;
import java.util.Scanner;
public class RomanNumerals {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Roman Numerals");
		String s = scan.nextLine();
		s.toUpperCase();
		System.out.println(s.length());
		int num=0;
		char c,nc;
		for( int i=s.length()-1;i>=0;i--){
			System.out.printf(s.charAt(i)+" ");
			c = s.charAt(i);
			nc = c;
			System.out.printf(s.charAt(nc)+" ");
        }
		scan.close();
	}	
}
