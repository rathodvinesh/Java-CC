package Day01;

import java.util.Scanner;

public class TrianglePatStar {

	public static void main(String[] args) {

	}
	
	 public void trianglepatstar() {
		 Scanner sc = new Scanner(System.in);
		 System.out.printf("Enter no of stars in each row");
		 int n = sc.nextInt();
		 sc.close();

		 for (int i = 0; i <= n; i++) {
			 for (int j = 0; j < i; j++) {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

//	public static void main(String[] main) {
//			TrianglePatStar obj = new TrianglePatStar();
//			obj.trianglepatstar();
//		    }
//
//	}
	 }

}
