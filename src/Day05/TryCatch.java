package Day05;

class myEx extends Exception{
//    myEx(){
//        super();
//    }

    myEx(String msg){
        super(msg);
    }
}

public class TryCatch {

    static void div(){
        int a=8;
        int b=2;
        System.out.println(a/b);
    }

    static void ageInt(int age) throws myEx{
        if(age<18){
            throw new myEx("Age is less than required criteria");
        }
        System.out.println(age);
    }

    public static void main(String[] args) {

        int x=0,y=0;
//        div();
        try {
            ageInt(16);
        }catch(myEx e){
//            e.getMessage();
//            System.out.println(e.getMessage());
//            e.printStackTrace();
        }
        finally {
            System.out.println(x+y);
        }
    }
}
