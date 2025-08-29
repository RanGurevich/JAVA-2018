public class BankAccount {
private String accountName; // The account name
private String accountNum; // The account number
private double balance; // The account balance
private  boolean isOverDraftAllowed; // If over draft can be allowed in the account
private double overDraftSum; // If there is over draft

public BankAccount(){
	
	// Constractor without parameters
	this.accountName="Account";
	this.accountNum="000001";
	this.balance=0;
	this.isOverDraftAllowed=false;
	this.overDraftSum=0;
}
public BankAccount(String accountName, String accountNum, double balance, boolean isOverDraftAllowed, double overDraftSum){
	
	// Constactor with parameters
	this.accountName=accountName;
	this.accountNum=accountNum;
	this.balance=balance;
	this.isOverDraftAllowed=isOverDraftAllowed;
	this.overDraftSum=overDraftSum;
}
public void desposit(double moneyToAdd){
	
	// Input: The method gets how much money to add to the account
	// Output: The program add the money to the account, If the money amount is negative the program print the
	// desposit failed.
	if (moneyToAdd>0)
	{
		this.balance+=moneyToAdd;
	}
	else {
		System.out.println("The desposit cannot be negative");
	}
}
public double withdrawal(double moneyToUse)
{
	// Input: The method gets how much to withdrawal
	// Output: The method returns how much money is withdrawal
	
	if (moneyToUse<0)
	{
		System.out.println("The money amount cannot be negative.");
		return 0;
	}
	if (moneyToUse<=this.balance)
	{
		this.balance-=moneyToUse;
		return moneyToUse;
	}
	if (this.isOverDraftAllowed && overDraftSum>=moneyToUse){
		this.balance-=moneyToUse;
		return moneyToUse;
	}
        if (!isOverDraftAllowed) {
        double saveOldBalance=this.balance;
	this.balance=0;
	return saveOldBalance;
    }
this.balance-=moneyToUse;
return moneyToUse;      
    }
	
	public void print(){

	// Printing account information and balance
	System.out.println("Account name: " +this.accountName+" \n Account number: "+this.accountNum+
	"\n Total Balance: "+this.balance);
	}

}