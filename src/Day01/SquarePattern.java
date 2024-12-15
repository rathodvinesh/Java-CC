package Day01;

import java.util.Scanner;

class Triangle{
	 public void display() {
	    	Scanner sc = new Scanner(System.in);
			System.out.printf("Enter no of stars in each row");
			int n = sc.nextInt();
			sc.close();
			
			for(int i=0;i<=n;i++) {
	    		for(int j =0;j<i;j++) {
	    			System.out.printf("*");
	    		}
	    		System.out.println();
	    	}
}

public class SquarePattern extends Triangle {
	SquarePattern(){
		super();
	}
	@Override
    public void display(){
		super.display();
    	Scanner sc = new Scanner(System.in);
		System.out.printf("Enter no of stars in each row");
		int n = sc.nextInt();
		sc.close();
		
    	for(int i=0;i<n;i++) {
    		for(int j =0;j<n;j++) {
    			System.out.print("*");
    		}
    		System.out.println();
    	}
    }
  		
    }

class TriangleRev extends SquarePattern{
	TriangleRev(){
		super();
	}
	@Override
	 public void display() {
			super.display();
	    	Scanner sc = new Scanner(System.in);
			System.out.printf("Enter no of stars in first row");
			int n = sc.nextInt();
			sc.close();
			
			for(int i=n;i<=0;i--) {
	    		for(int j =0;j<i;j++) {
	    			System.out.printf("*");
	    		}
	    		System.out.println();
	    	}
}	
    }
    
	public static void main(String[] args) {
//		TriangleRev obj = new TriangleRev();
//		obj.display();
	}

}
