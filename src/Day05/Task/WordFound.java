package Day05.Task;

import java.io.File;
import java.util.Scanner;

public class WordFound {
    public static void main(String[] args) {
        File file = new File("ABC.txt");
        try{
            Scanner sc = new Scanner(file);
            a:
            while(sc.hasNextLine()){
                String word = "how";
                String[] currWords = sc.nextLine().split(" ");
                b:
                for(String i:currWords){
                    if(i.equals(word)){
                        System.out.println("True");
                        break a;
                    }else{
                        System.out.println("False");
                        break b;
                    }
                }
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
