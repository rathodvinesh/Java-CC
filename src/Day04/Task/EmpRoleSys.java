package Day04.Task;


interface Role{
    void performDuties(String duty);
}

class Manager implements Role{
    @Override
    public void performDuties(String duty){
        System.out.println("Managerial Task");
    }
}

class Developer implements Role{
    @Override
    public void performDuties(String duty){
        System.out.println("Developer Task");
    }
}

class Tester implements Role{
    @Override
    public void performDuties(String duty){
        System.out.println("Tester Task");
    }
}

public class EmpRoleSys {

    public static void main(String[] args) {
        Role obj = new Tester();
        obj.performDuties("Build software");
    }
}
