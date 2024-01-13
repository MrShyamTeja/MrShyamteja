package com.Bank;

public class Savingaccount implements Account {
  static final long account_Number=98765432121L;
  double TotalBalance=2000.00;
	
  @Override
	public void withdraw(double amount) {
	  String action=" DEBITED ";
		if (TotalBalance>=amount) {
			TotalBalance=TotalBalance-amount;
			balanceDisplay(amount, action);
		} else {
          System.err.println("Insufficient Fund");
		}
	}

	@Override
	public void deposite(double amount) {
		String action=" CREDITED ";
       if (amount<100000) {
		TotalBalance =TotalBalance+amount;
		balanceDisplay(amount, action);
	} else {
       System.err.println("You have Exceeding the maximum limit..."
       		+ "so try to pay lesser than 100000");
	}
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("TotalBalance:"+TotalBalance);
	}

	public void balanceDisplay(double amount,String action)
	{
		System.out.println("Dear QJSpiders Bank user rupees "+amount+" is "
	 +action+" and the account number "+account_Number+" on 08-01-2024 ,"
	 		+ " Available balance :"+TotalBalance);
	}

}
