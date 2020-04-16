package package1;

public class class_1 
{
	static int a=12;
    public static void abc()    
    {
    	a=a+1;
    	System.out.println("I am static mathod");	
    }    
    public static void main(String[] args) {
		a=a+1;
		System.out.println("value of a"+ a);
		class_1 obj=new class_1();
		obj.a=a+1;
		System.out.println("value of obj.a"+ obj.a);
		class_1.a=a+1;
	    System.out.println("value of class_1.a"+class_1.a);
				
	}
}

