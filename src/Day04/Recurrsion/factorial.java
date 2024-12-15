package Day04.Recurrsion;

public class factorial {

    static int fact(int n){
        if(n==1){
            return  1;
        }
        return n*fact(n-1);
    }

    public static void main(String[] args) {
//        fact(5);
        System.out.println(fact(5));
    }
}
