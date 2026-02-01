package BankAccountApp;

public abstract class Account implements IntRate{
	//common properties for savings and salary accounts
	private String name;
	protected String accNo;
	private String secNo;
	private Double balance;
	protected Double rate;
	private static int index = 10000;
	
	
	//constructor to set base prop and initialize acc no
	public Account(String name, String secNo, double dep) {
		this.name= name;
		this.secNo = secNo;
		this.balance= dep;
		index++;
		this.accNo= generateAccountNo();
		setRate();
	}
	
	private String generateAccountNo() {
		String accNo;
		String last2ofssn= secNo.substring(secNo.length()-2, secNo.length());
		int unique5 = index ;
		int rand3 = (int)(Math.random()*Math.pow(10, 3));
		accNo= last2ofssn+unique5+rand3;	
		return accNo;
	}
	
	//subclasses must implement this method 
	public abstract void setRate();
	
	public void showInfo() {
		System.out.println(
				"Name: "+name+
				"\nAccount No: "+accNo+
				"\nBalance: "+balance+
				"\n%Rate: "+rate);
	}
	
	public void deposit(double amt) {
		balance= balance+amt;
		printBalance();
	}
	
	public void withdraw(double amt) {
		balance= balance-amt;
		printBalance();
	}
	
	public void transfer(String to, double amt) {
		balance= balance - amt;
		System.out.println("Transfering "+amt+" to "+to);
		printBalance();
	}

	public void printBalance() {
		System.out.println("Your Balance is "+balance);
	}
	
	public void compoundInt() {
		double accuredInt= balance* (rate/100);
		balance= balance+accuredInt;
		System.out.println("Accured Interest: "+accuredInt);
	}

}
