package BankAccountApp;

//since interest rates are coming from outside of this project
public interface IntRate {
	default double getBaseRate() {
		return 7.75;
	}

}
