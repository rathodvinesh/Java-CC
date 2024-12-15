package Day04.Task;

public class BankingAccount {
	int accN =0;
	double accBal=0;
	
	BankingAccount(int accN,double accBal){
		this.accN = accN;
		this.accBal = accBal;
	}
	void deposit(double val) {
		accBal =+ val;
	}
	void deposit(double val, char currency) {
		accBal =+ val;
	}
	void deposit(double val,String currency,boolean notify) {
		accBal =+ val;
		
		if(notify==true) {
			System.out.println("Account is updated");
		}
			
	}
	void withdraw(double val) {
		accBal =- val;
	}
}
class savingA extends BankingAccount{
	savingA(int accN,double accBal){
		super(accN,accBal);
	}
	double calInt() {
		double interest = super.accBal*0.04;
		return interest;
	}
	
}
class currentA extends BankingAccount{
	currentA(int accN,double accBal){
		super(accN,accBal);
	}
	double prrOver() {
		if(super.accBal<2000) {
			return super.accBal-150;
		}
			return super.accBal;
		}
	}
class execute{
	public static void main() {
		savingA obj = new savingA(111,2000);
		obj.deposit(200);
		obj.withdraw(0);
		obj.calInt();
		currentA obj1 = new currentA(111,2000);
		obj1.deposit(200);
		obj1.withdraw(0);
		obj1.prrOver();
	}
}
