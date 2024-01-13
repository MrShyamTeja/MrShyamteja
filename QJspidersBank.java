package com.Bank;
import java.util.Scanner;
public class QJspidersBank {
	static String account_holder_Name="Sainath";
	static int mPin=1431;
	static long mbnumber=9876543210L;
	
	static{
		System.out.println("Welcome to QJspiders Bank");	
	}
	
	{
		System.out.println("OTP are for your account security ...so dont share with your gf/bf also...else Govinda....");
	}
   public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("eneter your account holder name");
	   String name=scanner.nextLine();
	   System.out.println("enter the 4 digit pin number");
	   int pinnum=scanner.nextInt();
	   //validation of pin number and holder name
	   if (mPin==pinnum && account_holder_Name.equals(name)) {
		   System.out.println("enter your mobile number");
		    long mbno=scanner.nextLong();
		    if (mbno==mbnumber) {
				int otp=OTPGenarate.otp();
				System.out.println("OTP:"+otp);
				QJspidersBank q=new QJspidersBank();
				System.out.println("enter the otp");
				int extOtp=scanner.nextInt();
				//otp validation
				if (otp==extOtp) {
					 System.out.println(" choose the Account type");
					 System.out.println(" 1.Saving Account");
					 System.out.println(" 2.Loan Account");
					 int accountType=scanner.nextInt();
					    switch (accountType) {
					           case 1: {
						                  Savingaccount s=new Savingaccount();
						                  System.out.println("choose the option");
						                  System.out.println("1.withdraw");
						                  System.out.println("2.deposite");
						                  System.out.println("3.balanceEnquiry");
						                  int option=scanner.nextInt();
						                  //saving account
						                  switch (option) {
										     case 1 : {
											          System.out.println("enter the amount");
											          double amount=scanner.nextDouble();
											          s.withdraw(amount);
		       
										            } break;
										     case 2 : {
										    	 System.out.println("enter the amount");
										          double amount=scanner.nextDouble();
										          s.deposite(amount);
													
									            } break;
										     case 3: {
													s.balanceEnquiry();
													
									            } break;
										default: System.out.println("you have entered wrong option ..."
												+ "please check");
											
										}
						
					                    } break;
					           case 2: {
									      LoanAccount l=new LoanAccount(); 
									      System.out.println("choose the option");
						                  System.out.println("1.withdraw");
						                  System.out.println("2.deposite");
						                  System.out.println("3.balanceEnquiry");
						                  int option=scanner.nextInt();
						                  //Loan account
						                  switch (option) {
										     case 1 : {
											          System.out.println("enter the amount");
											          double amount=scanner.nextDouble();
											          l.withdraw(amount);
		       
										            } break;
										     case 2 : {
										    	 System.out.println("enter the amount");
										          double amount=scanner.nextDouble();
										          l.deposite(amount);
													
									            } break;
										     case 3: {
													l.balanceEnquiry();
													
									            } break;
										default: System.out.println("you have entered wrong option ..."
												+ "please check");
											
										}
			                           } break;
      default:System.out.println("please Dear Qjspider Bank user cross "
					        + "check the Account type and enter");
						 
					     }
				} else {
            System.err.println("Invalid OTP..please enter correct otp");
				}
				
			} else {
                System.err.println("Invalid Mobile Number");
			}
	   }else {
		   System.err.println("Invalid Pinnuber/holdername");
	   }
   }
}
