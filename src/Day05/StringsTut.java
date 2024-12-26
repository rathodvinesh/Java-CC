package Day05;

import java.util.Locale;

public class StringsTut {
    public static void main(String[] args) {
        String str1 = "hello world";
        System.out.println(str1.equals("hello"));
        System.out.println(str1.compareTo("Hello"));
        System.out.println(str1.equalsIgnoreCase("HELLO"));
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str1.trim());
        System.out.println(str1.substring(1,5));
        System.out.println(str1.charAt(3));
        System.out.println(str1.replace("l","m"));
        System.out.println(str1.startsWith("h"));
        System.out.println(str1.endsWith("o"));
        String[] s = str1.split(" ");
        for(String a:s){
            System.out.print(a);
        }
    }
}
