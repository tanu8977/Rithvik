package jhgjh;

public class mydr {
	static int x;
	static int y;
	
	
	//IF THIS IS NOT THIS VARIABLES ARE TOTALLY INDEPENDENT THEY ARE NOT AFFECTED 
	public mydr(int x,int y)
	{
		
		this.x=x;
		y=this.y;
	}
public void sum()
{
	// X AND Y NOT POINTING TOCONSTRUCTOR THEY R STILL POINTING INTX,Y
	int sum = x+y;
	System.out.println(sum);
	
}

public static void main(String[] args)
{
	mydr obj1 = new mydr(10,50);
	obj1.sum();
	int sum = x+y;
}


}
