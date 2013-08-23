
public class BankAccount {
	
	//Declaring Variables
	private int accountNumber;
	private String name;
	private int accountBalance;
	private float monthlyFee;
	private int explainAccountPolicy;
	
	
	//Over-Loaded Constructors
	public BankAccount( int aNumber, int aBalance, float mFee, int accountPolicy, String owner) {
		this.accountNumber = aNumber;
		this.name = owner;
		this.monthlyFee = mFee;
		this.explainAccountPolicy = accountPolicy; 
		this.accountBalance = aBalance;
	}
	//Constructors
	public BankAccount() {
		this(0,0, -4.00, -4, new String);
	}
	
	public int getBankAccountAccountNumber() {
		return accountNumber;
	}
	
}
