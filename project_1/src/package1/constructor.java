package package1;

public class constructor 

{
	public constructor (int a, int b, int c, int d)
	{
		
		System.out.println("four parameterized constructor");
		
	}
	public constructor ()
	{
		this(44,55,66,77);
		System.out.println("default constructor");
	}
	
     public constructor (int a, int b)
{
    	 this(); 
	System.out.println("two parameterized constructor");
}
     public constructor (int a)
     {
    	this(11,22);
   System.out.println("one parameterized constructor");
}
     public constructor (int a, int b, int c)
     {
    	 this(11);
    	 System.out.println("three parameterized constructor");
     }
     public static void main(String[] args) 
    {
    	 constructor s=new constructor (13,14,12);	
		
	}
     
}


