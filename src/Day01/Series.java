package Day01;

import java.util.Scanner;
public class Series {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
         long term=a+b;
         System.out.print(term + " ");
         
        for(int c=1;c<=n;c++) {
            term= (long) (term+Math.pow(2, c)*b);
            System.out.print(term + " ");
        }
        System.out.println();
        }
        in.close();
	}

}
