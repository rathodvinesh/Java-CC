package Day04.Abstraction;

abstract class Employee{

    String name;
    int id;

    Employee(String name, int id){
        this.name=name;
        this.id=id;
    }

    abstract void calcSalary();
    abstract void getDetails();
}

class FullTimeEmployee extends Employee{

    FullTimeEmployee(String name,int id){
        super(name,id);
    }
    @Override
    void calcSalary(){
        System.out.print("60000");
    }

    @Override
    void getDetails(){
        System.out.println(this.name+" "+this.id);
    }
}

class PartTimeEmployee extends Employee{

    PartTimeEmployee(String name,int id){
        super(name,id);
    }
    @Override
    void calcSalary(){
        System.out.print("30000");
    }

    @Override
    void getDetails(){
        System.out.println(this.name+" "+this.id);
    }
}

public class EMS {
    public static void main(String[] args) {

    }
}
