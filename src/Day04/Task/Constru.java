package Day04.Task;

public class Constru {

    Constru(String title){
        System.out.println(title);
    }

    Constru(String title,String author){
        System.out.println(title+" "+author);
    }

    Constru(String title ,String author,int price){
        System.out.println(title+" "+author+" "+price);
    }

    public static void main(String[] args) {
        Constru obj = new Constru("Heyy");
        Constru ob1 = new Constru("Heyy","Dinya");
        Constru ob2 = new Constru("Heyy","Dinya",54);
    }
}
