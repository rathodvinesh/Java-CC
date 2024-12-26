package Day05.Task;

public class Tables {

    static void twoTable(int n) throws ArithmeticException {
        if(n<2 || n>10){
            throw new ArithmeticException("The value of n "+n+" is less than 2 or greater than 10");
        } else{
            for(int i=1;i<=10;i++){
                System.out.print(n+"*"+i+"="+(n*i)+"\n");
            }
        }
    }

    public static void main(String[] args)  {
        try{
            twoTable(11);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
    }
}
