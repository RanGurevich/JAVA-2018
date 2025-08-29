
import checkbank.BankAccount;


public class TestBankAccount {
	private BankAccount test; // The object to test
	
	public TestBankAccount(BankAccount test) {
		
		// Constractor with object
	this.test=test;
	}
	public  TestBankAccount() {
		
		// Testing with defult options
		this.test=new BankAccount();
	}

	public void testDesposit(double toAdd)
	{
		this.test.desposit(toAdd);
	}
	public void testWithdrawal(double money){
		this.test.withdrawal(money);
	}
	public void testPrint(){
		this.test.print();
	}
	
	
}
