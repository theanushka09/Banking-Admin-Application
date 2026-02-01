package BankAccountApp;

public class SavingAcc extends Account{
	private int depId;
	private int depKey;
	
	//constructor to initialize salary acc properties
		public SavingAcc(String name, String secNo, double dep) {
			super(name, secNo, dep);
			accNo ="SV"+accNo;
			setDepAcc();
			
		}
	
		//overriding showInfo() of Account class
		public void showInfo() {
			System.out.println("Account Type: Saving Account");
			super.showInfo();
			System.out.println(
					"Deposit Box ID: "+depId+
					"\nDeposit Box Pin: "+depKey);
		}
		
		//creating depId and depKey
		private void setDepAcc() {
			depId= (int)(Math.random()*Math.pow(10, 4));
			depKey= (int)(Math.random()*Math.pow(10, 3));
		}
		
		@Override
		public void setRate() {
			rate= getBaseRate()-0.25;		
		}

}
