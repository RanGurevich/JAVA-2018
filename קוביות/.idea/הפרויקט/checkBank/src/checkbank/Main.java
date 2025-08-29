package checkbank;
public class Main {

    public static void main(String[] args) {
	// write your code here
        BankAccount check = new BankAccount("Ran","5",543,true,200);
        System.out.println(check.withdrawal(600)); 
        check.print();
    }
}
