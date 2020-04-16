package package1;

public class class_2

{
	static int a=123;
    public static void main(String[] args) 

{
	class_1.a=a+1;
	System.out.println("value of class_1.a"+ class_1.a);
	class_1 obj=new class_1();
	obj.a=a+1;
	System.out.println("value of obj.a"+obj.a);
}
	
}
