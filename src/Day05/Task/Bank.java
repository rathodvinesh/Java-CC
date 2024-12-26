package Day05.Task;

class AccCreation{
    private String name;
    private int age;
    private int initialBalance;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public void createAcc() throws Exception{
        if(age<18){
            throw new Exception("User is Minor");
        }else if(initialBalance<0){
            throw new Exception("Initial amount should be greater than 0");
        }else{
            System.out.println("Account Creates Successfully.\nWith name "+name+" age "+age+" and initial balance of "+initialBalance+" Rs.");
        }
    }
}

public class Bank {
    public static void main(String[] args) {

        AccCreation obj = new AccCreation();
        obj.setName("Vinesh");
        obj.setAge(18);
        obj.setInitialBalance(1200);



        try{
            obj.createAcc();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
