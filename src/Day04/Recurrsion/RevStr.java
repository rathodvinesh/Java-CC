package Day04.Recurrsion;

public class RevStr {


    static String Rev(String str,int indx){

        if(str==null || indx<=0){
            return "";
        }

        return str.charAt(indx-1)+Rev(str,indx-1);
    }

    public static void main(String[] args) {
//        Rev("vinesh",6);
        System.out.println(Rev("vinesh",6));
    }
}
