package Day04.Recurrsion;

import java.util.*;

public class fibo {

    static int a=0,b=1,c=0;

//    Integer [] a1={1,2,3,4};
//    List<int[]> arr= List.of(a1);
//    arr.reverse

//    Collections.reverse(Arrays.asList(a1));

//    static int fib(int n){
//        int a=0,b=1,c=0,res;
//        for(int i=1;i<(n-1);i++){
//            c=a+b;
//            a=b;
//            b=c;
//        }
//        return c;
//    }

    static int fib(int n){

        if(n<2){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
//        fib(3);
        System.out.println(fib(0));
    }


}
