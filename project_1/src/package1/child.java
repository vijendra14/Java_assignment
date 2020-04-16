package package1;

public class child extends Parent

{
	public child(int a, int b, int c, int d) 
	
	{	
		super(11,14);
		
		System.out.println("Child 4 parameterized constructor");
	}
	
	public child() 
	{
		this(22,33,44,55);
		System.out.println("Child default constructor");
	}
	
	public child(int a)
	{
		this();
		System.out.println("Child 1 parameterized constructor");
		
	}

      public child(int a, int b) 
      {
    	  this(11);
    	  System.out.println("Child 2 parameterized constructor");
      }
      public static void main(String[] args) 
      
      {
		child obj=new child(11,12);
		

	    
				}
      
}
