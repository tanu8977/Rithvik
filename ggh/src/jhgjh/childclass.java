package jhgjh;

public class childclass extends baseclass {
	
//PARENT CHILD U CAN USE SUPER SAME DATA
	
	int int_rate=10;
	
	public static void main(String[] args){
		childclass obj1 = new childclass();
		//System.out.println(obj1.int_rate);
		obj1.showmeintratefrompvt();
	}
	
	public void showmeintrate()
	{
		System.out.println("I am in child class");
	}
	
	public void showmeintratefrompvt()
	{
		super.showmeintrate();
		System.out.println("hss"+int_rate);
	}
}
