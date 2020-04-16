package package1;

public class class_4 


{
	static int a=24;
	public static void main(String[] args) {
     
	     class_3 obj=new class_3();
   	     obj.a=a+1;
   	     System.out.println("value of obj.a"+obj.a);

		 class_3.a=a+1;
		 System.out.println("value of class_3.a"+ class_3.a);
	}

}
