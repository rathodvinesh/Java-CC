package Day04.Interface;

interface Animal{
    void sound();
}

class Cat implements Animal{
    @Override
    public void sound(){
        System.out.println("Meow");
    }
}

public class Inter {
    public static void main(String[] args) {
        Animal obj = new Cat();
        obj.sound();
    }
}
