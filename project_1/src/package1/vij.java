package package1;

public class vij {

   public void method1( int a,int b,int c,int d)
{
	   
   System.out.println("4 parameterized method");
   this.method2();
   this.method3(11);
   this.method4(33,44,55);
   this.method5(88,99);
}

 public void method2()
 {
	 System.out.println("default method");
 }
   public void method3(int a) 
   {
	System.out.println("1 parameterized method");   
   }
   public void method4(int a, int b, int c) 
   {
	   System.out.println("3 parameterized method");
   }
   public void method5(int a, int b) 
   {
	System.out.println("2 parmaeterized method");   
   }
    public static void main(String[] args) 
    {
    	vij vijendra=new vij();
    	vijendra.method1(11,12,13,14);
    	
    	
	}
      
	}
   



