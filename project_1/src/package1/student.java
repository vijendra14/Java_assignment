package package1;

public class student 
{
	public student (int a, int b, int c, int d)
	{
		System.out.println("four parameterized constructor with a "+a +" b "+b +" c"+c +" d "+d);	
	}		
	public student ()
	{
		
		System.out.println("default constructor");
	}
	
     public student (int a, int b)
{
	System.out.println("two parameterized constructor");
}
     public student(int a)
     {
   System.out.println("one parameterized constructor");
}
     public student (int a, int b, int c)
     {
    	 System.out.println("three parameterized constructor");
     }
     public static void main(String[] args) 
    {
		student a=new student(11,12,44.45);
		student b=new student();
		student c=new student(22,23);
		student d=new student (55);
		student e=new student(31,32,33);
		
		
	}
     
}
