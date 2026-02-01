package BankAccountApp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account> accounts = new LinkedList<Account>();
		
		//read csv file and create new accounts based on data
		String file = "C:\\Users\\anussingh\\Downloads\\NewBankAccounts.csv" ;
		List<String[]> data = Utilities.CSV_functionality.read(file);
		for(String[] account : data) {
			String name = account[0];
			String secNo = account[1];
			String accType = account[2];
			double inideposit = Double.parseDouble(account[3]);
			if(accType.equals("Savings")) {
				accounts.add(new SavingAcc(name, secNo,inideposit));
			}else if(accType.equals("Salary")) {
				accounts.add(new SalaryAcc(name, secNo,inideposit));
			}else {
				System.out.println("Error reading account type");
			}
		}
		
		for(Account acc:accounts) {
			System.out.println();
			acc.showInfo();
		}
	}

}
