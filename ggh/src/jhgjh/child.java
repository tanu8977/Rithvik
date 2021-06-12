package jhgjh;

public class child extends parent {
	
	public static void main(String[] args)
	{
		
		//OBJ MATTERS AND REFERENCE
		child obj = new child();
		obj.display();
		
		//IT IS GOING TO CALL DISPLAY IN CHILD AND DISPLAY IN PARENT BECAU THEY HAVE SAME SIGNATURE
		//THE ONLY WAY TO CALL THE PARENT CLASS IS TO HAVE A REFERENCE OF parent
		parent obj2 = new parent();
		obj2.display();
		
		
		//NO MATTER EVEN IT REFER TO PARENT IT STILL CALL DISPLAY METHOD IN PARENT CHILD
		parent obj3 = new child();
		obj3.display();
		
		//YOU CANNPT STORE PARENT CLASS OBJ IN TO CHILD CLASS REFERENCE
		//child obj3 = new parent();
				
	}
	
	//METHOD OVERRIDING SINCE IT HAS THE SAME SIGNATURE SAME METHOD
	public void display()
	{
		System.out.println("I AM IN CHILD CLASS");
	}
	
	
	
	//NOW THE JAVA IS NOT DETECTING BECAUSE IT HAS ARGUMENTS NOW
	public void display(String name)
	{
		System.out.println("I AM IN CHILD CLASS");
	}

}
