package com.Bank;

public class LoanAccount implements Account{
   static final long account_Number=12345678919L;
   double totalBalance=100000;
   double target=500000;
   
	@Override
	public void withdraw(double amount) {
		String action=" CREDITED ";
		if (totalBalance+amount<=target) {
			totalBalance=totalBalance + amount;
			balanceDisplay(amount,action );
		} else {
            System.err.println("Dear user Your limit is exceeding "
          + "as your requesting "+amount+" because your "
         + "loan is already "+totalBalance+" and remaining "
         		+ "loan amount is "+(target-totalBalance));
		}
	}

	@Override
	public void deposite(double amount) {
		String action=" DEBITED ";
		if (amount<=totalBalance) {
			totalBalance =totalBalance-amount;
		balanceDisplay(amount, action);
		} else {
           System.out.println("Dear user cross check Total balance and Pay..!!");
		}
	}

	@Override
	public void balanceEnquiry() {
		System.out.println("Total Balance:"+totalBalance);
	}

	public void balanceDisplay(double amount,String action)
	{
		System.out.println("Dear QJSpiders Bank user rupees "+amount+" is "
	 +action+" and the account number "+account_Number+" on 08-01-2024 , "
	 		+ "Total balance :"+totalBalance);
	}
}
