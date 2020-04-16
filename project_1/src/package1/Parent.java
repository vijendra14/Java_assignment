package package1;

public class Parent 

{
    public Parent(int a, int b, int c)
 
 {
    	
	 System.out.println("Parent 3 parameterized constructor");
 }
    public Parent() 
    {
        this(11, 12, 13);
		System.out.println("Parent default constructor");	
	}
    
   public Parent (int a) 
   {
	this();
	System.out.println("Parent 1 parameterized constructor");   
   }
   
   public Parent(int a, int b) 
   {
	   this(11);
	   System.out.println("Parent 2 parameterized constructor");
	   
   }
   
	 
}
   
