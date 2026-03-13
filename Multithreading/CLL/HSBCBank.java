package CLL;

public class HSBCBank 
{
	 static int accountBal;
	
	public HSBCBank(int accountBal)
	{
		this.accountBal=accountBal;
	}
	
	synchronized static public void deposit(int deposit)
	{
		accountBal=accountBal+deposit;
	}
	
	synchronized static public void withdrawal(int withdraw)
	{
		accountBal=accountBal-withdraw;
	}
	synchronized static public void balanceCheck()
	{
		System.out.println("The Balance in the account is : "+ accountBal);
	}
}
