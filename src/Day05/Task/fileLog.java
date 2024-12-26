package Day05.Task;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class fileLog {
    public static void main(String[] args) {
            File file = new File("ABC.txt");

            try{
                System.out.println(12/0);
            }catch (Exception e){
                try{
                FileWriter fw = new FileWriter(file.getName());
                fw.write(e.getMessage());
                fw.close();
                }catch (Exception er){
                    System.out.println(er.getMessage());
                }

            }

//            try{
//                Scanner sc = new Scanner(file);
//                while(sc.hasNextLine()){
//                    String currWord = sc.next();
////                    System.out.println(sc.next());
//                    if(currWord.equals("how")){
//                        System.out.println("true");
//                    }else{
//                        System.out.println("false");
//                    }
//                }
//            }catch (Exception e){
//                System.out.println(e.getMessage());
//            }
//            finally {
//                file.delete();
//            }



//        System.out.println(file.length());
//        try{
//            if(file.createNewFile()){
//                FileWriter fw = new FileWriter("ABC.txt");
//                try{
//                    if(file.length()>29){
//                        fw.write("Created the file successfullyy");
//                    }
//                    file.length();
//                    fw.close();
//
//                }catch (IOException e){
//                    fw.write(" "+e);
//                    fw.close();
//                }
//            }
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//
//        }
//        finally {
//            file.delete();
//        }
    }
}
