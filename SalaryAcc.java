package BankAccountApp;

public class SalaryAcc extends Account{
	private int cardNo;
	private int cardPin;
	
	//constructor to initialize salary acc properties
	public SalaryAcc(String name, String secNo, double dep) {
		super(name, secNo, dep);
		accNo ="SL"+accNo;
		setDebCard();
	}
	
	//overriding showInfo() of Account class
	public void showInfo() {
		System.out.println("Account Type: Salary Account");
		super.showInfo();
		System.out.println(
				"Debit Card No: "+cardNo+
				"\nCard Pin: "+cardPin);
	}
	
	//set debit card details 
	private void setDebCard() {
		cardNo= (int)(Math.random()*Math.pow(10, 12));
		cardPin= (int)(Math.random()*Math.pow(10, 4));
	}
	
	@Override
	public void setRate() {
		rate= getBaseRate()*0.15;		
	}

}
