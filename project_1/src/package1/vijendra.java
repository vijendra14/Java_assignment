package package1;

import java.util.Scanner;

public class vijendra
{


	public int sum(int a, int b) 
	{
       int c;
       c=a+b;
       return c;	
}    
   public int sub(int d, int e)
   {
	   int f;
	   f=d-e;
      return f;
	   
   }
    public int mul(int g, int h)
{
	int i;
	i=g*h;
	return i;
	
}
   public void div(int j, int k)
   {
	   int l;
	    l=j/k;
	    
	    System.out.println("result" +l);
   }
	public static void main(String[] args) 
	
	{
	
		Scanner s=new Scanner(System.in);
		System.out.println("please enter value of x1");
		int x1=s.nextInt();

	   System.out.println("please enter value of x2");
	   int x2=s.nextInt();  

	   
	   System.out.println("please enter value of x3");	   
	   int x3=s.nextInt();

	   System.out.println("please enter value of x4"); 
	   int x4=s.nextInt();

	   
	   System.out.println("please enter value of x5");	   
	   int x5=s.nextInt();
	   
	vijendra vijendra=new vijendra ();
	
	 int sum_result=vijendra.sum(x1, x2);
	
	 int sub_result=vijendra.sub(sum_result, x3);
	
	 int sum_result2=vijendra.sum(sub_result, x4);
	
	 int mul_result=vijendra.mul(sum_result2, x5);
	
	 vijendra.div(mul_result, x5);
	
	
		
	}
	
}


	
	
	



