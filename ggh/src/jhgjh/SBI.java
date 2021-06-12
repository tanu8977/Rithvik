package jhgjh;

public class SBI implements LOAN{
	
	public static void main(String[] args)
	{
		
		//RESULT WILL BE BEHAVIOUR OF THE CHILD CLASS NOT THE BASE CLASS BECAUSE E OVERRIDE METHODS
		SBI home = new SBI();
		home.homeLoanIntRate();
	}
	
	
	public void homeLoanIntRate()
	{
		System.out.println("Home loan Int rate is 9%");
		
	}


	public void homeloan() {
		// TODO Auto-generated method stub
		
		System.out.println("mhdgj");
		
	}


	public void carloan() {
		// TODO Auto-generated method stub
		System.out.println("mnbv");
		
	}


}
