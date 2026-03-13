package CLL;

public class LaunchBANK 
{
	public static void main(String[] args) 
	{
		HSBCBank bank1=new HSBCBank(4000);
		HSBCBank bank2=new HSBCBank(4000);
		HSBCBank bank3=new HSBCBank(4000);
		
		GooglePay gpay=new GooglePay(bank1);//new Thread
		gpay.setName("GOOGLEPAY");
		
		
		PhonePe phonePe=new PhonePe(bank2);//new Thread
		phonePe.setName("PHONEPE");
		
		ATM atm=new ATM(bank3);//new Thread
		atm.setName("ATM");
		
		gpay.start();
		phonePe.start();
		atm.start();
		
		
		
	}

}
