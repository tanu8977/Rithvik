package jhgjh;

public class ICICI {
	
	public static void main(String[] args)
	{
		
		//RESULT WILL BE BEHAVIOUR OF THE CHILD CLASS NOT THE BASE CLASS BECAUSE E OVERRIDE METHODS
		ICICI home = new ICICI();
		home.homeLoanIntRate();
	}
	
	
	
	//U CAN ONLY CALL BASE CLASS METHOD WHEN U CREATE REFERENCE AND OBJECT OF THE PARENT CLASS
	public void homeLoanIntRate()
	{
		System.out.println("Home loan Int rate is 19%");
		
	}


}


