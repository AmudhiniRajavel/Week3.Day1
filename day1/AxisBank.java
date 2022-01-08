package week3.day1;

public class AxisBank extends BankInfo{
	public void deposit() {
		System.out.println("Deposit in Axis Bank");
	}

public static void main(String[] args) {
	
	AxisBank bank = new AxisBank();
	bank.deposit();
	
	BankInfo bank1 = new BankInfo();
	bank1.deposit();
}
}
