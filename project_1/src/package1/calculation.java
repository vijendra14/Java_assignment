package package1;

public class calculation 

{
    public int sum(int a, int b) 
{
	int c;
	c=a+b;
	return c;	
}    
    public int sub (int d,int e)  
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
    	
    	System.out.println("result "+l);
    }
    
    public static void main(String[] args) 
    
    {
   calculation ob=new calculation();
   
        int sum_result=ob.sum(10,2);
        int sub_result=ob.sub(sum_result, 2);
        int sum_result1=ob.sum(sub_result, 2);
        int mul_result=ob.mul(sum_result1, 2);
        ob.div(mul_result, 2);
    }
    

    
    
   
    
    
    
    
    
    
    
}

    
    
    

