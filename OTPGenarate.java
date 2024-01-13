package com.Bank;
import java.util.Random;
public class OTPGenarate {
	 public static int otp()
	 {
		 String str="0123456789";
		 int length=4;
		 char otp1[]=new char[length];
		 Random random=new Random();
		 for(int i=0;i<otp1.length;i++)
		 {
			 int index=random.nextInt(str.length());
			 otp1[i]=str.charAt(index);
			 //otp1[i]=str.charAt(random.nextInt(str.length()));
		 }
		// System.out.println(Arrays.toString(otp1));
		//converting char[] into string type 
		 String s=new String(otp1);
		 //converting string type into int type
		int finalOTP =Integer.parseInt(s);
		//int finalotp=Integer.parseInt(new String(otp1));
	
		 return finalOTP;
	 }
}
