package Day04.Task;

class Print{
    void print(String text){
        System.out.println(text);
    }
}

class ColorPrinter extends Print{
    @Override
    void print(String text){
        System.out.println("Inside color:"+text);
    }

    void print(String text,String color){
        System.out.println(text+" "+color);
    }

    void print(String text,String color,int foniSize){
        System.out.println(text+" "+color+" "+foniSize);
    }

}

public class Printer {
    public static void main(String[] args) {
        ColorPrinter obj = (ColorPrinter) new Print();
        obj.print("Vinesh");
        obj.print("Vinesh","Red");
        obj.print("Vinesh","Yellow",5);
    }
}
