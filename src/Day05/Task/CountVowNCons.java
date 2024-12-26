package Day05.Task;

import java.util.*;

public class CountVowNCons {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String inp = sc.next();
        int v=0;
        int c=0;

//        String[] vow = {"a","e","i","o","u"};
        String vow = "aeiouAeiou";
//        String cons = "bcdfghjklmnpqrstvwxyz";

        for(int i=0;i<inp.length();i++){
            char ch = inp.charAt(i);
            if(vow.indexOf(inp.charAt(i))==-1){
                v++;
            }else if(ch!=' '){
                c++;
            }
        }

        System.out.println(v);
        System.out.println(c);



    }
}
